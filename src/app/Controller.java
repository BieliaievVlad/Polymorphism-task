package app;

import java.util.Scanner;

public class Controller {

    static Scanner scan = new Scanner(System.in);

    public static void setParams() {
        Device device = new Device();
        System.out.print("Enter parameter 1 value: ");
        device.setParam1(scan.nextInt());
        System.out.print("Enter parameter 2 value: ");
        device.setParam2(scan.nextInt());
        scan.nextLine();
    }

    public static String getResult() {
        System.out.print("Which device do you want to use: A or B: ");
        String choice = scan.nextLine();
        if (choice.equals("A")) {
            Device_A deviceA = new Device_A();
            return String.valueOf(deviceA.calcResult());
        } else if (choice.equals("B")) {
            Device_B deviceB = new Device_B();
            return String.valueOf(deviceB.calcResult());
        } else {
            Error error = new Error();
            return error.getErrMsg();
        }
    }
}
