package io.openexchange.schema.hortonworks;

import io.openexchange.schema.api.registry.Register;
import io.openexchange.schema.api.model.Schema;
import io.openexchange.schema.api.registry.RegistrationSchemaDuplicationException;

public class HortonworksRegister implements Register {

    @Override
    public void publish(Schema schema) throws RegistrationSchemaDuplicationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String id() {
        return "hortonworks";
    }
}
