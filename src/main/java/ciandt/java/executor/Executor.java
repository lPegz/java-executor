package ciandt.java.executor;

import com.google.common.collect.Lists;
import executions.SampleExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Classe principal das execuções
 */
public class Executor {

    private static Logger LOGGER  = LogManager.getLogger(Executor.class);

    /**
     * Instancia todos os executores e os chama em paralelo ou sequenciado.
     * @param args
     */
    public static void main(String... args) {

        List<Runnable> runnableJobs = Lists.newArrayList((Runnable)new SampleExecutor());
        // Adicione classes de execução aqui.
        LOGGER.error("Starting to run job list");
        for (Runnable job : runnableJobs) {
            LOGGER.error("Starting to run job : {}" , job.getClass());
            job.run();
            LOGGER.error("End to run job : {}", job.getClass());
        }
        LOGGER.error("End of jobs");
    }

}
