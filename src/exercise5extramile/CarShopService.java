package exercise5extramile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarShopService {

    public static Map<String, Integer> mapCarNameToNumberOfCars(List<Car> cars) {
        Map<String, Integer> results = new HashMap<>();
        for (Car car : cars) {
            if (results.containsKey(car.name())) {
                results.put(car.name(), (results.get(car.name()) + 1));
            } else {
                results.put(car.name(), 1);
            }
        }
        return results;
    }

    public static Map<String, Integer> mapCarNameToNumberOfKm(List<Car> cars) {
        Map<String, Integer> results = new HashMap<>();
        for (Car car : cars) {
            if (results.containsKey(car.name())) {
                results.put(car.name(), (results.get(car.name()) + car.km()));
            } else {
                results.put(car.name(), car.km());
            }
        }
        return results;
    }

    public static Map<KmRange, List<Car>> mapKmRangeToListOfCars(List<Car> cars) {
        Map<KmRange, List<Car>> results = new HashMap<>();
        for (Car car : cars) {
            if (results.containsKey(determineKmRangeFromCar(car.km()))) {
                results.get(determineKmRangeFromCar(car.km())).add(car);
            } else {
                List<Car> values = new ArrayList<>();
                values.add(car);
                results.put(determineKmRangeFromCar(car.km()), values);
            }
        }
        return results;
    }

    public static Map<PriceRange, List<Car>> mapPriceRangeToListOfCars(List<Car> cars) {
        Map<PriceRange, List<Car>> results = new HashMap<>();
        for (Car car : cars) {
            if (results.containsKey(determinePriceRangeFromCar(car.price()))) {
                results.get(determinePriceRangeFromCar(car.price())).add(car);
            } else {
                List<Car> values = new ArrayList<>();
                values.add(car);
                results.put(determinePriceRangeFromCar(car.price()), values);
            }
        }
        return results;
    }

    private static KmRange determineKmRangeFromCar(int carKm) {
        KmRange result = null;
        if (carKm <= 0) {
            System.out.println("Wrong number of kilometers!");
        } else if (carKm <= 10000) {
            result = KmRange.KM0TO10000;
        } else if (carKm <= 20000) {
            result = KmRange.KM10001TO20000;
        } else if (carKm <= 30000) {
            result = KmRange.KM20001TO30000;
        } else if (carKm <= 40000) {
            result = KmRange.KM30001TO40000;
        } else if (carKm <= 50000) {
            result = KmRange.KM40001TO50000;
        } else {
            result = KmRange.KMOVER50000;
        }
        return result;
    }

    private static PriceRange determinePriceRangeFromCar(int carPrice) {
        PriceRange result = null;
        if (carPrice <= 0) {
            System.out.println("Wrong car price!");
        } else if (carPrice <= 1000) {
            result = PriceRange.PRICE_UNDER_1000;
        } else if (carPrice <= 10000) {
            result = PriceRange.PRICE_BETWEEN_1000_AND_10000;
        } else {
            result = PriceRange.PRICE_OVER_10000;
        }
        return result;
    }
}
