package web.model;

public class Car {
    private String name;
    private int series;
    private int dateOfManufacture;

    public Car(String name, int series, int dateOfManufacture) {
        this.name = name;
        this.series = series;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Car name: " + name + ", series: " + series + ", date of manufacture: " + dateOfManufacture;
    }
}
