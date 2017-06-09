package demo;

import java.util.List;

import static java.util.Arrays.asList;

public class TalkBuilder {
    private String title = "title";
    private List<String> speakers = asList("Tom","Anna");

    public static TalkBuilder aTalk() {
        return new TalkBuilder();
    }

    public TalkBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public Talk build() {
        Talk talk = new Talk();
        talk.addAllSpeakers(speakers);
        talk.setTitle(title);
        return talk;
    }
}
