
public class Ranking {

    private int volumeOfSpeakers;
    private int actingTalent;
    private int audienceParticipation;
    private int action;

    public void setVolumeOfSpeakers(int qualitaet) {
        this.volumeOfSpeakers = qualitaet;
    }

    public void setActingTalent(int qualitaet) {
        this.actingTalent = qualitaet;
    }

    public void setAudienceParticipation(int qualitaet) {
        this.audienceParticipation = qualitaet;
    }

    public void setAction(int qualitaet) {
        this.action = qualitaet;
    }

    public int getAction() {
        return action;
    }

    public int getVolumeOfSpeakers() {
        return volumeOfSpeakers;
    }

    public int getAudienceParticipation() {
        return audienceParticipation;
    }

    public int getActingTalent() {
        return actingTalent;
    }

}
