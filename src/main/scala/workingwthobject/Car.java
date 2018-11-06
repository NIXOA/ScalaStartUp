package main.scala.workingwthobject;

/**
 * 一个属性遵守Bean的Java类
 * @Author yekai
 * @Date 2018/11/6 19:31
 */
public class Car {
    private final int year;
    private int miles;

    public Car(int yearOfWeak) {
        this.year = yearOfWeak;
    }

    public void driver(int distance){
        miles+=Math.abs(distance);
    }

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
