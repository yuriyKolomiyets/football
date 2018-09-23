package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public abstract class IdEntity {

    @Id
    @GeneratedValue
    private String id;

    public String getId() {
        return UUID.randomUUID().toString();
    }

}
