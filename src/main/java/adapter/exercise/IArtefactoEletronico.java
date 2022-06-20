package adapter.exercise;

public interface IArtefactoEletronico {
    double precio();

    IArtefactoEletronico setPrecio(double precio);
    int tiempoDeVida(); // en años

    IArtefactoEletronico setTiempoDeVida(int tiempoDeVida);
}
