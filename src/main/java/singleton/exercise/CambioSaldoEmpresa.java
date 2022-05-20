package singleton.exercise;

public abstract class CambioSaldoEmpresa {

    public void cambiarDineroBStoDolar(double cantidad){
        CambioSaldoManager.getInstance().cambiarBStoDolar(cantidad);
    }

    public void cambiarDineroDolarToBS(double cantidad){
        CambioSaldoManager.getInstance().cambiarDolarToBS(cantidad);
    }

    public void cambiarDineroBStoEuro(double cantidad){
        CambioSaldoManager.getInstance().cambiarBStoEuro(cantidad);
    }

    public void cambiarDineroEuroToBS(double cantidad){
        CambioSaldoManager.getInstance().cambiarEuroToBS(cantidad);
    }
}
