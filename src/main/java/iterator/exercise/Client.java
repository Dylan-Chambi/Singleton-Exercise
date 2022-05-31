package iterator.exercise;

import java.util.HashMap;

public class Client {
    public static void main(String[]args){
        Automovil automovilRepetido = new Automovil(150, "2018", 6, "Camioneta");

        StarkautosAggregate starkautosArray = new StarkautosAggregate();
        starkautosArray.add(new Automovil(150, "Starkautos", 6, "Deportivo"));
        starkautosArray.add(new Automovil(200, "Starkautos", 5, "Deportivo"));
        starkautosArray.add(automovilRepetido);
        starkautosArray.add(new Automovil(300, "Starkautos", 3, "Deportivo"));


        AutoCenterAggregate autoCenterArrayList = new AutoCenterAggregate();
        autoCenterArrayList.add(new Automovil(150, "AutoCenter", 6, "Deportivo"));
        autoCenterArrayList.add(new Automovil(200, "AutoCenter", 5, "Deportivo"));
        autoCenterArrayList.add(new Automovil(250, "AutoCenter", 4, "Deportivo"));
        autoCenterArrayList.add(automovilRepetido);

        SanchinelliAggregate sanchinelliVector = new SanchinelliAggregate();
        sanchinelliVector.add(automovilRepetido);
        sanchinelliVector.add(new Automovil(200, "Sanchinelli", 5, "Deportivo"));
        sanchinelliVector.add(new Automovil(250, "Sanchinelli", 4, "Deportivo"));
        sanchinelliVector.add(new Automovil(300, "Sanchinelli", 3, "Deportivo"));

        MasanMotorsAggregate masanMotorsStack = new MasanMotorsAggregate();
        masanMotorsStack.add(new Automovil(150, "MasanMotors", 6, "Deportivo"));
        masanMotorsStack.add(automovilRepetido);
        masanMotorsStack.add(new Automovil(250, "MasanMotors", 4, "Deportivo"));
        masanMotorsStack.add(new Automovil(300, "MasanMotors", 3, "Deportivo"));



        Iterator starkautosIterator = starkautosArray.createIterator();
        Iterator autoCenterIterator = autoCenterArrayList.createIterator();
        Iterator sanchinelliIterator = sanchinelliVector.createIterator();
        Iterator masanMotorsIterator = masanMotorsStack.createIterator();

        AduanaAggregate aduanaMap = new AduanaAggregate();


        System.out.println("----------------- Starkautos -----------------");
        while (starkautosIterator.hasNext()){
            System.out.println("Automovil " + (starkautosIterator.getPosition()+1));
            Automovil automovil = (Automovil) starkautosIterator.next();
            aduanaMap.guardar(automovil, "Starkautos");
            automovil.showInfo();
            System.out.println("");
        }

        System.out.println("----------------- AutoCenter -----------------");
        while (autoCenterIterator.hasNext()){
            System.out.println("Automovil " + (autoCenterIterator.getPosition()+1));
            Automovil automovil = (Automovil) autoCenterIterator.next();
            aduanaMap.guardar(automovil, "AutoCenter");
            automovil.showInfo();
            System.out.println("");
        }

        System.out.println("----------------- Sanchinelli -----------------");
        while (sanchinelliIterator.hasNext()){
            System.out.println("Automovil " + (sanchinelliIterator.getPosition()+1));
            Automovil automovil = (Automovil) sanchinelliIterator.next();
            aduanaMap.guardar(automovil, "Sanchinelli");
            automovil.showInfo();
            System.out.println("");
        }

        System.out.println("----------------- MasanMotors -----------------");
        while (masanMotorsIterator.hasNext()){
            System.out.println("Automovil " + (masanMotorsIterator.getPosition()+1));
            Automovil automovil = (Automovil) masanMotorsIterator.next();
            aduanaMap.guardar(automovil, "MasanMotors");
            automovil.showInfo();
            System.out.println("");
        }

        Iterator aduanaIterator = aduanaMap.createIterator();

        System.out.println("----------------- Aduana Map Iterator-----------------");
        while (aduanaIterator.hasNext()){
            System.out.println("Automovil " + (aduanaIterator.getPosition()+1));
            aduanaIterator.next().showInfo();
            System.out.println("");
        }

        int index = 1;
        System.out.println("----------------- Aduana Map-----------------");
        for(HashMap.Entry<Automovil, String> entry : aduanaMap.getAutomovilesMap().entrySet()){
            System.out.println("Automovil " + index + " importado por " + entry.getValue());
            entry.getKey().showInfo();
            System.out.println("");
            index++;
        }

    }
}
