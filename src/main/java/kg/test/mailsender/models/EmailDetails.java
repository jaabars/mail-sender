package kg.test.mailsender.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailDetails {
  String recipient;
  String body;
  String subject;
  String attachment;
}
