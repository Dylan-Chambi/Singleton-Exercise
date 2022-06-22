package bridge.noBridge;

public class Client {

    public static void main(String[]args){
        Windows windows = new Windows();
        windows.arq_x86();
        windows.arq_x64();

        Linux linux = new Linux();
        linux.arq_x86();
        linux.arq_x64();
    }
}
