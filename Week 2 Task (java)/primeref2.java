package primandrefvariable;

public class primref2 {

    // Enum to represent days of the week
    public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    
    public static void main(String[] args) {
        // Example usage
        DaysOfWeek today = DaysOfWeek.SUNDAY; // Change this to any day of the week
        
        // Check if it's a holiday or not
        String result = isHoliday(today);
        System.out.println("Today is: " + today);
        System.out.println("Holiday status: " + result);
    }
    
    // Method to check if the day is a holiday
    public static String isHoliday(DaysOfWeek day) {
        // Saturday and Sunday are holidays
        if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
            return "Holiday";
        } else {
            return "Not Holiday";
        }
    }
}

