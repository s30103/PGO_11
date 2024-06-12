import java.util.ArrayList;

public class Car implements Comparable<Car> {
    public int yearOfProduction;
    public String brand;
    public Car(int yearOfProduction, String brand){
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
    }
    


    public int compareTo(Car otherCar) {
        return Integer.compare(this.yearOfProduction, otherCar.yearOfProduction);
    }
}
