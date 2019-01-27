package pl.dzikiupload.app.enities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import pl.dzikiupload.app.dto.BerserkDto;

import javax.persistence.*;
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


    public Berserk() {
    }

    public Berserk(@Size(max = 1000) String description, @Email String email) {
        this.description = description;
        this.email = email;
    }
//
//    @Transient
//    public BerserkDto toDto(){
//        BerserkDto dto = this.toCollectionlessDto(){
//            dto.se
//        }
//    }
//
    private BerserkDto toCollectionlessDto() {
        BerserkDto dto = new BerserkDto();
        dto.setDescription(this.description);
        dto.setEmail(this.email);
        return dto;
    }
}
