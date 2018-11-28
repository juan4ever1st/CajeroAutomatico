package clases;

import java.util.Scanner;

public class Login {
    
    @SuppressWarnings("null")
    public void Sesion() {
        String clave = "1234";
        String aux;
        
        do{
            System.out.println("----------------");
            System.out.println ("RED ATM JUJUY");
            System.out.println("----------------");
            System.out.println("\nINGRESE SU CLAVE DE ACCESO: ");
            Scanner entrada = new Scanner(System.in);
            aux = entrada.nextLine();
            
            if(aux.equals("")){
                System.out.println("Error: POR FAVOR INGRESE UNA CLAVE.");
            } else {
                if(aux.equals(clave)){//si la clave digitada coincide con la clave 
                    System.out.println("***************************");
                    System.out.println("CLAVE VALIDADA. BIENVENIDO!");
                    System.out.println("***************************");
                    break;
                }
                System.out.println("Atencion: LA CLAVE INGRESADA ES INCORRECTA.");
            }
        }while(aux == null ? clave != null : !aux.equals(clave));       
                
    }   
}
