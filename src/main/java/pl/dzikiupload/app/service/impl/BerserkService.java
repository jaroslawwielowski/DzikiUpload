package pl.dzikiupload.app.service.impl;

import pl.dzikiupload.app.enities.Berserk;
import pl.dzikiupload.app.repository.BerserkRepository;
import pl.dzikiupload.app.service.Base;

import java.util.Collection;
import java.util.UUID;

public class BerserkService implements Base<Berserk, UUID> {

    private final BerserkRepository berserkRepository;

    public BerserkService(BerserkRepository berserkRepository) {
        this.berserkRepository = berserkRepository;
    }


    @Override
    public Berserk save(Berserk dto) {
        return null;
    }

    @Override
    public Berserk update(Berserk dto) {
        return null;
    }

    @Override
    public Berserk find(UUID id) {
        return null;
    }

    @Override
    public Boolean remove(UUID id) {
        return null;
    }

    @Override
    public Collection<Berserk> getall() {
        return berserkRepository.findAll();
    }
}
