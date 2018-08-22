package practica2;
//import java.util.Scanner;
public class Practica2 {
    public static void main(String[] args) {
    //---------------------------------------------------------------------  
    Compu laptop1 =  new Compu("HP", "Gris" , 14230,"HP5001","15",4);
    //---------------------------------------------------------------------
    System.out.println ("-----------------------------------");
    System.out.println ("    Extraemos atributos");
    System.out.println ("-----------------------------------");
    System.out.println ("Marca:  " + laptop1.getMarca());
    System.out.println ("Color:  " + laptop1.getColor());
    System.out.println ("Precio: " + laptop1.getPrecio());
    System.out.println ("Modelo: " + laptop1.getModelo());
    System.out.println ("Tamaño: " + laptop1.getTamaño());
    System.out.println ("Stock  : " + laptop1.getStock());
    //---------------------------------------------------------------------
    System.out.println ("-----------------------------------");
    System.out.println ("   Modificamos atributos");
    System.out.println ("-----------------------------------");
    laptop1.setPrecio(12700);
    laptop1.setStock(3);
    System.out.println ("Marca:  " + laptop1.getMarca());
    System.out.println ("Color:  " + laptop1.getColor());
    System.out.println ("Precio: " + laptop1.getPrecio());
    System.out.println ("Modelo: " + laptop1.getModelo());
    System.out.println ("Tamaño: " + laptop1.getTamaño());
    System.out.println ("Stock  : " + laptop1.getStock());
    //---------------------------------------------------------------------


    }
    
}
