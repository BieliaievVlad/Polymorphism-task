package app;

public class Device {



    private static int param1;
    private static int param2;

    public int getParam1() {
        return param1;
    }
    public void setParam1(int param1) {
        this.param1 = param1;
    }
    public int getParam2() {
        return param2;
    }
    public void setParam2(int param2) {
        this.param2 = param2;
    }
    public String calcResult() {
        return String.valueOf(param1 + param2);
    }

}
