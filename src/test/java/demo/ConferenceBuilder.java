package demo;

import java.util.Date;

public class ConferenceBuilder {
    private Date date = new Date();
    private String name = "Nordic Testing Days 2017";
    private Place place = new Place("Tallinn", "Radisson Blu Olümpia", 148.78, 19.18);

    public static ConferenceBuilder aConference() {
        return new ConferenceBuilder();
    }

    public ConferenceBuilder removeName() {
        name = null;
        return this;
    }

    public ConferenceBuilder removePlace() {
        place = null;
        return this;
    }

    public ConferenceBuilder removeDate() {
        date = null;
        return this;
    }

    public Conference build() {
        return new Conference(date, name, place);
    }
}
