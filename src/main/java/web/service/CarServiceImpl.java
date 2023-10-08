package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> allCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("HAVAL", "black", 1));
        cars.add(new Car(" Scoda", "yelow", 2));
        cars.add(new Car("Ford", "white", 3));
        cars.add(new Car("Lamborgini ", "purple", 4));
        cars.add(new Car("MINI ", "blue", 5));
        return cars;
    }


    @Override
    public List<Car> getCarFromListAndCount(List<Car> cars, Integer count) {
        if (count == null) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
