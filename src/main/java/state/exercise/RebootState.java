package state.exercise;

import java.util.Arrays;

public class RebootState implements IStateComputer {


    @Override
    public void startComputerState(Computer computer) {
        System.out.println("-------------------Reboot State-------------------");
        System.out.println("Closing " + computer.getOpenProgramsNumber() + " programs and rebooting...");
        Arrays.fill(computer.getOpenPrograms(), null);
        computer.setOpenProgramsNumber(0);
        computer.getCpu().setCpuUsedPercentage(0);
        computer.getRam().setMemoryUsedPercentage(0);
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rebooted");
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
        System.out.println("CPU usage: " + computer.getCpu().getCpuUsedPercentage() + "%");
        System.out.println("RAM usage: " + computer.getRam().getMemoryUsedPercentage() + "%");
    }
}
