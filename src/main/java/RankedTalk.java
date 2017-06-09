
public class RankedTalk {

    private Talk talk;
    private Ranking ranking;
    private int rank;

    public RankedTalk(Talk talk, Ranking ranking) {
        this.talk = talk;
        this.ranking = ranking;
    }

    public int getRank() {
        return rank;
    }

    public Talk getTalk() {
        return talk;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
