/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioapp;

import java.util.Scanner;

/**
 *
 * @author NitroPC
 */
public class InicioApp {

    static Scanner sc = new Scanner(System.in);
    static int contador;
    static int palabras;
    static char letras[];
    static int cont[];
    String palabra;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
              System.out.println(" Introduce una frase");
        String palabra = sc.nextLine().trim();
        String f= palabra.toLowerCase();
        contarPalabras(f);
        mostrarResultado();
       
        
    }
    
    public static void contarPalabras(String palabra){
       contador =0;
       palabras =0;
       cont = new int[32];
       letras = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m',
       'n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','.',',','-','_',
       ';',':'};
  
       
       char[] frase = palabra.toCharArray();
       
       //Contar letras 
        for (int i = 0; i < frase.length; i++) {
            if(frase[i] != ' '){
                contador++;
            }   
    }
        //Contar palabras
        char aux2 = ' ';
        for (int i = 0; i < frase.length; i++) {
                        
            if(palabra.charAt(i) != ' ' && aux2 == ' '){
                palabras++;
            }
            aux2 = palabra.charAt(i);
        }
        
        //Agrupar letras
        for (int i = 0; i < frase.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if(palabra.charAt(i)==letras[j]){
                    cont[j]++;
                }
            }
        }
        
        
}
    
    public static void mostrarResultado(){
        System.out.println(" El contador es " + contador);
        System.out.println(" Hay " + palabras + " palabras");
        for (int i = 0; i < cont.length; i++) {
            if(cont[i]>=1){
                System.out.println(letras[i] + " - " + cont[i]);
        }
        
        }
        
    }
  

}
