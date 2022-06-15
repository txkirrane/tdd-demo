package tdd.data;

import java.util.UUID;

public interface Repository <Key, Type> {
    Type findByID(UUID id);
    void create(Type obj);
    void update(Type obj);
    void delete(Type obj);
}
