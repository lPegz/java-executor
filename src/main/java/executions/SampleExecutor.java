package executions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.SystemClock;

import java.util.Calendar;

/**
 * Sample Executor that runs the job HelloWorld
 */
public class SampleExecutor implements Runnable {

    private static Logger LOGGER = LogManager.getLogger(SampleExecutor.class);

    public void run() {
        LOGGER.error("Hello World!, the time is {}" , new SystemClock().currentTimeMillis());
    }

}
