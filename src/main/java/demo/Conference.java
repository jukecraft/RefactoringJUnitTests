package demo;

import java.util.Date;

public class Conference {
    private Date date;
    private String name;
    private Place place;

    public Conference(Date date, String name, Place place) {
        this.date = date;
        this.name = name;
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }
}
