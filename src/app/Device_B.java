package app;

public class Device_B extends Device {

    private static final int MULTIPLIER = 2;

    public int calcResult() {
        return (getParam1() + getParam2()) * MULTIPLIER;
    }
}
