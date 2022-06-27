package decorator.exercise;

public class Promocion extends FuncionalidadBanco { //ConcreteDecorator

    public Promocion(ICuentaBanco componentBase) {
        super(componentBase);
    }

    public void sortear(){
        int random = (int) (Math.random() * 100);
        if(random % 2 == 0){
            cuentaBanco.setMontoEnLaCuenta(cuentaBanco.getMontoEnLaCuenta() * 2);
            System.out.println("Promocion> Ganaste la promocion, nuevo monto: " + cuentaBanco.getMontoEnLaCuenta());
        }else{
            System.out.println("Promocion> Perdiste la promocion, monto actual: " + cuentaBanco.getMontoEnLaCuenta());
        }
    }

    @Override
    public void verInfoCuenta() {
        super.verInfoCuenta();
        sortear();
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
