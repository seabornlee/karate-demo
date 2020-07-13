package demo.baidu;

import com.intuit.karate.junit5.Karate;

public class BaiduTestRunner {

    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }

}