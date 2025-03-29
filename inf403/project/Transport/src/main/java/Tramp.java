public class Tramp extends Transport {
    public Tramp(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(number, routeNumber, workTimeBegin, workTimeEnd);
    }

    public String toString() {
        return "Tramp: " + number + ", " + routeNumber + ", " + workTimeBegin + ", " + workTimeEnd;
    }
}
