package demo;

import org.junit.Test;

import static demo.ConferenceBuilder.aConference;

public class ValidatorTest {
    private Validator validator = new Validator();

    @Test
    public void validConferenceHasANamePlaceAndDate() {
        Conference conference = aConference()
                .build();

        validator.validate(conference);
    }

    @Test(expected = RuntimeException.class)
    public void aConferenceWithoutANameIsInvalid() {
        Conference conference = aConference()
                .removeName()
                .build();

        validator.validate(conference);
    }

    @Test(expected = RuntimeException.class)
    public void aConferenceWithoutAPlaceIsInvalid() {
        Conference conference = aConference()
                .removePlace()
                .build();

        validator.validate(conference);
    }

    @Test(expected = RuntimeException.class)
    public void aConferenceWithoutADateIsInvalid() {
        Conference conference = aConference()
                .removeDate()
                .build();

        validator.validate(conference);
    }
}
