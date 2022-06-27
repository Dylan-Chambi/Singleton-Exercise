package decorator.exercise;

public class SeguroCuenta extends FuncionalidadBanco { //ConcreteDecorator

    private String descuentoMontoPorSeguro;

    public SeguroCuenta(ICuentaBanco componentBase, String descuentoMontoPorSeguro) {
        super(componentBase);
        this.descuentoMontoPorSeguro = descuentoMontoPorSeguro;
    }

    public void cobrarDescuento(){
        double descuento = FromPercentageString(descuentoMontoPorSeguro);
        cuentaBanco.setMontoEnLaCuenta(cuentaBanco.getMontoEnLaCuenta() * (1 - descuento));
        System.out.println("SeguroCuenta> se desconto " + descuentoMontoPorSeguro + ", monto restante: " + cuentaBanco.getMontoEnLaCuenta());
    }

    @Override
    public void verInfoCuenta() {
        super.verInfoCuenta();
        cobrarDescuento();
    }

    @Override
    public void setMontoEnLaCuenta(double monto) {
        cuentaBanco.setMontoEnLaCuenta(monto);
    }

    @Override
    public double getMontoEnLaCuenta() {
        return cuentaBanco.getMontoEnLaCuenta();
    }

    public static double FromPercentageString(String value)
    {
        return Double.parseDouble(value.substring(0, value.length() - 1)) / 100;
    }
}
