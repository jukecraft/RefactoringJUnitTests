package demo;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConferenceTest {
    private Service service = new Service();

    @Test
    public void test() {
        // Create Conference + Save
        Conference conference = new Conference();
        conference.setDate(new Date());
        conference.setName("Nordic Testing Days 2017");
        conference.setPlace(new Place("Tallinn", "Radisson Blu Olümpia", 148.78, 19.18));
        service.save(conference);

        // Create Talk 1 + Save
        Talk talk1 = new Talk();
        talk1.setTitle("Refactoring JUnit Tests");
        talk1.addSpeaker("Franzi");
        talk1.addSpeaker("Tom");
        service.save(conference, talk1);

        // Create Talk 2 + Save
        Talk talk2 = new Talk();
        talk2.setTitle("Object Calisthenics");
        talk2.addSpeaker("Laura");
        talk2.addSpeaker("James");
        service.save(conference, talk2);

        // Create Rank for Talk 1 + Save
        Ranking ranking1 = new Ranking();
        ranking1.setVolumeOfSpeakers(Quality.AVERAGE);
        ranking1.setActingTalent(Quality.AVERAGE);
        ranking1.setAudienceParticipation(Quality.EXCELLENT);
        ranking1.setAction(Quality.MEH);
        service.save(talk1, ranking1);

        // Create Rank for Talk 2 + Save
        Ranking ranking2 = new Ranking();
        ranking2.setVolumeOfSpeakers(Quality.AVERAGE);
        ranking2.setActingTalent(Quality.GREAT);
        ranking2.setAudienceParticipation(Quality.EXCELLENT);
        ranking2.setAction(Quality.GREAT);
        service.save(talk2, ranking2);

        // Retrieve Talk-Ranking
        RankedTalks rankedTalks = service.getRankedTalks(conference);

        int checkedTalks = 0;
        for (RankedTalk rankedTalk : rankedTalks) {
            switch (rankedTalk.getTalk().getTitle()) {
                case "Refactoring JUnit Tests":
                    // Check result (Talk 1)
                    assertThat(rankedTalk.getRank(), is(23));
                    assertThat(rankedTalk.getRanking(), is(ranking1));
                    break;
                case "Object Calisthenics":
                    // check result (Talk 2)
                    assertThat(rankedTalk.getRank(), is(42));
                    assertThat(rankedTalk.getRanking(), is(ranking2));
                    break;
                default:
                    fail("Unknown Talk");
                    break;
            }
            checkedTalks++;
        }
        assertEquals(2, checkedTalks);
    }
}
