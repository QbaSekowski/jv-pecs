package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("MAN", "blue", "Jan Kowalski"));
        truckList.add(new Truck("Scania", "green", "Ryszard Zieblinski"));
        truckList.add(new Truck("Mercedes", "white", "Tomasz Bilewicz"));
        return truckList;
    }
}
