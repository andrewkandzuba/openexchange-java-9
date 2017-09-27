import io.openexchange.schema.api.registry.Register;

module event.registry.api {
    exports io.openexchange.schema.api.model;
    exports io.openexchange.schema.api.registry;

    uses Register;
}