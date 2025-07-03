public class Main {
    public void myMethod() {
        int x = 1;
        int y = 2;
        int q = x + y; // fixed declaration
        System.out.println(q);
    }

    public static void main(String[] args) {
        System.out.println("Samarth"); // fixed quotes

        // Optional: call myMethod
        Main obj = new Main();
        obj.myMethod();
    }
}
