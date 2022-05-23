package prototype.exercise;

public class SamsungR10 implements IPrototype {
    private int size;
    private String cpu;
    private String memory;
    private Sim sim;
    private String androidVersion;
    private String camera;
    private String bluetooth;
    private String externalMemoryAmount;
    private String batteryType;
    private String[] accessories;

    public SamsungR10(){

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getExternalMemoryAmount() {
        return externalMemoryAmount;
    }

    public void setExternalMemoryAmount(String externalMemoryAmount) {
        this.externalMemoryAmount = externalMemoryAmount;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String[] getAccessories() {
        return accessories;
    }

    public void setAccessories(String[] accessories) {
        this.accessories = accessories;
    }

    @Override
    public SamsungR10 clone() {
        SamsungR10 samsungR10 = new SamsungR10();
        samsungR10.setSize(this.getSize());
        samsungR10.setCpu(this.getCpu());
        samsungR10.setMemory(this.getMemory());
        samsungR10.setSim(this.getSim());
        samsungR10.setAndroidVersion(this.getAndroidVersion());
        samsungR10.setCamera(this.getCamera());
        samsungR10.setBluetooth(this.getBluetooth());
        samsungR10.setExternalMemoryAmount(this.getExternalMemoryAmount());
        samsungR10.setBatteryType(this.getBatteryType());
        samsungR10.setAccessories(this.getAccessories());
        return samsungR10;
    }

    public String toString(){
        return "SamsungR10 {" + '\n' +
                "     " + "size = '" + size + '\'' + '\n' +
                "     " + "cpu = '" + cpu + '\'' + '\n' +
                "     " + "memory = '" + memory + '\'' + '\n' +
                "     " + "sim = '" + sim + '\'' + '\n' +
                "     " + "androidVersion = '" + androidVersion + '\'' + '\n' +
                "     " + "camera = '" + camera + '\'' + '\n' +
                "     " + "bluetooth = '" + bluetooth + '\'' + '\n' +
                "     " + "externalMemoryAmount = '" + externalMemoryAmount + '\'' + '\n' +
                "     " + "batteryType = '" + batteryType + '\'' + '\n' +
                "     " + "accessories = '" + printArray(accessories) + '\'' + '\n' +
                '}';
    }

    public <T> String printArray(T[] array){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i].toString();
            if(i != array.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}

