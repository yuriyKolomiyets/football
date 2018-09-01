package model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public abstract class IdEntity {

    @Id
    private String id;

    public String getId() {
        return UUID.randomUUID().toString();
    }

}
