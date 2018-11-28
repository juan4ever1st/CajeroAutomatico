package clases;

public class Deposito extends Transaccion{
    
    @Override
    public void Transacciones(){
        System.out.print("INGRESE EL MONTO A DEPOSITAR: ");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("-----------------------------------");
        System.out.println("MONTO DEPOSITADO $: " + deposito);
        System.out.println("EL DISPONIBLE ACTUAL ES $: " + getSaldo());
        System.out.println("-----------------------------------");
    }
    
}
