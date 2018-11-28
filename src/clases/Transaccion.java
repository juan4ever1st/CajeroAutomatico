package clases;

import java.util.Scanner;

public abstract class Transaccion {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int aux = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("SELECIONE UNA OPCION:");
                System.out.println("    1. CONSULTA DE SALDO.");
                System.out.println("    2. EXTRACCION.");
                System.out.println("    3. DEPOSITO.");
                System.out.println("    4. FINALIZAR.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    aux = 1;
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar por favor.");
                    System.out.println("-------------------------------------------------");
                }
            } while (aux == 0);
            
            switch (seleccion) {
                case 1:
                    {
                        Transaccion opera = new Consulta();
                        opera.Transacciones();
                        break;
                    }
                case 2:
                    {
                        Transaccion opera = new Retiro();
                        opera.Transacciones();
                        break;
                    }
                case 3:
                    {
                        Transaccion opera = new Deposito();
                        opera.Transacciones();
                        break;
                    }
                case 4:
                    System.out.println("--------------------------");
                    System.out.println("¡GRACIAS\n POR UTILIZAR NUESTRO SERVICO!");
                    System.out.println("--------------------------");
                    aux = 2;
                    break;
                default:
                    break;
            }
        } while (aux != 2);
    }
    
    //Método para solicitar cantidad de extraccion
    public void Retiro(){
        String aux = entrada.nextLine();
        if(!aux.equals("") && Validar.isNum(aux) && (Integer.parseInt(aux)>0)){
            retiro = Integer.parseInt(aux);
        }
        System.out.println("Atencion: VERIFIQUE LOS DATOS INGRESADOS!");
    }
    
    //Método para solicitar deposito
    public void Deposito(){
        String aux = entrada.nextLine();
        if(!aux.equals("") && Validar.isNum(aux) && (Integer.parseInt(aux)>0)){
            deposito = Integer.parseInt(aux);
        }
        System.out.println("Atencion: VERIFIQUE LOS DATOS INGRESADOS!");
    }
    
    //Método abstracto
    public abstract void Transacciones();
    
    //Métodos setter y getter
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
