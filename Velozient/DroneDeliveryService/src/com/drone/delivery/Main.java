package com.drone.delivery;

import com.drone.entity.Drone;
import com.drone.entity.Location;

public class Main {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.addDrone(new Drone("Drone A", 200));
        deliveryService.addDrone(new Drone("Drone B", 250));
        deliveryService.addDrone(new Drone("Drone C", 100));

        deliveryService.addLocation(new Location("Location A", 200));
        deliveryService.addLocation(new Location("Location B", 150));
        deliveryService.addLocation(new Location("Location C", 50));
        deliveryService.addLocation(new Location("Location D", 150));
        deliveryService.addLocation(new Location("Location E", 100));
        deliveryService.addLocation(new Location("Location F", 200));
        deliveryService.addLocation(new Location("Location G", 50));
        deliveryService.addLocation(new Location("Location H", 80));
        deliveryService.addLocation(new Location("Location I", 70));
        deliveryService.addLocation(new Location("Location J", 50));
        deliveryService.addLocation(new Location("Location K", 30));
        deliveryService.addLocation(new Location("Location L", 20));
        deliveryService.addLocation(new Location("Location M", 50));
        deliveryService.addLocation(new Location("Location N", 30));
        deliveryService.addLocation(new Location("Location O", 20));
        deliveryService.addLocation(new Location("Location P", 90));

        deliveryService.displayDeliveries();
    }

}
