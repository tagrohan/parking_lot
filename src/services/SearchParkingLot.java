package services;

import database.Lots;
import models.ParkingLot;

import java.util.List;

public class SearchParkingLot {

   List<ParkingLot> parkingLots;

   public static List<ParkingLot> getParkingLots() {
      return Lots.getParkingLots();
   }


}
