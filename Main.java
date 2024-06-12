import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList <Car> cars=new ArrayList<Car>();
        cars.add(new Car(2001, "fiat"));
        cars.add(new Car(2002, "fiat"));
        cars.add(new Car(2003, "fiat"));
        cars.add(new Car(2004, "fiat"));
        cars.add(new Car(2005, "fiat"));
        cars.add(new Car(2006, "fiat"));
        cars.add(new Car(2007, "fiat"));
        cars.add(new Car(2008, "fiat"));
        cars.add(new Car(2009, "fiat"));
        cars.add(new Car(2010, "fiat"));
        Collections.sort(cars);
        for(Car car: cars){
            System.out.println(car);
        }
    }
}