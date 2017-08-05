import java.util.ArrayList;

public class TestDealership {
    public static void main(String [] args) {

        // add objects to heap
        Manager m = new Manager("Juan Sanchez");
        SalesPerson s1 = new SalesPerson("Beavis");
        SalesPerson s2 = new SalesPerson("Butt Head");
        SalesPerson s3 = new SalesPerson("Ren");
        SalesPerson s4 = new SalesPerson("Stimpy");
        Car c1 = new Car("GMC", 75000.00, 2013, "AB9876543");
        Car c2 = new Car("BMW", 65000, 2010, "CD4569876");
        Car c3 = new Car("Honda", 18000, 2012, "EF0987654");
        Car c4 = new Car("Toyota", 21000, 2017, "GH2756473");
        Car c5 = new Car("Hyundai", 800, 1997, "IJ2867432");
        Car c6 = new Car("Chevrolet", 32000, 2010, "KL9871236");
        Car c7 = new Car("Dodge", 16000, 2012, "MN0192837");
        Car c8 = new Car("Audi", 145000, 2016, "OP9812765");
        Car c9 = new Car("DeLorean", 175000, 1982, "QR0864208");
        Car c10 = new Car("Tesla", 85000, 2012, "ST9267431");

        //Add all new records to ArrayLists in class Dealership
        Dealership d = new Dealership(m);
        d.addSalesPerson(s1);
        d.addSalesPerson(s2);
        d.addSalesPerson(s3);
        d.addSalesPerson(s4);
        d.addCar(c1);
        d.addCar(c2);
        d.addCar(c3);
        d.addCar(c4);
        d.addCar(c5);
        d.addCar(c6);
        d.addCar(c7);
        d.addCar(c8);
        d.addCar(c9);
        d.addCar(c10);

        // tests of methods in class Dealership
        d.removeSalesPerson(s3);
        d.carSold(s1, c5);
        d.carSold(s2, c8);

        // output of toString() for class Dealership
        System.out.print(d.toString());
        System.exit(0);
    }
}

class Dealership {
    private ArrayList<SalesPerson> sp = new ArrayList<SalesPerson>();
    private ArrayList<Car> cars = new ArrayList<Car>();
    private Manager mg;

    public Dealership(Manager m) {
        mg = m;
    }

    public void addCar(Car another) {
        cars.add(another);
    }

    public void addSalesPerson(SalesPerson s) {
        sp.add(s);
    }

    public void removeSalesPerson(SalesPerson s) {
        sp.remove(s);
    }

    public void carSold(SalesPerson s, Car aCar) {
        if (cars.contains(aCar)) {
            double p = aCar.getPrice();
            s.setBonus(p * .30);
            removeCar(aCar);
        } else {
            System.out.println(aCar.toString() + " has already Sold");
        }
    }

    public void removeCar(Car aCar) {
        cars.remove(aCar);
    }

    public SalesPerson getPersonOfTheMonth() {
        double max = 0.0;
        SalesPerson x = null;
        for (SalesPerson s : sp) {
            if (s.getBonus() > max) {
                max = s.getBonus();
                x = s;
            }
        }
        return x;
    }

    public String toString() {
        String out = "Dealership Resources....\n\n";

        out += mg.toString() + "\n";

        for (SalesPerson s : sp) {
            out += s.toString() + "\n";
        }

        for (Car a : cars) {
            out += a.toString() + "\n";
        }

        out += "Sales Person of the Month  \n";
        out += this.getPersonOfTheMonth() + "\n";

        return out;
    }
}