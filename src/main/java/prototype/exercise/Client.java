package prototype.exercise;

public class Client {
    public static void main(String[] args) {
        Sim sim1 = new Sim();
        sim1.setISPName("Entel");
        sim1.setPhoneNumber("78510245");

        SamsungR10 samsungR10_1 = new SamsungR10();
        samsungR10_1.setSize(5);
        samsungR10_1.setCpu("Snapdragon 855");
        samsungR10_1.setMemory("4GB");
        samsungR10_1.setSim(sim1);
        samsungR10_1.setAndroidVersion("8.1");
        samsungR10_1.setCamera("12MP");
        samsungR10_1.setBluetooth("5.1");
        samsungR10_1.setExternalMemoryAmount("64GB");
        samsungR10_1.setBatteryType("Li-Ion");
        samsungR10_1.setAccessories(new String[]{"Audifonos", "Cargador", "Estuche"});

        System.out.println("1.- " + samsungR10_1);

        SamsungR10 samsungR10_2 = samsungR10_1.clone();

        Sim sim2 = new Sim();
        sim2.setISPName("Viva");
        sim2.setPhoneNumber("65510245");

        samsungR10_2.setSim(sim2);
        samsungR10_2.setAccessories(new String[]{"Audifonos", "Cargador", "Estuche", "Cargador", "MicroSD"});
        System.out.println("2.- " + samsungR10_2);

        SamsungR10 samsungR10_3 = samsungR10_1.clone();

        Sim sim3 = new Sim();
        sim3.setISPName("Tigo");
        sim3.setPhoneNumber("77007007");

        samsungR10_3.setSim(sim3);
        samsungR10_3.setAccessories(new String[]{"Cargador"});
        System.out.println("3.- " + samsungR10_3);


    }
}
