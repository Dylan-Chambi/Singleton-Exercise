package command.exercise;

public class ConcreteModoDefensa implements ICommand{
    private Personaje personaje;

    public ConcreteModoDefensa(Personaje personaje){
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        System.out.println("Command> Modo Defensa");
        personaje.retroceder();
        personaje.desplegarEscudo();
    }
}
