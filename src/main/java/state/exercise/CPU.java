package state.exercise;

public class CPU {
    private int cpuUsedPercentage;
    private String manufacturer;
    private int coresNumber;

    public CPU(int cpuUsedPercentage, String manufacturer, int coresNumber) {
        this.cpuUsedPercentage = cpuUsedPercentage;
        this.manufacturer = manufacturer;
        this.coresNumber = coresNumber;
    }

    public int getCpuUsedPercentage() {
        return cpuUsedPercentage;
    }

    public CPU setCpuUsedPercentage(int cpuUsedPercentage) {
        this.cpuUsedPercentage = cpuUsedPercentage;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CPU setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public CPU setCoresNumber(int coresNumber) {
        this.coresNumber = coresNumber;
        return this;
    }

    public void showInfo(){
        System.out.println("CPU Used: " + this.cpuUsedPercentage + "%");
        System.out.println("CPU Manufacturer: " + this.manufacturer);
        System.out.println("Cores Number: " + this.coresNumber);
    }
}
