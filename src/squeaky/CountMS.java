package squeaky;

import java.util.TimerTask;

/**
 *
 * @author Intel
 */
public class CountMS {

    private static final java.util.Timer TIMER = new java.util.Timer();
    private TimerTask countMSTask;
    private long milliseconds;

    protected void startTimer() {
        this.milliseconds = 0;
        countMSTask = new TimerTask() {
            @Override
            public void run() {
                CountMS.this.milliseconds++;
            }
        };
        TIMER.scheduleAtFixedRate(countMSTask, 0, 1);
    }

    protected long stopTimer() {
        if (this.countMSTask != null) {
            this.countMSTask.cancel();
        }
        return this.milliseconds;
    }
}
