package guava.examples.string_joining;

import com.google.common.base.CharMatcher;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CharMatcherTest {
    @Test
    public void sanitize() {
        // "_34-425==" becomes "34425"

        String input = "_34-425==";
        String result = CharMatcher.anyOf("-_=")
                .removeFrom(input);
        assertThat(result, is("34425"));
    }
}
