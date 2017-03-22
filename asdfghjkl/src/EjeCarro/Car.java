
package EjeCarro;

public class Car {

private String color;
private String marca;
private Wheel []front;
private Wheel []rear;
private Engine motor;

    public Car(String color, String marca, Wheel[] front, Wheel[] rear) {
        this.color = color;
        this.marca = marca;
        this.front = front;
        this.rear = rear;
        this.motor= new Engine("Chevrolet", 45, "R16", rear) ;
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

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }
        
    
    
    public Wheel[] getFront() {
        return front;
    }

    public void setFront(Wheel[] front) {
        this.front = front;
    }

    public Wheel[] getRear() {
        return rear;
    }

    public void setRear(Wheel[] rear) {
        this.rear = rear;
    }
    public void listar(){
        System.out.println("Carro: "+marca +"  "+ color);
        System.out.println("Motor: " + motor.getMarca()+"  "+ motor.getReferncia());
        System.out.println("Llantas delanteras: ");
        System.out.println("1. "+ front[0].getMarca() +"  "+ front[0].getColor()+"  "+ front[0].getTamaño());
        System.out.println("2. "+ front[1].getMarca() +"  "+ front[1].getColor()+"  "+ front[1].getTamaño());
        System.out.println("Llantas traseras: ");
        System.out.println("1. "+ rear[0].getMarca() +"  "+ rear[0].getColor()+"  "+ rear[0].getTamaño());
        System.out.println("2. "+ rear[1].getMarca() +"  "+ rear[1].getColor()+"  "+ rear[1].getTamaño());
        
    }

    
        }
            
       
