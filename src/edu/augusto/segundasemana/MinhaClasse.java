package edu.augusto.segundasemana;
public class MinhaClasse { 
    public static void main(String[] args) {
        System.out.print ( "Olá, bem vindo ao curso básico de Java! ");
        
        String primeiroNome = "Augusto";
        String segundoNome = "Roque";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }     
    } 