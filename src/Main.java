import transport.Car;

public class Main {

    public static void main(String[] args) {
        Car superCar = new Car ();
        String superTires = superCar.changeTires(0);

        Car car [] = new Car[5];
        car [0] = new Car("", "Mark II", 1992, "седан", 5,3.0,
                "МКПП","White Pearl", "Япония", "");
        car [1] = new Car("Audi", null, 2020, "седан", 5,3.0,
                "МКПП","Чёрный", "Германия", "п234на161");
        car [2] = new Car("BMW", "Z8", 2021, "седан", 0,3.0,
                "АКПП"," ", "Германия", "у054ра178");
        car [3] = new Car("Kia", "Sportage IV", 2018, null, 5,-2,
                "","Красный", "Южная Корея", "л543на23");
        car [4] = new Car("Hyundai", "Avante", 0, "седан", 5,1.6,
                "МКПП","Оранжевый", null, "а100аа27");

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
            System.out.println("\t " + superTires + "\n");
        }

        System.out.println(car[0].getBrand() + " " + car[0].getModel() + " ");
        superCar.unlockStarted();
    }
}