package clases;

public class Consulta extends Transaccion{
    
    @Override
    public void Transacciones(){
        System.out.println("------------------------------------");
        System.out.println("SU SALDO ACTUAL ES: " + getSaldo());
        System.out.println("------------------------------------");
    }    
}
