package kg.test.mailsender.services.impl;

import kg.test.mailsender.models.EmailDetails;
import kg.test.mailsender.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.*;


@Service
public class MailServiceImpl implements MailService {

  @Autowired
  private JavaMailSender javaMailSender;

  @Value("${spring.mail.username}")
  private String sender;

  @Override
  public String sendEmail(EmailDetails emailDetails) throws MessagingException {
    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setFrom(sender);
    simpleMailMessage.setTo(emailDetails.getRecipient());
    simpleMailMessage.setText(emailDetails.getBody());
    simpleMailMessage.setSubject(emailDetails.getSubject());
    javaMailSender.send(simpleMailMessage);


    return "success";
  }
}
