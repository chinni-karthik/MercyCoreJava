package conditional;

public class ExampleSwitchCaseEnhanced {
    public static void main(String[] args) {
        int day = 5;
        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "invalid day";
        };
        System.out.println("The day is : "+dayName);
    }
}
