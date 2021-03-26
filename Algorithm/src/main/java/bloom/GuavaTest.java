package bloom;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Test;

public class GuavaTest {

    @Test
    public void test() {

        // 创建布隆过滤器
        BloomFilter<Integer> filter=BloomFilter.create(Funnels.integerFunnel(),1500,0.01);

        System.out.println(filter.mightContain(1));
        System.out.println(filter.mightContain(2));
        filter.put(1);
        filter.put(2);
        System.out.println(filter.mightContain(1));
        System.out.println(filter.mightContain(2));
        System.out.println(filter.mightContain(3));
    }

}

