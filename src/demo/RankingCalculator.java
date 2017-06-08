package demo;

public class RankingCalculator {

    public RankedTalk calculate(Talk talk, Ranking ranking) {
        RankedTalk rankedTalk = new RankedTalk(talk, ranking);
        rankedTalk.setRank(calculateRankNumber(talk, ranking));
        return rankedTalk;
    }

    private int calculateRankNumber(Talk talk, Ranking ranking) {
        return talk.getNumberOfSpeakers()
                - 40 * ranking.getAction()
                + ranking.getVolumeOfSpeakers()
                - 5 * ranking.getAudienceParticipation()
                + 61 * ranking.getActingTalent();
    }
}
