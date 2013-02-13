package guava.examples.string_joining;

import com.google.common.base.Optional;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OptionalTest {
    @Test
    public void isPresent_returns_true_if_it_is_not_null() {
        Optional<String> nickName = Optional.of("Barry");
        assertThat(nickName.isPresent(), is(true));
    }
}
