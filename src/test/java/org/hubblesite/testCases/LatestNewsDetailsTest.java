package org.hubblesite.testCases;

import org.hubblesite.NewsDetailsPageTests;
import org.junit.jupiter.api.Tag;

@Tag("TEST_CASES")
public class LatestNewsDetailsTest extends NewsDetailsPageTests {

    public LatestNewsDetailsTest() {
        super("last");
    }
}
