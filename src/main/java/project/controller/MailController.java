package project.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.dto.MailDto;
import project.service.MailService;

@RestController
@RequestMapping("/api")
public class MailController{

    @Autowired
    private MailService mailService;
    
    @PostMapping("/send")
    public MailDto sendEmail(@RequestBody Map<String, Object> param){
        MailDto mailDto = new MailDto();
        
        mailDto.setAddress(param.get("email").toString());
        mailDto.setTitle(param.get("title").toString());
        mailDto.setMessage(param.get("message").toString());
        
        mailService.sendMail(mailDto);
        
        return mailDto;
    }
}