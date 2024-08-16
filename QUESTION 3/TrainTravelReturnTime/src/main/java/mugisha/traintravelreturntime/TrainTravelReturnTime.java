/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mugisha.traintravelreturntime;

/**
 *
 * @author HP
 */
public class TrainTravelReturnTime {

    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in km
        int refuelDistance = 200; // Distance between stops for refueling
        int stopTime = 5; // Time taken for each stop in minutes
        int speed = 250; // Train speed in km/h

        int refuelingStops = (int) Math.ceil((double) totalDistance / refuelDistance);
        int totalStopTime = refuelingStops * stopTime;
        int travelTime = (int) Math.ceil((double) totalDistance / speed);

        System.out.println("The total time spent on the journey back from Kabale to Kampala is " + 
                (travelTime + totalStopTime) + " minutes.");
    }
}
