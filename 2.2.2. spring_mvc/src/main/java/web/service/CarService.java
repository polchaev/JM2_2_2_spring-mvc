package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car(1967, "Chevrolet Impala", 1));
        carList.add(new Car(1981, "DeLorean DMC - ", 2));
        carList.add(new Car(1968, "Dodge Charger Magnum", 3));
        carList.add(new Car(1959, "Cadillac Ecto - ", 4));
        carList.add(new Car(1986, "Fleetwood Bounder RV", 5));
        carList.add(new Car(1968, "Ford Mustang GT - ", 6));
        carList.add(new Car(1973, "XB GT Ford Falcon Pursuit Special", 7));
        carList.add(new Car(1982, "Pontiac Trans Am", 8));
        carList.add(new Car(1955, " Ford Lincoln Futura", 9));
    }

    public List<Car> getCarList(int count) {
        if ((count == 0) || (count >= 5)) {
            count = carList.size();
        }
        return carList.subList(0, count);
    }
}
