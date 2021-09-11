package models;

import java.util.Date;

public class History {

   Date parkedOn;
   Date releaseOn;

   double vehiclePrice;

   public History(Date parkedOn, Date releaseOn, double vehiclePrice) {
      this.parkedOn = parkedOn;
      this.releaseOn = releaseOn;
      this.vehiclePrice = vehiclePrice;
   }

   public History() {
   }

   public Date getParkedOn() {
      return parkedOn;
   }

   public void setParkedOn(Date parkedOn) {
      this.parkedOn = parkedOn;
   }

   public Date getReleaseOn() {
      return releaseOn;
   }

   public void setReleaseOn(Date releaseOn) {
      this.releaseOn = releaseOn;
   }

   public double getVehiclePrice() {
      return vehiclePrice;
   }

   public void setVehiclePrice(double vehiclePrice) {
      this.vehiclePrice = vehiclePrice;
   }
}
