package setcollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	
	
		  public static void addPersonToHashSet(Set<Person> set, Person person) {
		        set.add(person);
		    }

		    public static void addPersonToLinkedHashSet(Set<Person> set, Person person) {
		        set.add(person);
		    }

		    public static void main(String[] args) {
		        Set<Person> hashSet = new HashSet<>();
		        Set<Person> linkedHashSet = new LinkedHashSet<>();

		        Person p1 = new Person(1, "Jon", 22);
		        Person p2 = new Person(2, "Stracks", 24);
		        Person p3 = new Person(1, "Jon", 22);   // Duplicate id
		        Person p4 = new Person(3, "Prince", 21);
		        


		        addPersonToHashSet(hashSet, p1);
		        addPersonToHashSet(hashSet, p2);
		        addPersonToHashSet(hashSet, p3); 
		        addPersonToHashSet(hashSet, p4); 

		        addPersonToLinkedHashSet(linkedHashSet, p1);
		        addPersonToLinkedHashSet(linkedHashSet, p2);
		        addPersonToLinkedHashSet(linkedHashSet, p3); 
		        addPersonToLinkedHashSet(linkedHashSet, p4); 

		        System.out.println("HashSet: " + hashSet);
		        System.out.println("LinkedHashSet: " + linkedHashSet);
		    }
		

	}

