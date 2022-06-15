package tdd;

import java.util.UUID;

public interface Service <ModelType extends Model> {
    ModelType create(ModelType instance);
    ModelType retrieveByID(UUID id);
    ModelType save(ModelType instance);
    void delete(ModelType instance);
}
