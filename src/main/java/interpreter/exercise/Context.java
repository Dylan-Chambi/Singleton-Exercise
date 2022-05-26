package interpreter.exercise;

public class Context {
    protected String input="";
    protected String output="";

    protected int previousNum=0;

    protected int currentDigit=0;

    protected String prevExpression="";

    public Context(String input) {
        this.input = input;
    }


}
