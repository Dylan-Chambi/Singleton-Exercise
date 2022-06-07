package command.exercise;

public class ConcreteDisparar implements ICommand{
    private Personaje personaje;

    public ConcreteDisparar(Personaje personaje){
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        System.out.println("Command> Disparar");
        personaje.cambiarArma();
        personaje.apuntarAlEnemigo();
        personaje.dispararAlEnemigo();
    }
}
