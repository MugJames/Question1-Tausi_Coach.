/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mugisha.secondcoacharrivaltime;

/**
 *
 * @author HP
 */
public class SecondCoachArrivalTime {

    public static void main(String[] args) {
        int distance = 10000; // Total distance in m
        double speed = 225.5; // Train speed in m/s
        int startTime = 9 * 60 + 0; // Start time in minutes

        double travelTime = (double) distance / speed; // Travel time in seconds
        int arrivalTimeMinutes = startTime + (int) Math.ceil(travelTime / 60);
        int arrivalHours = arrivalTimeMinutes / 60;
        int arrivalMinutes = arrivalTimeMinutes % 60;

        System.out.printf("The second coach will arrive in Kampala at approximately %02d:%02d.", 
                arrivalHours, arrivalMinutes);
    }
}

