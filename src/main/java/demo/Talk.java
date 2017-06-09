package demo;

import java.util.ArrayList;
import java.util.List;

public class Talk {

    private String title;
    private List<String> speakers = new ArrayList<>();

    public void addSpeaker(String speaker) {
        speakers.add(speaker);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfSpeakers() {
        return speakers.size();
    }

    public void addAllSpeakers(List<String> speakers) {
        this.speakers.addAll(speakers);

    }
}
