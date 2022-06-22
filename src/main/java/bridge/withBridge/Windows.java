package bridge.withBridge;

public class Windows implements IPlataforma {
    private Arquitectura arquitectura;

    public Windows(Arquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arq() {
        System.out.println("Windows " + arquitectura.getArquitectura());
    }
}
