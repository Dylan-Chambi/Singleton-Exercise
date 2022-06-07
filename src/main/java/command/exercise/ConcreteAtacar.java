package command.exercise;

public class ConcreteAtacar implements ICommand{
    private Personaje personaje;

    public ConcreteAtacar(Personaje personaje){
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        System.out.println("Command> Atacar");
        personaje.cambiarArma();
        personaje.acercarseAlEnemigo();
        personaje.atacarConArma();
    }
}
