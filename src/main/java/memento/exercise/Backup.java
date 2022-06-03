package memento.exercise;

import java.util.HashMap;
import java.util.Map;

public class Backup {
    private Map<String, Memento> backups = new HashMap<>();

    public void createBackup(String alias, Memento memento){
        backups.put(alias, memento);
    }

    public Memento getBackup(String backupAlias){
        return backups.get(backupAlias);
    }
}
