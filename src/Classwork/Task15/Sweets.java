package Classwork.Task15;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Sweets {
    private String name;
    private String param;
    private double weight;
    private double price;

    public Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.param = "dop";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
