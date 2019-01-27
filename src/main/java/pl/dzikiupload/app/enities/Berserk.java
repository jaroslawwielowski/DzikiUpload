package pl.dzikiupload.app.enities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Berserk {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator( name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id" , columnDefinition = "VARCHAR(255)")
    private UUID id;

    @Size(max = 1000)
    private String description;

    @Email
    private String email;


}
