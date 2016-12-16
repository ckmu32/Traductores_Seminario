package sample;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.omg.CORBA.IDLTypeHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller implements Initializable {
    @FXML
    CodeArea codeArea;
    @FXML
    TextArea txtMensajes;
    @FXML
    ListView lsErrores;

    public static ArrayList<String> IDList = new ArrayList<>(Arrays.asList());
    public ArrayList<Integer> numLineList = new ArrayList<>(Arrays.asList());
    public static ArrayList<String> AYUDA = new ArrayList<>(Arrays.asList());
    public int cont;

    ObservableList<String> itemsErrores = FXCollections.observableArrayList();
    Hashtable<String, String> semantico = new Hashtable<>();

    private static final String[] KEYWORDS = new String[]{
            "programa", "var", "inicio", "fin", "flotante", "doble", "caracter", "cadena", "mod", "libreria", "verdad", "falso", "seleccion", "si"
            , "sino", "evalua", "por_omision", "finsel", "finsi", "final", "finhazlo", "hazlo_si", "repite", "finrepite", "como", "para"
            , "finpara", "modo", "finfunc", "funcion", "procedimiento", "finproc", "seccion", "bool", "entero", "largo", "byte", "entonces", "de", "libreria"
    };

    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String BRACE_PATTERN = "\\{|\\}";
    private static final String BRACKET_PATTERN = "\\[|\\]";
    private static final String SEMICOLON_PATTERN = "\\;";
    private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    private static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    public void initialize(URL location, ResourceBundle resources) {
        colorPalabras_Reservadas();
        contadorLineas();
    }

    File archivo;

    public void cargarArchivo() throws IOException {
        FileChooser fileChooser = new FileChooser();            //Nos deja seleccionar un archivo a cargar
        fileChooser.setTitle("Seleccione un archivo para cargar");
        archivo = fileChooser.showOpenDialog(new Stage());//Obtenemos ruta

        if (archivo != null) {
            FileInputStream stream = new FileInputStream(archivo);
            //Declaramos el encoding de entrada
            BufferedReader entrada = new BufferedReader(new InputStreamReader(stream, Charset.forName("UTF-8")));

            String linea = null;
            while ((linea = entrada.readLine()) != null) {//Lee archivo y lo pone en el textArea
                codeArea.appendText(linea + "\n");
            }
            entrada.close();

            //txtArea.appendText(rutaArchivo);
            txtMensajes.setText("");
            txtMensajes.setText("Archivo cargado con éxito");
        } else {
            txtMensajes.setText("");
            txtMensajes.setText("Error de carga en archivo");
        }

        /*
        codeArea.appendText("Hola\n");
        codeArea.appendText("Mundo\n");
        codeArea.appendText("Gitano priemra segunda tercera cuarta");
        */
    }

    String contenidoArchivo = new String();

    public void guardarArchivo() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Guardar archivo");

        //Extensión
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        FileChooser.ExtensionFilter extFilter2 = new FileChooser.ExtensionFilter("RTF files (*.rtf)", "*.rtf");
        fileChooser.getExtensionFilters().addAll(extFilter, extFilter2);

        //Muestra dialogo
        archivo = fileChooser.showSaveDialog(new Stage());

        contenidoArchivo = (String) codeArea.getText();//Obtenemos contenido del textArea y la pasamosa string

        if (archivo != null) {
            SaveFile(contenidoArchivo, archivo);
            txtMensajes.setText("");
            txtMensajes.setText("Archivo guardado con éxito");
        } else {
            txtMensajes.setText("");
            txtMensajes.setText("Error en guardado de archivo");
        }

    }

    private void SaveFile(String content, File file) {
        try {
            FileWriter fileWriter = null;

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void guardarRapido() { // Guarda el archivo si previamente fue guardado como. No pregunta
        if (contenidoArchivo.equals("")) {
            txtMensajes.setText("");
            txtMensajes.setText("Primero ocupa guardar como");
        } else {
            String contenido = (String) codeArea.getText();
            SaveFile(contenido, archivo);
            txtMensajes.setText("");
            txtMensajes.setText("Archivo guardado rápido con éxito");
        }
    }

    public void contadorLineas() {
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
    }

    public void colorPalabras_Reservadas() {
        codeArea.richChanges()
                .filter(ch -> !ch.getInserted().equals(ch.getRemoved())) // XXX
                .subscribe(change -> {
                    codeArea.setStyleSpans(0, computeHighlighting(codeArea.getText()));
                });
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
        while (matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                            matcher.group("PAREN") != null ? "paren" :
                                    matcher.group("BRACE") != null ? "brace" :
                                            matcher.group("BRACKET") != null ? "bracket" :
                                                    matcher.group("SEMICOLON") != null ? "semicolon" :
                                                            matcher.group("STRING") != null ? "string" :
                                                                    matcher.group("COMMENT") != null ? "comment" :
                                                                            null; /* never happens */
            assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }

    public void inicializaErrores_Prueba() {
        ObservableList<Integer> items = FXCollections.observableArrayList(1, 2, 3, 4);
        lsErrores.setItems(items);
    }

    public void manejoErrores() {
        int valor = lsErrores.getSelectionModel().getSelectedIndex();
        //Marcado de linea
        codeArea.moveTo(valor, 0);//Primer digito comenzando de 0 indica linea, segundo indica columna
        codeArea.selectLine();//Resalta toda la linea
        //System.out.println(codeArea.getText(2));//Obtenemos el texto de la linea 3 con el getText. SOLO PRUEBA
    }

    public void abrirLexico() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Lexico.fxml"));
        root.getStylesheets().add(Controller.class.getResource("java-keywords.css").toExternalForm());//Importamos el css a usar
        primaryStage.setTitle("Compilador Manual - Traductores II");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        //generarLexico();
        //llenarTablas_Lexico();
        //pruebasListas();
        if (itemsErrores != null && !itemsErrores.isEmpty()) {
            lsErrores.setItems(itemsErrores);
        }

    }

    public static List<Integer> lexico_ID = new ArrayList<Integer>();
    public static List<Integer> lexico_Linea = new ArrayList<Integer>();
    public static List<String> lexico_Token = new ArrayList<String>();
    public static List<String> lexico_Identificador = new ArrayList<String>();
    public static List<String> erroresGenerados = new ArrayList<String>();

    public void Lexico_Sintactico_ANTLR()throws IOException{
        txtMensajes.clear();
        semantico.clear();
        IDList.clear();
        AYUDA.clear();
        System.out.println("Volvimos\n");
        VerboseListener antlrErrors = new VerboseListener();
        antlrErrors.error = "";
        antlrErrors.errorLine = "";
        String Codigo = codeArea.getText();
        ANTLRInputStream input = new ANTLRInputStream(Codigo);
        gramatica_BasicaLexer lexer = new gramatica_BasicaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        gramatica_BasicaParser parser = new gramatica_BasicaParser( tokens );
        //System.out.println("PARSER: "+tokens.getTokens().toString().);
        //System.out.println("Tamaño tokens: "+tokens.getText());

        //System.out.println("TOKENS ANTLR: "+tokens.getTokens());

        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(antlrErrors); // add ours
        //rser.auxiliar();
        ParseTree tree = parser.auxiliar();
        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk( new HelloWalker(), tree );


        JFrame frame = new JFrame("Antlr Arbol");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
        txtMensajes.appendText(antlrErrors.error);
        txtMensajes.appendText(antlrErrors.errorLine);


        String[] AUXILIAR=Codigo.split("(\\b)|(?<=\\W+)|(?=\\W+)|(?<=;)|(?=;)|(?<=//})|(?=//})|(?<=:)|(?=:)|(?<==)|(?==)|(?<=\")|(?=\")|(?<=])|(?=])|(?<=\\[)|(?=\\[)|(?<=[.][.])|(?=[.][.])|(?<=<)|(?=<)|(?<=>)|(?=>)|(?<=\\()|(?=\\()|(?<=\\))|(?=\\))|(?<=,)|(?=,)");
        boolean Verificando=false;
        for (int i=0;i<AUXILIAR.length;i++){
            Verificando=false;
            //System.out.println("AUXILIAR: "+AUXILIAR[i]);

            if(AUXILIAR[i].equals("=") && !Verificando){//Si = es encontrado
                if(i+1<AUXILIAR.length){
                    if (AUXILIAR[i+1].equals("=")){
                        AYUDA.add("==");
                        i++;
                        Verificando=true;
                    }
                    else {
                        AYUDA.add("=");
                        Verificando=true;
                    }
                }
                else {
                    AYUDA.add("=");
                    Verificando=true;
                }
            }

            if(AUXILIAR[i].equals("<") && !Verificando){//Si <
                if(i+1<AUXILIAR.length){
                    if (AUXILIAR[i+1].equals("=")){//<=
                        AYUDA.add("<=");
                        i++;
                        Verificando=true;
                    }
                    else if (AUXILIAR[i+1].equals(">")){//<>
                        AYUDA.add("<>");
                        i++;
                        Verificando=true;
                    }
                    else {
                        AYUDA.add("<");
                        Verificando=true;
                    }
                }
                else {
                    AYUDA.add("<");
                    Verificando=true;
                }
            }

            if(AUXILIAR[i].equals(">") && !Verificando){//Si > es encontrado
                if(i+1<AUXILIAR.length){
                    if (AUXILIAR[i+1].equals("=")){//>=
                        AYUDA.add(">=");
                        i++;
                        Verificando=true;
                    }
                    else {
                        AYUDA.add(">");
                        Verificando=true;
                    }
                }
                else {
                    AYUDA.add(">");
                    Verificando=true;
                }
            }

            if(!Verificando){//Añade lo que no entró en alguna categoría de las de arriba de operadores
                AYUDA.add(AUXILIAR[i]);
            }

        }




        //Codigo pasra obtener los identificadores xD
        String[] lineasArea;
        String prueba;
        String todosTokens;
        String ID = "[A-Z][a-zA-Z0-9]+";
        String tiposDatos = "(entero|bool|char|string|entero|flotante)";
        lineasArea = codeArea.getText().split("\\n");
        if(antlrErrors.error.equals("")){
           // System.out.println("Holi\n");
            for (int i = 0; i < lineasArea.length; i++){
                //System.out.println("Numero " + i);
                prueba = "";
                codeArea.moveTo(i, 0);
                codeArea.selectLine();
                prueba = (String)codeArea.getSelectedText();
                String[] sinEspacios = prueba.split("\\W+");
                //System.out.println();
                for (String S: sinEspacios){
                    numLineList.add(i + 1);
                    IDList.add(S);
                    //System.out.println(S);
                }
                //System.out.println(prueba);
            }
            cont = IDList.size();
            String obtenerValor = null;
            String datoLlave = null;
            boolean encontrado = false;
            for (int j = 0; j < IDList.size() && !encontrado; j ++){
                /*if (IDList.get(j).matches(ID)) {
                    datoLlave = IDList.get(j);
                    obtenerValor = semantico.get(datoLlave);
                    System.out.println(datoLlave);
                    if (obtenerValor != null){
                        encontrado = true;
                        txtMensajes.appendText("Variable: " + datoLlave + " fue previamente declarada");
                    }
                }*/
                if (j + 1 < IDList.size() && !encontrado) {
                    datoLlave = null;
                    obtenerValor = null;
                    //System.out.println(encontrado);
                    //txtMensajes.setText("");
                    if (IDList.get(j).matches(tiposDatos) && IDList.get(j + 1).matches(ID)) {
                        if (IDList.get(j + 1).matches(ID)) {
                            datoLlave = IDList.get(j + 1);
                            obtenerValor = semantico.get(datoLlave);
                            //System.out.println(datoLlave);
                            if (obtenerValor != null){
                                encontrado = true;
                                //System.out.println("Aqui estamos");
                                txtMensajes.appendText("Variable: " + datoLlave + " fue previamente declarada en linea: "
                                + numLineList.get(j + 1));
                                break;
                            } else {
                                semantico.put(IDList.get(j+1),IDList.get(j));
                            }
                        }
                        //System.out.println("Pos 1: " + IDList.get(j) + ", Pos 2: " + IDList.get(j + 1));
                        j ++;
                    }
                    else if (IDList.get(j).matches(ID)) {
                        datoLlave = IDList.get(j);
                        obtenerValor = semantico.get(datoLlave);
                        // System.out.println(datoLlave);
                        if (obtenerValor == null) {
                            encontrado = true;
                            txtMensajes.appendText("Variable: " + datoLlave + " no fue previamente declarada en linea : "
                                    + numLineList.get(j));
                            break;
                        }
                    }
                }
            }
            /*for (int k = 0; k < IDList.size() && !encontrado; k ++){
                datoLlave = null;
                obtenerValor = null;
                if (IDList.get(k).matches(ID)) {
                    datoLlave = IDList.get(k);
                    obtenerValor = semantico.get(datoLlave);
                   // System.out.println(datoLlave);
                    if (obtenerValor == null) {
                        encontrado = true;
                        txtMensajes.appendText("Variable: " + datoLlave + " no fue previamente declarada en linea : "
                                + numLineList.get(k));
                        break;
                    }
                }
            } */
           // semantico.put("","");
        }
    }

    public void generadorCodigo() throws  IOException, InterruptedException{
        Ensamblado code = new Ensamblado();
        /*for(int i = 0; i < IDList.size(); i ++){
            System.out.println(IDList.get(i));
        }*/
        code.Tokens();
    }

}







