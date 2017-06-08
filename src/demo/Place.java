package demo;

public class Place {

    public String city;
    public String address;
    public double latitude;
    public double longitude;

    public Place(String city, String address, double latitude, double longitude) {
        super();
        this.city = city;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

}
