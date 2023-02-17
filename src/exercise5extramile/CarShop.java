package exercise5extramile;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private List<Car> carsInShop = new ArrayList<>();

    public CarShop() {
    }

    public CarShop(List<Car> carsInShop) {
        this.carsInShop = carsInShop;
    }

    public List<Car> getCarsInShop() {
        return carsInShop;
    }

    public void setCarsInShop(List<Car> carsInShop) {
        this.carsInShop = carsInShop;
    }

    @Override
    public String toString() {
        return "CarShop{" +
                "carsInShop=" + carsInShop +
                '}';
    }
}
