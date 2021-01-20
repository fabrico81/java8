package designpattern.creational.builder;

import designpattern.creational.builder.car.CarType;
import designpattern.creational.builder.car.Manual;
import designpattern.creational.builder.component.Engine;
import designpattern.creational.builder.component.GPSNavigator;
import designpattern.creational.builder.component.Transmission;
import designpattern.creational.builder.component.TripComputer;

/**
 * @author faber
 */

public class CarManualBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarType(CarType carType) {
        this.type = carType;
    }

    @Override
    public void setSeats(int sets) {
        this.seats = sets;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission,tripComputer,gpsNavigator);
    }
}
