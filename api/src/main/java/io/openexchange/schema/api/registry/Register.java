package io.openexchange.schema.api.registry;

import io.openexchange.schema.api.model.Schema;

import static java.util.ServiceLoader.load;

public interface Register {

    void publish(Schema schema) throws RegistrationSchemaDuplicationException;

    String id();

    static Register lookup() throws RegisterInitializationException {
        Iterable<Register> registers = load(Register.class);

        if (registers.iterator().hasNext())
            return registers.iterator().next();

        throw new RegisterInitializationException("Any of register's implementation have been found");
    }
}
