package executions;

import org.junit.Test;

/**
 * Sample Executor Unit Test
 */
public class SampleExecutorTest {

    private SampleExecutor executor;

    @Test
    public void testExecutor() throws Exception {
        executor = new SampleExecutor();
        executor.run();
        assert executor.stateRan;
    }
}