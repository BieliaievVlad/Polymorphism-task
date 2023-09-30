package app;

public class Device_A extends Device {
    @Override
    public String calcResult() {
        int i = getParam1() * getParam2();
        return String.valueOf(i);
    }
}
