package dyaz.io.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

  @Test
  void testNumberFormat() {
    var numberFormat = NumberFormat.getInstance();
    var format = numberFormat.format(100000000.289);

    System.out.println(format);
  }

  @Test
  void testNumberFormatID() {
    var indonesia = new Locale("id", "ID");
    var numberFormat = NumberFormat.getInstance(indonesia);
    var format = numberFormat.format(256000.223);

    System.out.println(format);
  }

  @Test
  void testNumberFormatParseID() {
    var indonesia = new Locale("id", "ID");
    var numberFormat = NumberFormat.getInstance(indonesia);

    try {
      var result = numberFormat.parse("256.000,223").doubleValue();
      System.out.println(result);
    } catch (ParseException e) {
      System.out.println("Error parse: " + e.getMessage());
    }
  }
}
