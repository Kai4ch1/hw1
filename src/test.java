
public class test {
    public static void main(String[] args) {
        int difference, time1, minutes1, seconds1, time2, minutes2, seconds2;
        time1 = 1;
        time2 = 1;

        minutes1 = 4;
        minutes2 = 6;

        seconds1 = 55;
        seconds2 = 56;

        seconds1 += time1 * 3600 + minutes1 * 60;
        seconds2 += time2 * 3600 + minutes2 * 60;

        difference =  seconds2 - seconds1;
        System.out.println("Answer is: " + difference );
    }
}
