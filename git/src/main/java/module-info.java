import io.openexchange.schema.api.registry.Register;
import io.openexchange.schema.memory.GitRegister;

module event.registry.git {
    requires event.registry.api;
    provides Register
            with GitRegister;
}