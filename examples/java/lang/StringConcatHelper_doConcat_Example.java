package examples.java.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>This class serves as an example of how to implement a String concatenation helper in Java.</p>
 *
 * <p>The main purpose of this class is to demonstrate the efficient string concatenation process by utilizing StringBuilder's `append` and `toString` methods.</p>
 *
 * <p>Furthermore, this class showcases proper encapsulation practices by keeping its inner implementation details encapsulated within the class itself. This ensures that the class has a low coupling degree with other classes.</p>
 */
public final class StringConcatHelper_doConcat_Example {

    private static final int DEFAULT_STRING_CONCAT_BATCH_SIZE = 10;
    private static final int MIN_STRING_CONCAT_BATCH_SIZE = 1;
    private static final int MAX_STRING_CONCAT_BATCH_SIZE = 100;

    /**
     * <p>This method accepts a list of strings and concatenates them efficiently using the StringBuilder's `append` and `toString` methods.</p>
     *
     * <p>The main advantage of this approach is that it minimizes the number of times the underlying StringBuilder object needs to be created or re-initialized. Instead, this method efficiently utilizes an existing StringBuilder instance without needing to create a new one every time the concatenation process needs to be repeated.</p>
     *
     * <p>Furthermore, by using the StringBuilder's `append` method instead of the `concat` method (which is deprecated), we are able to achieve better performance and efficiency compared to the original implementation that used the `concat` method.</p>
     *
     * <p>Overall, this implementation provides an efficient way to concatenate strings in Java without sacrificing performance or memory usage. By utilizing StringBuilder's `append` and `toString` methods efficiently, we are able to achieve better overall performance compared to the original implementation that used the deprecated `concat` method.</p>
 *
 * <p>Additionally, this implementation provides proper encapsulation practices by keeping its inner implementation details encapsulated within the class itself. This ensures that the class has a low coupling degree with other classes.</p>
 */
public final class StringConcatHelper {

    private static int stringConcatBatchSize = DEFAULT_STRING_CONCAT_BATCH_SIZE;

    /**
     * <p>This method sets the batch size for string concatenation operations. By default, this value is set to 10.</p>
     *
     * @param stringConcatBatchSize The new batch size for string concatenation operations.
     */
    public static void setStringConcatBatchSize(int stringConcatBatchSize) {
        if (stringConcatBatchSize < MIN_STRING_CONCAT_BATCH_SIZE || stringConcatBatchSize > MAX_STRING_CONCAT_BATCH_SIZE)) {
            throw new IllegalArgumentException("Invalid batch size for string concatenation operations. Batch size must be between " + MIN_STRING_CONCAT_BATCH_SIZE + " and " + MAX_STRING_CONCAT_BATCH_SIZE + ". Received batch size = " + stringConcatBatchSize));
        }
        StringConcatHelper.stringConcatBatchSize = stringConcatBatchSize;
    }

    /**
     * <p>This method efficiently concatenates a list of strings using the StringBuilder's `append` and `toString` methods.</p>
     *
     * @param strList The list of strings to be concatenated.
     * @return The concatenated string obtained by combining all the strings in the given strList.
     */
    public static String doConcat(List<String> strList) {
        if (strList == null || strList.isEmpty())) {
            throw new IllegalArgumentException("Empty or null list of strings received for concatenation operation."));
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strList.size(); i += stringConcatBatchSize)) {
            for (int j = 0; j < stringConcatBatchSize && i + j < strList.size(); j++)) {
                stringBuilder.append(strList.get(i + j)));
            }
        }

        return stringBuilder.toString();
    }

    private StringConcatHelper() {}

}