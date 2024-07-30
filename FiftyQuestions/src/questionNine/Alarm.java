package questionNine;

import java.util.Scanner;

public class Alarm {

    public static String ringAlarm(int day, boolean vacation) {
        // Check for valid inputs
        if (day < 0 || day > 6) {
            return "Invalid Inputs";
        }
        
        // Return alarm time based on the rules
        if (day >= 1 && day <= 5) { // Weekdays
            if (vacation) {
                return "10:00";
            } else {
                return "07:00";
            }
        } else { // Weekends (day 0 or 6)
            if (vacation) {
                return "OFF";
            } else {
                return "10:00";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the day of the week (0=Sun, 1=Mon, ..., 6=Sat): ");
        int day = scanner.nextInt();
        
        System.out.print("Are you on vacation? (true/false): ");
        boolean vacation = scanner.nextBoolean();
        
        // Get and print the alarm time
        String alarmTime = ringAlarm(day, vacation);
        System.out.println("The alarm should ring at: " + alarmTime);
        
        // Close the scanner
        scanner.close();
    }
}
