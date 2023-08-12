class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
    }

    // Métodos getter y setter para cada atributo
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

public class Taller {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Yaris", 2022, "Blanco", 25000.0);
        Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic", 2021, "Rojo", 22000.0);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Mustang", 2023, "Azul", 45000.0);
        Vehiculo vehiculo4 = new Vehiculo("Chevrolet", "Cruze", 2020, "Negro", 18000.0);
        Vehiculo vehiculo5 = new Vehiculo("Nissan", "Sentra", 2022, "Gris", 20000.0);

        System.out.println("Información de los vehículos en el taller:");
        System.out.println("=====================================");
        mostrarInformacionVehiculo(vehiculo1);
        mostrarInformacionVehiculo(vehiculo2);
        mostrarInformacionVehiculo(vehiculo3);
        mostrarInformacionVehiculo(vehiculo4);
        mostrarInformacionVehiculo(vehiculo5);
    }

    public static void mostrarInformacionVehiculo(Vehiculo vehiculo) {
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Año: " + vehiculo.getAño());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Precio: Q" + vehiculo.getPrecio());
        System.out.println("-------------------------------------");
    }
}