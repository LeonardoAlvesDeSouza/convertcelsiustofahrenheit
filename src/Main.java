// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        double temperaturaEmCelsius = 38.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        System.out.println(("Temperatura em Celsius: %fº\n" +
                            "Temperatura em Fahrenheit %fº\n").formatted(temperaturaEmCelsius, temperaturaEmFahrenheit));
        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("Temperatura em Fahrenheit Inteira: " + temperaturaEmFahrenheitInteira);


    }
}