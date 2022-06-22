package bridge.noBridge;

public class Windows implements IPlataforma {


    @Override
    public void arq_x86() {
        System.out.println("Windows x86");
    }

    @Override
    public void arq_x64() {
        System.out.println("Windows x64");
    }
}
