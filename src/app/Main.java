package app;

public class Main {



    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.setParams();
        System.out.printf("Result: %s", controller.getResult());


    }
}
