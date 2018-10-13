package singy.springstruts2test.utils;

import org.apache.commons.text.RandomStringGenerator;

public class RandomUtil {
    public static String randomAlphabetic(int length) {
        return new RandomStringGenerator.Builder()
            .withinRange('0', 'z')
            .filteredBy(Character::isLetterOrDigit)
            .build()
            .generate(length);
    }
}
