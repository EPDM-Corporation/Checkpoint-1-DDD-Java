public class ConversaoTemperatura {

    // Função que recebe Fahrenheit e retorna Celsius
    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit = 77;
        double celsius = fahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }
}