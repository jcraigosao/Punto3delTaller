
package EjeCarro;

public class Main {
    public static void main(String[] args) {
        Wheel[] front= new Wheel[2];
        Wheel[] rear= new Wheel[2];
        Car carro= new Car ("rojo","ferrari", front, rear);
        rear [0]= new Wheel(15.5, "negro", "michellin", carro.getMotor());
        rear [1]= new Wheel(15.5, "negro", "michellin", carro.getMotor());
        front[0]= new Wheel(15.5, "negro", "michellin");
        front[1]= new Wheel(15.5, "negro", "michellin");
        carro.listar();
    }
 
}
