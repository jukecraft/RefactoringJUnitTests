
import java.util.Date;

public class Conference {

    private Date date;
    private String name;
    private Place place;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(Place place) {
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
