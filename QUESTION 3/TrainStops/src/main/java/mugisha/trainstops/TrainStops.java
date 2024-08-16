/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mugisha.trainstops;

/**
 *
 * @author HP
 */
public class TrainStops {

    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in km
        int stopDistance = 150; // Distance between stops for offloading and loading passengers
        int refuelDistance = 200; // Distance between stops for refueling

        int passengersStops = (int) Math.ceil((double) totalDistance / stopDistance);
        int refuelingStops = (int) Math.ceil((double) totalDistance / refuelDistance);

        System.out.println("The train should stop " + passengersStops + " times to offload and load passengers.");
        System.out.println("The train should stop " + refuelingStops + " times for refueling.");
    }
}
