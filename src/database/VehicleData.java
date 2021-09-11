package database;

import models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleData {
   private static final List<Vehicle> vehicles = new ArrayList<>();

   public static void addVehicleData(Vehicle vehicle) {
      vehicles.add(vehicle);
   }

   public static Vehicle searchVehicle(String number) {
      for (Vehicle vehicle : vehicles) {
         if (vehicle.getVehicleNumber().equals(number)) {
            return vehicle;
         }
      }
      return null;
   }


}
