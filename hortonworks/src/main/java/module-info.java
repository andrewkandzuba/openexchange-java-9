import io.openexchange.schema.api.registry.Register;
import io.openexchange.schema.hortonworks.HortonworksRegister;

module event.registry.hortonworks {
    requires event.registry.api;
    provides Register
            with HortonworksRegister;
}