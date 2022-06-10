package state.exercise;

import java.util.Arrays;

public class Computer {
    private String[] openPrograms = new String[20];

    private String[] installedPrograms = {"Mozilla Firefox", "Word", "Discord", "Visual Studio Code", "Photoshop"};

    private int openProgramsNumber;

    private RAM ram;

    private CPU cpu;

    public String[] getInstalledPrograms() {
        return installedPrograms;
    }

    private IStateComputer state = new ShutdownState();

    public Computer(RAM ram, CPU cpu) {
        this.openProgramsNumber = 0;
        Arrays.fill(this.openPrograms, null);
        this.ram = ram;
        this.cpu = cpu;
    }

    public String[] getOpenPrograms() {
        return openPrograms;
    }

    public void setOpenPrograms(String[] openPrograms) {
        this.openPrograms = openPrograms;
    }

    public int getOpenProgramsNumber() {
        return openProgramsNumber;
    }

    public void setOpenProgramsNumber(int openProgramsNumber) {
        this.openProgramsNumber = openProgramsNumber;
    }

    public RAM getRam() {
        return ram;
    }

    public Computer setRam(RAM ram) {
        this.ram = ram;
        return this;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Computer setCpu(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public IStateComputer getState() {
        return state;
    }

    public void setState(IStateComputer state) {
        this.state = state;
    }

    public void startComputerState(){
        this.state.startComputerState(this);
    }

    public void openProgram(String program) {
        this.state.openProgram(this, program);
    }

    public void resourceManager() {
        this.state.resourceManager(this);
    }
}
