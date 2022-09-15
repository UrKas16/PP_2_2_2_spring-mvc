package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{
    private final List<Car> carList;

    public CarServiceImpl() {
        this.carList = new ArrayList<>();
        carList.add(new Car("Dolorean", "DMC-12", 1982));
        carList.add(new Car("Kia", "K5", 2022));
        carList.add(new Car("Kia", "Rio", 2013));
        carList.add(new Car("Audi", "Q8", 2020));
        carList.add(new Car("Lada", "Vesta", 2018));
    }

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> returnCarsQnty(int pcsCar) {
        return getCarList().stream().limit(pcsCar).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "CarService{" +
                "carList=" + carList +
                '}';
    }
}


