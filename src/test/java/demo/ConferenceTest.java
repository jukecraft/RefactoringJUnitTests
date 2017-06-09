package demo;

import org.junit.Test;

import static demo.ConferenceBuilder.aConference;
import static demo.Quality.*;
import static demo.RankedTalkMatcher.*;
import static demo.TalkBuilder.aTalk;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class ConferenceTest {
    private Service service = new Service();

    @Test
    public void test() {
        Conference conference = aConference().build();
        service.save(conference);

        Talk talk1 = aTalk()
                .withTitle("Refactoring JUnit Tests")
                .build();
        service.save(conference, talk1);

        Talk talk2 = aTalk()
                .withTitle("Object Calisthenics")
                .build();

        service.save(conference, talk2);

        Ranking ranking1 = new Ranking();
        ranking1.setVolumeOfSpeakers(AVERAGE);
        ranking1.setActingTalent(AVERAGE);
        ranking1.setAudienceParticipation(EXCELLENT);
        ranking1.setAction(MEH);
        service.save(talk1, ranking1);

        Ranking ranking2 = new Ranking();
        ranking2.setVolumeOfSpeakers(AVERAGE);
        ranking2.setActingTalent(GREAT);
        ranking2.setAudienceParticipation(EXCELLENT);
        ranking2.setAction(GREAT);
        service.save(talk2, ranking2);

        RankedTalks rankedTalks = service.getRankedTalks(conference);

        assertThat(rankedTalks, contains(
                allOf(hasTitle("Refactoring JUnit Tests"), hasRank(23), hasRanking(ranking1)),
                allOf(hasTitle("Object Calisthenics"), hasRank(42), hasRanking(ranking2))
        ));
    }
}
