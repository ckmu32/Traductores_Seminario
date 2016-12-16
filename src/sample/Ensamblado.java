package sample;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import java.awt.*;
import java.awt.Label;
import java.awt.TextArea;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;

/**
 * Created by Raúl on 08/12/2016.
 */


public class Ensamblado {
    String directorioUsuario=System.getProperty("user.dir");
    Controller asm;
    String aux = null;
    String codigoC="#include <stdio.h>"+"\r\n" + "int main(){ ";
    boolean whileDetected = false;
    boolean declaracionAsignacion_Encontrado=false;//Agregar el ; a la declaración
    public void Tokens() throws  IOException, InterruptedException, FileNotFoundException{
        System.out.println("Toekns");
        System.out.println("Direcotio: "+directorioUsuario);
        for (int i = 0; i < asm.AYUDA.size(); i ++){
            System.out.println("For");
            aux = asm.AYUDA.get(i);

            System.out.println("Aux: "+aux);
            String ID = "[A-Z][a-zA-Z0-9]+";
            if(aux.equals("mientras")){
                codigoC += "while" + " ";
                whileDetected = true;
            } else if(aux.equals("(")){
                codigoC += "(" + " ";
            } else if(aux.matches(ID)){
                codigoC+=aux+" ";
                if(declaracionAsignacion_Encontrado || !declaracionAsignacion_Encontrado){
                    if (asm.AYUDA.get(i-1).equals("=") || asm.AYUDA.get(i-2).equals("=")){
                        if(i+1<asm.AYUDA.size()){
                            if(asm.AYUDA.get(i+1).matches("\\n")){
                                codigoC+=";"+" ";
                                declaracionAsignacion_Encontrado=false;
                            }
                        }
                    } else if(i+1<asm.AYUDA.size()){
                        if(asm.AYUDA.get(i+1).matches("\\n")){
                            codigoC+=";"+" ";
                            declaracionAsignacion_Encontrado=false;
                        }
                    }
                }
            } else if(aux.equals(")")){
                codigoC += ")" + " ";
                if (whileDetected){
                    codigoC += "{" + " ";
                    whileDetected = false;
                }
            }else if(aux.equals("si")){
                codigoC += "if" + " ";
                System.out.println("Holi");
            } else if(aux.equals("entonces")){
                codigoC += "{" + " ";
            } else if(aux.equals("sino")){
                codigoC+="}else{"+" ";
            } else if(aux.equals("terminamientras") || aux.equals("terminasi")){
                codigoC += "}" + " ";
            } else if(aux.equals("entero")){
                codigoC += "int" + " ";
                declaracionAsignacion_Encontrado=true;
            } else if(aux.equals("flotante")){
                codigoC += "float" + " ";
                declaracionAsignacion_Encontrado=true;
            } else if(aux.equals("booleno")){
                codigoC += "bool" + " ";
                declaracionAsignacion_Encontrado=true;
            } else if(aux.equals("string")){
                codigoC += "string" + " ";
                declaracionAsignacion_Encontrado=true;
            } else if(aux.equals("char")){
                codigoC += "char" + " ";
                declaracionAsignacion_Encontrado=true;
            } else if(aux.equals("rompe")){
                codigoC += "break;" + " ";
            } else if(aux.matches("[0-9]+")){
                codigoC+=aux+" ";
                if(declaracionAsignacion_Encontrado || !declaracionAsignacion_Encontrado){
                    if (asm.AYUDA.get(i-1).equals("=") || asm.AYUDA.get(i-2).equals("=")){
                        if(i+1<asm.AYUDA.size()){
                            if(asm.AYUDA.get(i+1).matches("\\n")){
                                codigoC+=";"+" ";
                                declaracionAsignacion_Encontrado=false;
                            }
                        }
                    }
                }
            } else if(aux.matches("(<|>|<=|>=|==)")){
                codigoC+=aux+" ";
            } else if(aux.matches("<>")){
                codigoC+="!="+" ";
            } else if(aux.equals("=")){
                codigoC+="="+" ";
            }
        }
        codigoC+="return 0; }";//Return 0 y cierra main
        System.out.println("CodigoC: "+codigoC);
        crearArchivo_C(codigoC);
        ejecutarScript();
        mostrarCodigo(directorioUsuario+"/codigo.c.nasm");
    }

    void crearArchivo_C(String Codigo) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter(directorioUsuario+"/codigo.c");
            bw = new BufferedWriter(fw);
            bw.write(Codigo);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    void ejecutarScript() throws java.lang.InterruptedException, IOException{
        //Runtime rt = Runtime.getRuntime();
        String bash=(directorioUsuario+"/c2nasm.sh");
        String codigo = (directorioUsuario+"/codigo.c");
        System.out.println(bash);
        System.out.println(codigo);
        String[] cmd={bash,codigo};
        Process p = new ProcessBuilder(bash,codigo).start();
        //Process proc = rt.exec(cmd);
        //proc.waitFor();
    }

    void mostrarCodigo(String archivo) throws  FileNotFoundException, IOException{

        String cadena;
        String cadena2 = "";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            //System.out.println(cadena);
            cadena2 += cadena+"\r\n";
        }
        b.close();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Código NASM");
        alert.setHeaderText(" ");
        alert.setContentText(" ");

        Exception ex = new FileNotFoundException("Could not find file blabla.txt");

// Create expandable Exception.
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        String exceptionText = sw.toString();

        javafx.scene.control.Label label = new javafx.scene.control.Label("Código generado:");

        javafx.scene.control.TextArea textArea = new javafx.scene.control.TextArea(cadena2);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);

        GridPane expContent = new GridPane();
        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(textArea, 0, 1);

// Set expandable Exception into the dialog pane.
        alert.getDialogPane().setExpandableContent(expContent);

        alert.showAndWait();
    }
}
