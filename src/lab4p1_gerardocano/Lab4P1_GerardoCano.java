/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_gerardocano;
import java.util.Scanner;
/**
 *
 * @author gcano
 */
public class Lab4P1_GerardoCano {
static Scanner read = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcion;
        do{
            System.out.println("Menu");
            System.out.println("1.Sumador binario");
            System.out.println("2.Contains");
            System.out.println("3.Alpha");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion");
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese la primera cadena ");
                     String cad1 = read.next().stripLeading().stripTrailing().toLowerCase();
                     System.out.println("Ingrese la segunda cadena ");
                     String cad2 = read.next().stripTrailing().stripLeading().toLowerCase();
                     binary(cad1,cad2);
                break;
                case 2:
                    System.out.println("Ingrese la primera cadena");
                    read.nextLine();
                    String c1 = read.nextLine();
                    System.out.println("Ingrese la segunda cadena ");
                   // read.nextLine();
                    String c2 = read.nextLine();
                    contains(c1,c2);
                   
                break;
                case 3:
                    System.out.println("Ingrese una cadena ");
                    String word = read.next().toLowerCase();
                    Alpha(word);
                break;
                case 4:
                    System.out.println("Saliendo");
                break;
            }
        }while(opcion !=0);
    }//fin main
    public static void binary(String cad1,String cad2){
        String digit, digit2;
        int nf = 0, n=0, n2=0;
        if(cad1.length()!= cad2.length()){
            System.out.println("Las cadenas tiene que ser del mismo tamano");
        }
        else{
        int  cadlnght = cad1.length(),cadlngth2 = cad2.length();
        String c1="", c2="";
        for (int i = (cadlnght-1); i >= 0; --i) {
            c1 = c1 + cad1.charAt(i);
            digit = Character.toString(i);
            n = Integer.parseInt(digit);
        }
        for (int j = (cadlngth2-1); j >= 0; --j) {
            c2 = c2 + cad2.charAt(j);
            digit2 = Character.toString(j);
            n2 = Integer.parseInt(digit2);
        }
        nf=n+n2;
        System.out.println(nf);
        }
        System.out.println(nf);
        
        
        
    }
    public static void contains(String c1, String c2){
        int acum = 0;
        if(c2.length()>c1.length()){
            System.out.println("La primera cadena no puede ser menor a la segunda");
        }//verif cadena1 mayor a la segunda
        else {
        for (int j = 0; j < c1.length(); j++) {
             char l2 = c1.charAt(j);//lee primera palabra
        
        for (int i = 0; i < c2.length(); i++) {
             char l1 = c2.charAt(i);//lee cad 2
            if(c1.charAt(j)+1==c2.charAt(i)+1){
            acum++;//acum que dice si contiene o no
        }
        }
        
        }  
        if (acum==0){
            System.out.println("La primera cadena no contiene a la segunda");
        }
        else{
            System.out.println("La primera cadena contiene a la segunda");
        }
        }
        
       
    }
    public static void Alpha(String word){
        int c=0;
            for (int l = 0; l < word.length(); l++) {
                char letr = word.charAt(l);
                if (letr >= 97 && letr <= 122){
                   c++;
                //fin if
                        }//fin for interior
                    }//fin for afuera
            if(c==word.length()){
                System.out.println("La palabra contiene solo letras");
            }
            else{
                System.out.println("La palabra contiene caracteres que no son letras");
            }
    } 
}
