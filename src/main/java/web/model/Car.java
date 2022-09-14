package web.model;

public class Car {
    private String mark;

    private String model;

    private int yearOfModel;

    public Car() {

    }
    public Car(String mark, String model, int yearOfModel) {
        this.mark = mark;
        this.model = model;
        this.yearOfModel = yearOfModel;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }


}
