package dyaz.io.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

  @Test
  void testMessageFormat() {

    var pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetik \"{0} \" di pencarian";
    var messageFormat = new MessageFormat(pattern);

    var format = messageFormat.format(new Object[]{
            "Dyaz"
    });

    System.out.println(format);

  }

  @Test
  void testMessageFormatResourceBundle() {

    var locale = new Locale("en", "US");
    var resourceBundle = ResourceBundle.getBundle("message", locale);

    var pattern = resourceBundle.getString("welcome.message");

    var messsageFormat = new MessageFormat(pattern);
    var format = messsageFormat.format(new Object[]{
            "Dyaz", "dyaz.io"
    });

    System.out.println(format);

  }
}
