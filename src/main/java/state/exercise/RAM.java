package state.exercise;

public class RAM {
    private int memoryUsedPercentage;
    private String manufacturer;
    private String capacity;

    public RAM(int memoryUsedPercentage, String manufacturer, String capacity) {
        this.memoryUsedPercentage = memoryUsedPercentage;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public int getMemoryUsedPercentage() {
        return memoryUsedPercentage;
    }

    public RAM setMemoryUsedPercentage(int memoryUsedPercentage) {
        this.memoryUsedPercentage = memoryUsedPercentage;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public RAM setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getCapacity() {
        return capacity;
    }

    public RAM setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    public void showInfo(){
        System.out.println("Memory Used: " + this.memoryUsedPercentage + "%");
        System.out.println("RAM Manufacturer: " + this.manufacturer);
        System.out.println("Capacity: " + this.capacity);
    }
}
