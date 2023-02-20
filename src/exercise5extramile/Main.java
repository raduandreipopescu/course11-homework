package exercise5extramile;

public class Main {
    public static void main(String[] args) {
        CarShop myCarShop = new CarShop();
        myCarShop.getCarsInShop().add(0, new Car("Dacia", 15, 9999, 500));
        myCarShop.getCarsInShop().add(1, new Car("Dacia", 1, 10, 25000));
        myCarShop.getCarsInShop().add(2, new Car("Aro", 35, 50000, 100));
        myCarShop.getCarsInShop().add(3, new Car("Oltcit", 30, 35000, 500));
        myCarShop.getCarsInShop().add(4, new Car("Oltcit", 30, 15000, 600));

        System.out.println(myCarShop);
        System.out.println("5.1 Map from car name to number of cars: \n" + CarShopService.mapCarNameToNumberOfCars(myCarShop.getCarsInShop()));
        System.out.println("5.2 Map from car name to number of km: \n" + CarShopService.mapCarNameToNumberOfKm(myCarShop.getCarsInShop()));
        System.out.println("5.3 Map from km range to car list: \n" + CarShopService.mapKmRangeToListOfCars(myCarShop.getCarsInShop()));
        System.out.println("5.4 Map from price range to car list: \n" + CarShopService.mapPriceRangeToListOfCars(myCarShop.getCarsInShop()));
    }
}
