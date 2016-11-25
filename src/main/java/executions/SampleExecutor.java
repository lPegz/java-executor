package executions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.SystemClock;

/**
 * POC
 * Sample Executor that runs the job HelloWorld
 */
public class SampleExecutor implements Runnable {

    private static Logger LOGGER = LogManager.getLogger(SampleExecutor.class);

    public boolean stateRan = false;

    public void run() {
        stateRan = true;
        LOGGER.error("Hello World!, the time is {}" , new SystemClock().currentTimeMillis());
    }

}
