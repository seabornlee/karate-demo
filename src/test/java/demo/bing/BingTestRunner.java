package demo.bing;

import com.intuit.karate.junit5.Karate;

public class BingTestRunner {

    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }

}