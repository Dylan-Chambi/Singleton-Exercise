package decorator.exercise;

public class Client {

    public static void main(String[] args){
        ICuentaBanco cuentaUsuario = new CuentaBancoBasica("Dylan",1000);

        cuentaUsuario = new BancaPorInternet(cuentaUsuario,true);
        cuentaUsuario = new SeguroCuenta(cuentaUsuario,"10%");
        cuentaUsuario = new Promocion(cuentaUsuario);
        cuentaUsuario = new Promocion(cuentaUsuario);

        cuentaUsuario.verInfoCuenta();

    }
}
