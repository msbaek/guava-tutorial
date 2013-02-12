package guava.examples.string_joining;

import com.google.common.base.Joiner;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringJoiningTest {
    @Test
    public void join() {
        String result = Joiner.on(",")
                .skipNulls()
                .join("one", null, "two", "three");
        String expectedResult = "";
        assertThat(result, is(expectedResult));
    }
}
