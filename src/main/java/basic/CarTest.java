package basic;

public class CarTest {

    public static void main(String args[]) {
        Car carobj = new Car();
        carobj.type = Car.CarType.SUV ;

        System.out.println("My next car will be Rangerover Velar : " +  carobj.type);

    }
}
