package decorator.exercise;

public class BancaPorInternet extends FuncionalidadBanco { //ConcreteDecorator

    private boolean isBancaPorInternet;

    public BancaPorInternet(ICuentaBanco componentBase, boolean isBancaPorInternet) {
        super(componentBase);
        this.isBancaPorInternet = isBancaPorInternet;
    }

    @Override
    public void verInfoCuenta() {
        super.verInfoCuenta();
        if(isBancaPorInternet){
            System.out.println("BancaPorInternet> Banca por internet habilitada");
        }else{
            System.out.println("BancaPorInternet> Banca por internet no habilitada");
        }
    }

    @Override
    public void setMontoEnLaCuenta(double monto) {
        cuentaBanco.setMontoEnLaCuenta(monto);
    }

    @Override
    public double getMontoEnLaCuenta() {
        return cuentaBanco.getMontoEnLaCuenta();
    }
}
