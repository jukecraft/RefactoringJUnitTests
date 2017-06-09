package demo;

import org.hamcrest.CoreMatchers;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import static org.hamcrest.CoreMatchers.is;

public class RankedTalkMatcher {
    public static Matcher<RankedTalk> hasTitle(String expectedTitle) {
        return new FeatureMatcher<RankedTalk, String>(is(expectedTitle),
                "title of ranked talk", "title") {
            @Override
            protected String featureValueOf(RankedTalk actual) {
                return actual.getTalk().getTitle();
            }
        };
    }

    public static Matcher<RankedTalk> hasRanking(Ranking expectedRanking) {
        return new FeatureMatcher<RankedTalk, Ranking>(CoreMatchers.is(expectedRanking),
                "ranking of ranked talk", "ranking") {
            @Override
            protected Ranking featureValueOf(RankedTalk actual) {
                return actual.getRanking();
            }
        };
    }

    public static Matcher<RankedTalk> hasRank(int expectedRank) {
        return new FeatureMatcher<RankedTalk, Integer>(is(expectedRank),
                "rank of ranked talk", "rank") {
            @Override
            protected Integer featureValueOf(RankedTalk actual) {
                return actual.getRank();
            }
        };
    }
}
