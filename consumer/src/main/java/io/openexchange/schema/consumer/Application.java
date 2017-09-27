package io.openexchange.schema.consumer;

import io.openexchange.schema.api.registry.Register;
import io.openexchange.schema.api.registry.RegisterInitializationException;

public class Application {

    public static void main(String ...args) throws RegisterInitializationException {
        System.out.println(Register.lookup().id());
    }
}
