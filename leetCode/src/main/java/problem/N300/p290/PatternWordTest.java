package problem.N300.p290;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternWordTest {

    @Test
    public void wordPattern() {

        Assert.assertTrue(PatternWord.wordPattern("abba", "dog cat cat dog"));
        Assert.assertFalse(PatternWord.wordPattern("abba", "dog cat cat fish"));
        Assert.assertFalse(PatternWord.wordPattern("abba", "dog dog dog dog"));
        Assert.assertFalse(PatternWord.wordPattern("aaaa", "dog cat cat dog"));
    }
}