package decorator.exercise;

public interface ICuentaBanco { //IComponent
    void verInfoCuenta();

    void setMontoEnLaCuenta(double monto);

    double getMontoEnLaCuenta();
}
