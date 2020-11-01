package web.model;

public class Car {
    private int yearOld;
    private String model;
    private int series;

    public Car() {
    }

    public Car(int yearOld, String model, int series) {
        this.yearOld = yearOld;
        this.model = model;
        this.series = series;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
