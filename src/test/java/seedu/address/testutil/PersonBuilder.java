
package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.person.Address;
import seedu.address.model.person.Event;
import seedu.address.model.person.Name;
import seedu.address.model.person.Rate;
import seedu.address.model.person.Timing;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_RATE = "85355255";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_START_TIME = "12-03-2023 11:00";
    public static final String DEFAULT_END_TIME = "12-03-2023 12:00";

    private Name name;
    private Rate rate;
    private Address address;
    private Timing timing;
    private Set<Tag> tags;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(DEFAULT_NAME);
        rate = new Rate(DEFAULT_RATE);
        address = new Address(DEFAULT_ADDRESS);
        timing = new Timing(DEFAULT_START_TIME, DEFAULT_END_TIME);
        tags = new HashSet<>();
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Event personToCopy) {
        name = personToCopy.getName();
        rate = personToCopy.getRate();
        address = personToCopy.getAddress();
        timing = personToCopy.getTiming();
        tags = new HashSet<>(personToCopy.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Person} that we are building.
     */
    public PersonBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Person} that we are building.
     */
    public PersonBuilder withRate(String rate) {
        this.rate = new Rate(rate);
        return this;
    }

    /**
     * Sets the {@code Timing} of the {@code Event} that we are building.
     */
    public PersonBuilder withTiming(String startTime, String endTime) {
        this.timing = new Timing(startTime, endTime);
        return this;
    }

    public Event build() {
        return new Event(name, rate, address, timing, tags);
    }

}
