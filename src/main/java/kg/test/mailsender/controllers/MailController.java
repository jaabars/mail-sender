package kg.test.mailsender.controllers;


import kg.test.mailsender.models.EmailDetails;
import kg.test.mailsender.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("api/v1/mail")
public class MailController {

  @Autowired
  private MailService mailService;

  @PostMapping("/send/email")
  public String sendEmail(@RequestBody EmailDetails emailDetails) throws MessagingException {
    return mailService.sendEmail(emailDetails);
  }

}
