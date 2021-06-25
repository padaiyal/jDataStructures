package org.padaiyal.datastructures.tree;

import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.padaiyal.utilities.I18nUtility;

/**
 * Test tree data structure.
 */
public class TreeTest {


  static {
    I18nUtility.addResourceBundle(TreeTest.class, TreeTest.class.getSimpleName(), Locale.US);
  }

  /**
   * Test creating a tree.
   *
   * @param data     The data of the root node.
   * @param dataType The expected type of the object.
   */
  @ParameterizedTest
  @CsvSource({
      "12232, java.lang.Integer",
      "12232522564982, java.lang.Long",
      "12.9, java.lang.Float",
      "1223221123.57, java.lang.Double",
      "Hello World, java.lang.String"
  })
  public void testCreateTreeWithDifferentDataTypes(String data, Class<?> dataType) {
    Object value = convertStringToObject(data, dataType);
    Tree<Object> tree = new Tree<>(value);
    Assertions.assertNotNull(tree);
    Assertions.assertNotNull(tree.root);
    Assertions.assertEquals(value, tree.root.data);
    Assertions.assertEquals(0, tree.root.children.size());
    Assertions.assertNull(tree.root.parent);
  }

  /**
   * Helper method to convert a string to an object of specified type.
   *
   * @param data     The data to convert.
   * @param dataType The object type to convert the data to.
   * @return The converted data.
   */
  private Object convertStringToObject(String data, Class<?> dataType) {
    if (dataType == Integer.class) {
      return Integer.valueOf(data);
    } else if (dataType == Long.class) {
      return Long.valueOf(data);
    } else if (dataType == Double.class) {
      return Double.valueOf(data);
    } else if (dataType == Float.class) {
      return Float.valueOf(data);
    } else if (dataType == String.class) {
      return data;
    }
    throw new IllegalArgumentException(
        String.format(
            I18nUtility.getFormattedString("TreeTest.error.conversionNotSupported"),
            dataType)
    );
  }
}