package kg.test.mailsender.services;

import kg.test.mailsender.models.EmailDetails;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface MailService {

  String sendEmail(EmailDetails emailDetails) throws MessagingException;
}
