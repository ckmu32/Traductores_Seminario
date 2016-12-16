






global main


SECTION .text   

main:
        push    ebp
        mov     ebp, esp
        sub     esp, 16
        jmp     L_003

L_001:  mov     dword [ebp-8H], 0
        cmp     dword [ebp-8H], 2
        jg      L_002
        mov     eax, dword [ebp-4H]
        mov     dword [ebp-8H], eax
        jmp     L_003

L_002:  mov     dword [ebp-0CH], 3
L_003:  cmp     dword [ebp-4H], 5
        jg      L_001
        mov     eax, 0
        leave
        ret



SECTION .data   


SECTION .bss    


