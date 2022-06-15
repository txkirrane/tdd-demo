package tdd;

import java.time.ZonedDateTime;
import java.util.UUID;

import lombok.Getter;

@Getter
public abstract class Model {

    private final UUID id = UUID.randomUUID();
    private final ZonedDateTime created = ZonedDateTime.now();

}
