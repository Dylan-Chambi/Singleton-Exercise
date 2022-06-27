package decorator.exercise;

public abstract class FuncionalidadBanco implements ICuentaBanco { //Decorator

    protected ICuentaBanco cuentaBanco;

    public FuncionalidadBanco(ICuentaBanco cuentaBanco){
        this.cuentaBanco = cuentaBanco;
    }

    @Override
    public void verInfoCuenta() {
        cuentaBanco.verInfoCuenta();
    }
}
