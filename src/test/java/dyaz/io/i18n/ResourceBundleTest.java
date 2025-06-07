package dyaz.io.i18n;

import org.junit.jupiter.api.Test;

import java.util.ResourceBundle;

public class ResourceBundleTest {

  @Test
  void testResourceBundle() {

    var resourceBundle = ResourceBundle.getBundle("message");

    System.out.println(resourceBundle.getString("hello"));
    System.out.println(resourceBundle.getString("goodbye"));

  }
}
