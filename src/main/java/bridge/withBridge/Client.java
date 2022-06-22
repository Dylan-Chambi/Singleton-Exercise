package bridge.withBridge;

public class Client {

    public static void main(String[]args){
        Arquitectura arq_x86 = new Arquitectura("x86");
        Arquitectura arq_x64 = new Arquitectura("x64");
        Arquitectura arq_arm = new Arquitectura("arm");

        Windows windows_x86 = new Windows(arq_x86);
        windows_x86.arq();
        Windows windows_x64 = new Windows(arq_x64);
        windows_x64.arq();
        Windows windows_arm = new Windows(arq_arm);
        windows_arm.arq();

        Linux linux_x86 = new Linux(arq_x86);
        linux_x86.arq();
        Linux linux_x64 = new Linux(arq_x64);
        linux_x64.arq();

    }
}
