package dyaz.io.i18n;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

  @Test
  void testDateFormat() {
    var pattern = "EEEE dd MMMM yyyy";

    var dateFormat = new SimpleDateFormat(pattern);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }
}
