package demo;

import java.util.List;

public class Service {

    private Repository repository = new Repository();
    private RankingCalculator rankingCalculator = new RankingCalculator();

    public void save(Conference conference) {
        repository.persist(conference);
    }

    public void save(Conference conference, Talk talk) {
        repository.persist(conference, talk);
    }

    public void save(Talk talk, Ranking ranking) {
        repository.persist(talk, ranking);
    }

    public RankedTalks getRankedTalks(Conference conference) {
        RankedTalks rankedTalks = new RankedTalks();
        List<Talk> talks = repository.loadAllTalks(conference);
        for (Talk talk : talks) {
            Ranking ranking = repository.loadAllRankings(talk);
            RankedTalk rankedTalk = rankingCalculator.calculate(talk, ranking);
            rankedTalks.add(rankedTalk);
        }
        return rankedTalks;
    }
}
