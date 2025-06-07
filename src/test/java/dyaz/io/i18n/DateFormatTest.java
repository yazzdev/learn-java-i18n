package dyaz.io.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

  @Test
  void testDateFormat() {
    var pattern = "EEEE dd MMMM yyyy";

    var dateFormat = new SimpleDateFormat(pattern);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  @Test
  void testDateFormatJapan() {
    var pattern = "EEEE dd MMMM yyyy";
    var japan = new Locale("ja", "JP");
    var dateFormat = new SimpleDateFormat(pattern, japan);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  @Test
  void testDateFormatParseJapan() {
    var pattern = "EEEE dd MMMM yyyy";
    var japan = new Locale("ja", "JP");
    var dateFormat = new SimpleDateFormat(pattern, japan);

    try {
      var date = dateFormat.parse("土曜日 07 6月 2025");
      System.out.println(date);
    } catch (ParseException e) {
      System.out.println("Error Parse : " + e.getMessage());
    }
  }
}
