import java.time.LocalTime;

public class RegisterTimeLeft {
    public static void main(String[] args) {
        LocalTime currTime = LocalTime.now();
        LocalTime regEndTime = LocalTime.of(17,30,0);
        LocalTime regStartTime = LocalTime.of(9,0,0);
        int hoursLeft = regEndTime.getHour() - currTime.getHour();
        int minutesLeft = regEndTime.getMinute() - currTime.getMinute();
        System.out.println("you have " + hoursLeft + " hours and " + minutesLeft + " minutes left to register.");

}
