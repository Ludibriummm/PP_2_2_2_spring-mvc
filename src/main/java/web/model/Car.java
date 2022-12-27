package web.model;

public class Car {
    private int yearOfIssue;
    private String brand;
    private String model;

    public Car() {
    }

    public Car(int yearOfIssue, String brand, String model) {
        this.yearOfIssue = yearOfIssue;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return  "Model: " + model +
                ", Brand: " + brand + '\n' +
                ", Year of the vehicle: " + yearOfIssue + '\n';
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
