package pl.dzikiupload.app.service.impl;

import pl.dzikiupload.app.dto.BerserkDto;
import pl.dzikiupload.app.repository.BerserkRepository;
import pl.dzikiupload.app.service.Base;

import java.util.Collection;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public class BerserkService implements Base<BerserkDto, UUID> {

    private final BerserkRepository berserkRepository;

    public BerserkService(BerserkRepository berserkRepository) {
        this.berserkRepository = berserkRepository;
    }


    @Override
    public BerserkDto save(BerserkDto dto) {
        return null;
    }

    @Override
    public BerserkDto update(BerserkDto dto) {
        return null;
    }

    @Override
    public BerserkDto find(UUID id) {
        return null;
    }

    @Override
    public Boolean remove(UUID id) {
        return null;
    }

    @Override
    public Collection<BerserkDto> getall() {
        return berserkRepository.findAll().stream().collect(Collectors.toList());
    }
}
