package dyaz.io.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

  @Test
  void testMessageFormatType() {

    var locale = new Locale("in", "ID");
    var resourceBundle = ResourceBundle.getBundle("message", locale);

    var pattern = resourceBundle.getString("status");

    var messsageFormat = new MessageFormat(pattern, locale);
    var format = messsageFormat.format(new Object[]{
            "Dyaz", new Date(), 1_000_000
    });

    System.out.println(format);

  }

}
