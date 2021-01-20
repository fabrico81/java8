package designpattern.creational.builder;

import designpattern.creational.builder.car.CarType;
import designpattern.creational.builder.component.Engine;
import designpattern.creational.builder.component.GPSNavigator;
import designpattern.creational.builder.component.Transmission;
import designpattern.creational.builder.component.TripComputer;

/**
 * @author faber
 */

public interface Builder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
