package decorator.exercise;

public class CuentaBancoBasica implements ICuentaBanco { //ConcreteComponent
    private String nombrePropietario;
    private double montoEnLaCuenta;

    public CuentaBancoBasica(String nombrePropietario, double montoEnLaCuenta) {
        this.nombrePropietario = nombrePropietario;
        this.montoEnLaCuenta = montoEnLaCuenta;
    }

    @Override
    public void verInfoCuenta() {
        System.out.println("CuentaBancoBasica> Nombre Propietario: " + nombrePropietario);
        System.out.println("CuentaBancoBasica> Monto en la cuenta: " + montoEnLaCuenta);
    }

    @Override
    public void setMontoEnLaCuenta(double monto) {
        this.montoEnLaCuenta = monto;
    }

    @Override
    public double getMontoEnLaCuenta() {
        return this.montoEnLaCuenta;
    }
}
