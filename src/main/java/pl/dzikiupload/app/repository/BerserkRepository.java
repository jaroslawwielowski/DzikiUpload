package pl.dzikiupload.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dzikiupload.app.enities.Berserk;

import java.util.UUID;

public interface BerserkRepository extends JpaRepository<Berserk, UUID> {
}
