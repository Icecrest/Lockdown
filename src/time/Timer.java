package time;

public class Timer {

    private final long time;
    private long startTime;
    private long endTime;

    /**
     *
     * Constructor that accepts a float argument for the number of hours that will be compared against.
     */
    public Timer(float maxHours){
        this.time = ((long)(maxHours*60))*60000;
    }

    /**
     * Checks the time remaining against the maximum time length set for the timer.
     * @return <div>True if time is at the maximum
     *              False if time is less than the maxmimum</div>
     */
    private boolean checkTime(){
        return false;
    }

    public void startTime(){
        startTime = System.currentTimeMillis();
    }

    public void endTime(){
        endTime = System.currentTimeMillis();
    }

    public String checkTimeRemaining(){
        StringBuffer buffer = new StringBuffer();
        long remain = time - (System.currentTimeMillis()-startTime);
        long hours = (remain / 3600000L);
        long minutes = (remain - (hours * 3600000)) / 60000;
        long seconds = ((remain - (hours * 3600000))- (minutes * 60000)) / 1000;

        buffer.append(String.valueOf(hours).concat(":"));
        buffer.append(String.valueOf(minutes).concat(":"));
        buffer.append(String.valueOf(minutes).concat(" remaining."));

        return buffer.toString();
    }

}
