
package EjeCarro;

public class Engine {
    private String marca;
    private double peso;
    private String referncia;
    private Wheel[] axle;

    public Engine(String marca, double peso, String referncia, Wheel[] axle) {
        this.marca = marca;
        this.peso = peso;
        this.referncia = referncia;
        this.axle= axle;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getReferncia() {
        return referncia;
    }

    public void setReferncia(String referncia) {
        this.referncia = referncia;
    }

    public Wheel[] getAxle() {
        return axle;
    }

    public void setAxle(Wheel[] axle) {
        this.axle = axle;
    }
    
    
}
