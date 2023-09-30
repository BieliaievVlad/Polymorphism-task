package app;

public class Device_B extends Device {

    private static final int MULTIPLIER = 2;
    @Override
    public String calcResult() {
        int i = (getParam1() + getParam2()) * MULTIPLIER;
        return String.valueOf(i);
    }
}
