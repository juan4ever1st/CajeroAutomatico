package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        Login ingreso = new Login();//creamos un nuevo objeto de la clase login
        ingreso.Sesion();//invocamos a la operacion disponible
        Transaccion operacion = new Consulta();//creamos el objeto operacion desde la clase transaccion
        operacion.setSaldo(10000);//usamos el metodo setter para asignar un valor inicial al saldo
        operacion.Operaciones();//mediante poliformismo usamos el metodo operaciones
        System.exit(0); //cuando se sale del menu se finaliza la aplicacion
    }
}
