package memento.exercise;

public class DatabaseVersioning {
    private Database state;

    public void setBackup(Database state){
        this.state=state;
    }

    public Memento createBackup(){
        return  new Memento(state);
    }

    public Database restoreBackup(Memento memento){
        this.state= memento.getState();
        return this.state;
    }

}
