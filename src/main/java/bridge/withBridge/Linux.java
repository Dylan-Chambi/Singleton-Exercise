package bridge.withBridge;

public class Linux implements IPlataforma {
    private Arquitectura arquitectura;

    public Linux(Arquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arq() {
        System.out.println("Linux " + arquitectura.getArquitectura());
    }
}
