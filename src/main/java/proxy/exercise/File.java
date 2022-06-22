package proxy.exercise;

public class File {
    private String name;
    private String description;
    private String extension;

    public File(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void showInfo(){
        System.out.println("File : "+name+"."+extension);
        System.out.println("Description: "+description);
    }
}
