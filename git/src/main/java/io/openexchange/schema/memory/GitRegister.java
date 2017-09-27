package io.openexchange.schema.memory;

import io.openexchange.schema.api.registry.Register;
import io.openexchange.schema.api.model.Schema;
import io.openexchange.schema.api.registry.RegistrationSchemaDuplicationException;

public class GitRegister implements Register {

    @Override
    public void publish(Schema schema) throws RegistrationSchemaDuplicationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String id() {
        return "git";
    }
}
