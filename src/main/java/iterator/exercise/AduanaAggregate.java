package iterator.exercise;

import java.util.HashMap;

public class AduanaAggregate implements IAggregate {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private int position;
    private HashMap<Automovil, String> automovilesList;

    public AduanaAggregate() {
        automovilesList = new HashMap<Automovil, String>();
    }

    public HashMap<Automovil, String> getAutomovilesMap() {
        return automovilesList;
    }

    public void guardar(Automovil value, String importadora) {
        if(automovilesList.containsKey(value)){
            System.out.println(ANSI_RED_BACKGROUND + "El automovil ya existe en la lista" + ANSI_RESET);
        }else{
            automovilesList.put(value, importadora);
            position++;
        }
    }

    @Override
    public AduanaIterator createIterator() {
        return new AduanaIterator(automovilesList);
    }
}
