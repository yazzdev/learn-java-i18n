package dyaz.io.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

  @Test
  void testCurrencyID() {
    var indonesia = new Locale("id", "ID");
    var currency = Currency.getInstance(indonesia);

    System.out.println(currency.getDisplayName());
    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getSymbol(indonesia));
  }

  @Test
  void testCurrencyUSA() {
    var america = new Locale("en", "US");
    var currency = Currency.getInstance(america);

    System.out.println(currency.getDisplayName());
    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getSymbol(america));
  }

  @Test
  void testNumberFormatCurrencyID() {
    var indonesia = new Locale("id", "ID");
    var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

    var format = numberFormat.format(1000000.333);
    System.out.println(format);
  }

  @Test
  void testNumberFormatCurrencyParseID() {
    var indonesia = new Locale("id", "ID");
    var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

    double parse = 0;
    try {
      parse = numberFormat.parse("Rp250.000,22").doubleValue();
      System.out.println(parse);
    } catch (ParseException e) {
      System.out.println("Error Parse: " + e.getMessage());
    }
  }
}
