package database;

import enums.ParkingLotStatus;
import enums.VehicleType;
import models.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Lots {

   private static final List<ParkingLot> parkingLots = new ArrayList<>();

   public static List<ParkingLot> getParkingLots() {


      parkingLots.add(new ParkingLot("1", VehicleType.CAR, 40.55, ParkingLotStatus.AVAILABLE, null,
              null));
      parkingLots.add(new ParkingLot("2", VehicleType.CAR, 20.99, ParkingLotStatus.AVAILABLE, null,
              null));
      parkingLots.add(new ParkingLot("3", VehicleType.CAR, 40.55, ParkingLotStatus.AVAILABLE, null,
              null));
      parkingLots.add(new ParkingLot("4", VehicleType.CAR, 20.99, ParkingLotStatus.AVAILABLE, null,
              null));
      parkingLots.add(new ParkingLot("5", VehicleType.CAR, 40.55, ParkingLotStatus.AVAILABLE, null,
              null));
      parkingLots.add(new ParkingLot("6", VehicleType.CAR, 20.99, ParkingLotStatus.AVAILABLE, null,
              null));
      return parkingLots;
   }
}
