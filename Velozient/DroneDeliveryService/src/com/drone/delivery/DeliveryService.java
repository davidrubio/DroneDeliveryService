package com.drone.delivery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.drone.entity.Drone;
import com.drone.entity.Location;
import com.drone.entity.Route;

public class DeliveryService {
	private List<Drone> drones;
	private List<Location> locations;
	private List<Route> routes;

	public DeliveryService() {
		drones = new ArrayList<>();
		locations = new ArrayList<>();
		routes = new ArrayList<>();
	}

	public void addDrone(Drone drone) {
		drones.add(drone);
	}

	public void addLocation(Location location) {
		locations.add(location);
	}

	public void displayDeliveries() {
		Collections.sort(locations, new Comparator<Location>() {
			@Override
			public int compare(Location p1, Location p2) {
				return Integer.compare(p1.getPackageWeight(), p2.getPackageWeight());
			}
		});

		for (Drone drone : drones) {
			int currentWeight = 0;
			List<Location> currentLocations = new ArrayList<>();
			for (Location location : locations) {
				if (currentWeight + location.getPackageWeight() <= drone.getMaxWeight() && location.isAvailable()) {
					currentWeight += location.getPackageWeight();
					location.setAvailable(false);
					currentLocations.add(location);
				}
			}
			Route newRoute = new Route(drone, currentLocations);
			routes.add(newRoute);
		}

		for (Route route : routes) {
			System.out.println(route.getDrone().getName());
			for (Location location : route.getLocations()) {
				System.out.println(location.getName());
			}
			System.out.println();
		}
	}
}