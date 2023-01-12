package transport;

public class Car {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String carBodyType;
    private final int numberOfSeats;
    private double engineVolume;
    private String transmission;
    private String colour;
    private final String productionCountry;
    private String registrationNumber;

    public Car (String brand, String model, int productionYear, String carBodyType, int numberOfSeats,
                double engineVolume, String transmission, String colour, String productionCountry,
                String registrationNumber) {

        this.brand = (brand == null || brand.isBlank()) ? "Автомобиль " : brand;
        this.model = (model == null || model.isBlank()) ? "" : model;
        this.productionYear = (productionYear <=0 ) ? 2000 : productionYear;
        this.carBodyType = (carBodyType == null || carBodyType.isBlank()) ? "custom" : carBodyType;
        this.numberOfSeats = (numberOfSeats <=0 ) ? 4 : numberOfSeats;
        this.setEngineVolume(engineVolume);
        this.setTransmission(transmission);
        this.setColour(colour);
        this.productionCountry = (productionCountry == null || productionCountry.isBlank())
                ? "Made in ..." : productionCountry;
        this.setRegistrationNumber(registrationNumber);

    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }
    public void setTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isBlank()) ? "top secret" : transmission;
    }
    public void setColour(String colour) {
        this.colour = (colour == null || colour.isBlank()) ? "Белый" : colour;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (registrationNumber == null || registrationNumber.isBlank())
                ? "а000аа49" : registrationNumber;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getCarBodyType() {
        return carBodyType;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getColour() {
        return colour;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String changeTires (int month) {
        if (month >= 4 && month <= 11) {
            return "на летней резине...";
        } else {
            if (month <= 0 || month > 12) {
                return ";) всесезонка...";
            } else {
                return "на зимней резине...";
            }
        }
    }

    @Override
    public String toString() {
        return brand +" " + model + '\n' +
                "\t год выпуска - " + productionYear + "г.\n" +
                "\t тип кузова - '" + carBodyType + "'\n" +
                "\t количество мест - " + numberOfSeats + "\n" +
                "\t объём двигателя - " + engineVolume + " л\n " +
                "\t трансмиссия - '" + transmission + "'\n" +
                "\t цвет кузова - '" + colour + "'\n" +
                "\t страна сборки - '" + productionCountry + "'\n" +
                "\t регистрационный знак - " + registrationNumber;
    }
}