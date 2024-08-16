/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mugisha.traintraveltime;

/**
 *
 * @author HP
 */
public class TrainTravelTime {

    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in km
        int stopDistance = 150; // Distance between stops for offloading and loading passengers
        int stopTime = 5; // Time taken for each stop in minutes
        int speed = 250; // Train speed in km/h

        int passengersStops = (int) Math.ceil((double) totalDistance / stopDistance);
        int totalStopTime = passengersStops * stopTime;
        int travelTime = (int) Math.ceil((double) totalDistance / speed);

        System.out.println("The total time taken to travel from Kampala to Kabale is " + (travelTime + totalStopTime) + " minutes.");
    }
}
