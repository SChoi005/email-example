package project.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmailController{

    @PostMapping()
    public Map<String, Object> sendEmail(@RequestBody Map<String, Object> param){
        return null;
    }
}