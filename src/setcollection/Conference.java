package setcollection;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Conference {

	 private Set<Person> attendees = new HashSet<>();

	    // Method to add attendees
	    public void addAttendee(Person person) {
	        attendees.add(person);
	    }

	    // Method to remove an attendee
	    public void removeAttendee(Person person) {
	        attendees.remove(person);
	    }

	    // Find duplicate attendees based on id
	    public Set<Person> findDuplicateAttendees() {
	        Set<Person> uniqueAttendees = new HashSet<>();
	        Set<Person> duplicates = new HashSet<>();

	        for (Person attendee : attendees) {
	            if (!uniqueAttendees.add(attendee)) {
	                duplicates.add(attendee);
	            }
	        }
	        return duplicates;
	    }

	    // List all unique attendees
	    public Set<Person> listUniqueAttendees() {
	        return new HashSet<>(attendees);
	    }

	    // Find attendees within a certain age range
	    public Set<Person> findAttendeesByAgeRange(int minAge, int maxAge) {
	        return attendees.stream()
	                .filter(person -> person.getAge() >= minAge && person.getAge() <= maxAge)
	                .collect(Collectors.toSet());
	    }
	
}
