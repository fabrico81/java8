package java8.cpt_5;

public class Car {

    private String stable;
    private Driver driver;

    public Car(String stable, Driver driver){
        setDriver(driver);
        setStable(stable);
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getStable() {
        return stable;
    }

    public void setStable(String stable) {
        this.stable = stable;
    }

    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Car: ");
        details.append(getStable() + "\n");
        details.append("Driver: ");
        details.append(getDriver().getName());
        return details.toString();
    }
}
