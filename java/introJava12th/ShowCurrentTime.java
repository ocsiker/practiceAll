public class ShowCurrentTime {
  public static void main(String[] args) {

    // get millis time from UNIX epoch
    long totalMilliSeconds = System.currentTimeMillis();

    // Get totalSeconds by currentTimeMillis divide 1000
    long totalSeconds = totalMilliSeconds / 1000;

    // seconds current by totalSeconds % 60
    int seconds = (int) totalSeconds % 60;

    // totalMinutes current by totalSeconds / 60
    long totalMinutes = totalSeconds / 60;

    // seconds current by totalSeconds % 60
    int minutes = (int) totalMinutes % 60;

    // hours current by totalMinutes / 60
    long hours = totalMinutes / 60;
    System.out.println(
        totalMilliSeconds
            + " currentTimeMillis "
            + hours
            + " hours "
            + minutes
            + " minutes "
            + seconds
            + " seconds ");
  }
}
