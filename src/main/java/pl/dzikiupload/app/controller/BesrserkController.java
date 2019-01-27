package pl.dzikiupload.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dzikiupload.app.dto.BerserkDto;
import pl.dzikiupload.app.service.impl.BerserkService;

import javax.naming.spi.DirStateFactory;

import java.util.UUID;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/")
public class BesrserkController {
    private final BerserkService berserkService;

    @Autowired
    public BesrserkController(BerserkService berserkService) {
        this.berserkService = berserkService;
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public Result post(@RequestBody BerserkDto dto){
        return Result.ok(berserkService.save(dto));
    }

    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Result get(@PathVariable UUID id){
        return Result.ok(berserkService.find(id));
    }

    @GetMapping(path = "/all" , produces = APPLICATION_JSON_VALUE)
    public Result getAll(){
        return Result.ok(berserkService.getall());
    }

    @PutMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Result put(@RequestBody BerserkDto dto){
        return Result.ok(berserkService.update(dto));
    }

    @DeleteMapping(path = "/{id}")
    public Result delete(@PathVariable UUID id){
        return Result.ok(berserkService.remove(id));
    }



}
