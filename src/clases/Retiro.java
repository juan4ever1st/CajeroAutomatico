package clases;

public class Retiro extends Transaccion {

    @Override
    public void Transacciones() {
        System.out.print("INGRESE MONTO A RETIRAR: ");
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("-----------------------------------");
            System.out.println("UD. RETIRO : $" + retiro);
            System.out.println("EL DISPONIBLE ACTUAL ES $: " + getSaldo());
            System.out.println("-----------------------------------");
        } else {
            System.out.println("---------------------");
            System.out.println("SALDO INSUFICIENTE.");
            System.out.println("---------------------");
        }
    }
}
