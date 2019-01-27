package pl.dzikiupload.app.dto;

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
public class BerserkDto {


    private UUID id;

    private String description;

    private String email;


    public BerserkDto() {
    }

    public BerserkDto(@Size(max = 1000) String description, @Email String email) {
        this.description = description;
        this.email = email;
    }
}
