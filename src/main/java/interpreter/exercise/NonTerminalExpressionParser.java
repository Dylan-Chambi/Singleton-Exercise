package interpreter.exercise;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpressionParser extends AbstractExpression {
    private List<AbstractExpression> grammar = new ArrayList<>();
    private Context context;

    public NonTerminalExpressionParser(String messageToInterpret) {
        // Quitando espacios en blanco - regla gramatica
        context = new Context(messageToInterpret.replaceAll(" ", ""));
        for(String  originalChar : messageToInterpret.split(" ")){
            context.currentDigit = 0;
            for(String currentChar : originalChar.split("")){
                switch (currentChar) {
                    case "I":
                        grammar.add(new TerminalExpressionI(originalChar.length()));
                        break;
                    case "V":
                        grammar.add(new TerminalExpressionV(originalChar.length()));
                        break;
                    case "X":
                        grammar.add(new TerminalExpressionX(originalChar.length()));
                        break;
                    default:
                        break;
                }
                context.currentDigit++;
            }

        }
    }

    public String evaluateMSG() {
        System.out.println("Contexto: " + context.input);
        for(int i = 0; i < grammar.size(); i++){
            grammar.get(i).interpreter(context);
            if(i < grammar.size() - 1) context.output += " ";
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {
        throw new UnsupportedOperationException("NonTerminalExpressionParser no puede interpretar una expresion");
    }
}
