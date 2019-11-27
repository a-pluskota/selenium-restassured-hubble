package org.hubblesite.testCases;

import org.hubblesite.NewsDetailsResponseTests;
import org.junit.jupiter.api.Tag;

@Tag("TEST_CASES")
public class LatestNewsDetailsResponseTest extends NewsDetailsResponseTests {

    public LatestNewsDetailsResponseTest() {
        super("last");
    }
}
