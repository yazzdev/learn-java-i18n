package dyaz.io.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

  @Test
  void testResourceBundle() {

    var resourceBundle = ResourceBundle.getBundle("message");

    System.out.println(resourceBundle.getString("hello"));
    System.out.println(resourceBundle.getString("goodbye"));

  }

  @Test
  void testResourceBundleID() {

    var indoneisa = new Locale("in", "ID");
    var resourceBundle = ResourceBundle.getBundle("message", indoneisa);

    System.out.println(resourceBundle.getString("hello"));
    System.out.println(resourceBundle.getString("goodbye"));

  }

  @Test
  void testResourceBundleNotFound() {

    var amerika = new Locale("en", "US");
    var resourceBundle = ResourceBundle.getBundle("message", amerika);

    System.out.println(resourceBundle.getString("hello"));
    System.out.println(resourceBundle.getString("goodbye"));

  }
}
