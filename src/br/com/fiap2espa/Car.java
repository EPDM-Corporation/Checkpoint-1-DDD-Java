package br.com.fiap2espa;

public class Car {
    String brand;
    String model;
    int year;

    // Construtor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Método para exibir informações
    public void showInfo() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Ano: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2018);

        car1.showInfo();
        car2.showInfo();
    }
}