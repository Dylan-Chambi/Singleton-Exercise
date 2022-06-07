package command.exercise;

public class Client {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();

        ConcreteAtacar atacarCommand = new ConcreteAtacar(personaje);
        ConcreteModoDefensa modoDefensaCommand = new ConcreteModoDefensa(personaje);
        ConcreteDisparar dispararCommand = new ConcreteDisparar(personaje);

        Invoker invoker = new Invoker();

        invoker.addCommand(atacarCommand);
        invoker.addCommand(modoDefensaCommand);
        invoker.addCommand(dispararCommand);
        invoker.addCommand(atacarCommand);
        invoker.addCommand(dispararCommand);
        invoker.addCommand(atacarCommand);
        invoker.addCommand(modoDefensaCommand);

        invoker.runCommands();
    }

}
