package state.exercise;

import java.util.Random;

public class PowerOnState implements IStateComputer {


    @Override
    public void startComputerState(Computer computer) {
        System.out.println("-------------------PowerOn State-------------------");
        int randomOpenProgramsNumber = new Random().nextInt(computer.getOpenPrograms().length);
        for(int i = 0; i < randomOpenProgramsNumber; i++) {
            computer.getOpenPrograms()[i] = computer.getInstalledPrograms()[new Random().nextInt(computer.getInstalledPrograms().length)];
        }
        computer.setOpenProgramsNumber(randomOpenProgramsNumber);
        computer.getCpu().setCpuUsedPercentage(randomOpenProgramsNumber * 5);
        computer.getRam().setMemoryUsedPercentage(randomOpenProgramsNumber * 5);
    }

    @Override
    public void openProgram(Computer computer, String programName) {
        System.out.println("Opening program " + programName + "...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(computer.getOpenProgramsNumber() < computer.getOpenPrograms().length) {
            computer.setOpenProgramsNumber(computer.getOpenProgramsNumber() + 1);
            computer.getOpenPrograms()[computer.getOpenProgramsNumber() - 1] = programName;
            computer.getCpu().setCpuUsedPercentage(computer.getCpu().getCpuUsedPercentage() + 5);
            computer.getRam().setMemoryUsedPercentage(computer.getRam().getMemoryUsedPercentage() + 5);
            System.out.println("Successfully opened program " + programName);
        } else {
            System.out.println("ERROR> The computer ran out of RAM and CPU resources.");
        }
    }

    @Override
    public void resourceManager(Computer computer) {
        System.out.println("There is " + computer.getOpenProgramsNumber() + " open programs.");
        for(int i = 0; i < computer.getOpenProgramsNumber(); i++) {
            System.out.println(" - Program " + (i + 1) + ": " + computer.getOpenPrograms()[i]);
        }
        System.out.println("CPU usage: " + computer.getCpu().getCpuUsedPercentage() + "%");
        System.out.println("RAM usage: " + computer.getRam().getMemoryUsedPercentage() + "%");
    }
}
