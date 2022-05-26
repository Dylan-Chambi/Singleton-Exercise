package interpreter.exercise;

public class Client {
    public static void main(String[] args) {
        String msg = "VII IX IV X";
        NonTerminalExpressionParser parser = new NonTerminalExpressionParser(msg);
        System.out.println("Mensaje Interpretado: " + parser.evaluateMSG());
    }
}
