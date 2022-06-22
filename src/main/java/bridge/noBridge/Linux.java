package bridge.noBridge;

public class Linux implements IPlataforma {

    @Override
    public void arq_x86() {
        System.out.println("Linux x86");
    }

    @Override
    public void arq_x64() {
        System.out.println("Linux x64");
    }
}
