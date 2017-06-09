
public class Validator {
    public void validate(Conference conference) {
        boolean valid = true;
        valid = valid && conference.getName() != null && conference.getName().length() >= 3;
        valid = valid && conference.getPlace() != null;
        valid = valid && conference.getDate() != null;
        if (!valid) throw new RuntimeException("Invalid Conference");
    }


}
