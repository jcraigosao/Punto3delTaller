
package EjeCarro;


public class Wheel {
    private double tamaño;
    private String color;
    private String marca;
    private Engine axle; 

    public Wheel(double tamaño, String color, String marca, Engine axle) {
        this.tamaño = tamaño;
        this.color = color;
        this.marca = marca;
        this.axle= axle;
    }
    public Wheel(double tamaño, String color, String marca) {
        this.tamaño = tamaño;
        this.color = color;
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Engine getAxle() {
        return axle;
    }

    public void setAxle(Engine axle) {
        this.axle = axle;
    }
    
    
}
