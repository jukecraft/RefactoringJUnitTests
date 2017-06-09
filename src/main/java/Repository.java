
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {

    private Validator validator = new Validator();

    private Map<Conference, List<Talk>> conferenceWithTalks = new HashMap<>();
    private Map<Talk, Ranking> talksWithRankings = new HashMap<>();

    public void persist(Conference conference) {
        validator.validate(conference);
        conferenceWithTalks.put(conference, new ArrayList<>());
    }

    public void persist(Talk talk, Ranking ranking) {
        talksWithRankings.put(talk, ranking);
    }

    public void persist(Conference conference, Talk talk) {
        loadAllTalks(conference).add(talk);
    }


    public Ranking loadAllRankings(Talk talk) {
        return talksWithRankings.get(talk);
    }

    public List<Talk> loadAllTalks(Conference conference) {
        return conferenceWithTalks.get(conference);
    }

}
