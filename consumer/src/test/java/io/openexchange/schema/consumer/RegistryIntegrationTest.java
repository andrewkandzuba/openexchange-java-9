package io.openexchange.schema.consumer;

import io.openexchange.schema.api.registry.Register;
import io.openexchange.schema.api.registry.RegisterInitializationException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RegistryIntegrationTest {

    /**
     * The test will not be able to pass until the moment this issue is solved: https://issues.apache.org/jira/browse/SUREFIRE-1262
     * @throws RegisterInitializationException
     */
    @Test
    @Disabled
    void findImplementation() throws RegisterInitializationException {
        Register.lookup();
    }
}
