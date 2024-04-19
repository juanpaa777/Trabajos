package hola;

public class App {
    public String getGreeting() {
        return "Hello World Juan diego pardo";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    };
}