package memento.exercise;

public class Client {
     public static void main(String[] args){
          Backup backup = new Backup();
          DatabaseVersioning databaseVersioning = new DatabaseVersioning();

          Database database;
          database = new Database();
          database.addToDatabase(new Persona("Marie", "6565656", 25));
          database.addToDatabase(new Persona("Juan", "6565656", 25));
          database.addToDatabase(new Persona("Pedro", "6565656", 25));
          databaseVersioning.setBackup(database);
          backup.createBackup("Backup Enero", databaseVersioning.createBackup());
          System.out.println("-----------------Backup Enero-----------------");
          database.showInfo();

          database = new Database();
          database.addToDatabase(new Persona("Carlos", "6565656", 25));
          database.addToDatabase(new Persona("Hernesto", "6565656", 25));
          database.addToDatabase(new Persona("John", "6565656", 25));
          databaseVersioning.setBackup(database);
          backup.createBackup("Backup Febrero", databaseVersioning.createBackup());
          System.out.println("-----------------Backup Febrero-----------------");
          database.showInfo();

          database = new Database();
          database.addToDatabase(new Persona("Olivia", "6565656", 25));
          database.addToDatabase(new Persona("Jorge", "6565656", 25));
          database.addToDatabase(new Persona("Josh", "6565656", 25));
          databaseVersioning.setBackup(database);
          backup.createBackup("Backup Marzo", databaseVersioning.createBackup());
          System.out.println("-----------------Backup Marzo-----------------");
          database.showInfo();

          database = new Database();
          database.addToDatabase(new Persona("Fernando", "6565656", 25));
          database.addToDatabase(new Persona("Pablo", "6565656", 25));
          database.addToDatabase(new Persona("Allison", "6565656", 25));
          databaseVersioning.setBackup(database);
          backup.createBackup("Backup Abril", databaseVersioning.createBackup());
          System.out.println("-----------------Backup Abril-----------------");
          database.showInfo();

          database = new Database();
          database.addToDatabase(new Persona("Mario", "6565656", 25));
          database.addToDatabase(new Persona("Eduardo", "6565656", 25));
          database.addToDatabase(new Persona("Ana", "6565656", 25));
          databaseVersioning.setBackup(database);
          backup.createBackup("Backup Mayo", databaseVersioning.createBackup());
          System.out.println("-----------------Backup Mayo-----------------");
          database.showInfo();

          database = databaseVersioning.restoreBackup(backup.getBackup("Backup Abril"));
          System.out.println("-----------------Backup Abril Restaurado-----------------");
          database.showInfo();

    }

}
