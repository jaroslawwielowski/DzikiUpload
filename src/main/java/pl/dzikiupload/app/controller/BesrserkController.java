package pl.dzikiupload.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dzikiupload.app.dto.BerserkDto;
import pl.dzikiupload.app.service.impl.BerserkService;

import javax.naming.spi.DirStateFactory;

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


}
