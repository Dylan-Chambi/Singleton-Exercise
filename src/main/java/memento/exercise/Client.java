package memento.exercise;

public class Client {
    public static void main(String[] args) {
        Backup backup = new Backup();
        DatabaseVersioning databaseVersioning = new DatabaseVersioning();

        Database database;
        database = new Database();
        database.addToDatabase(new Persona("Marie", "6565656", 25));
        database.addToDatabase(new Persona("Hernesto", "6565656", 25));
        databaseVersioning.setBackup(database);
        backup.createBackup("Backup Enero", databaseVersioning.createBackup());
        System.out.println("-----------------Backup Enero-----------------");
        database.showInfo();

        database.addToDatabase(new Persona("Carlos", "6565656", 25));
        database.removeFromDatabase(1);
        databaseVersioning.setBackup(database);
        backup.createBackup("Backup Febrero", databaseVersioning.createBackup());
        System.out.println("-----------------Backup Febrero-----------------");
        database.showInfo();

        database.addToDatabase(new Persona("Olivia", "6565656", 25));
        databaseVersioning.setBackup(database);
        backup.createBackup("Backup Marzo", databaseVersioning.createBackup());
        System.out.println("-----------------Backup Marzo-----------------");
        database.showInfo();

        database.addToDatabase(new Persona("Fernando", "6565656", 25));
        databaseVersioning.setBackup(database);
        backup.createBackup("Backup Abril", databaseVersioning.createBackup());
        System.out.println("-----------------Backup Abril-----------------");
        database.showInfo();

        database.addToDatabase(new Persona("Eduardo", "6565656", 25));
        databaseVersioning.setBackup(database);
        backup.createBackup("Backup Mayo", databaseVersioning.createBackup());
        System.out.println("-----------------Backup Mayo-----------------");
        database.showInfo();

        database = databaseVersioning.restoreBackup(backup.getBackup("Backup Febrero"));
        System.out.println("-----------------Backup Febrero Restaurado-----------------");
        database.showInfo();

    }

}
