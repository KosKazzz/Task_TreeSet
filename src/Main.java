import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonsComparator pComp = new PersonsComparator();
        PersonsComparator pCompWithLimit = new PersonsComparator(3);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Diego", "Soto Palma", 25));
        people.add(new Person("Cristóbal", "de la Cruz Escobar", 44));
        people.add(new Person("Cristián", "Álvarez del Rí", 34));
        people.add(new Person("Emilia", "ACastro Molina", 31));
        people.add(new Person("María", "Dolores Navarrete Marín", 27));
        people.add(new Person("Natalia", "Escobar Carrasco de la Cruz", 21));
        people.add(new Person("Emilia", "Molina de la Cruz", 17));
        people.add(new Person("Diego", "Palma de la Rí", 5));
        //before sort
        for (Person p : people) {
            System.out.println(p.toString());
        }
        System.out.println();
        people.sort(pComp);
        // after sort
        for (Person p : people) {
            System.out.println(p.toString());
        }
        System.out.println();
        // after sort 2
        people.sort(pCompWithLimit);
        for (Person p : people) {
            System.out.println(p.toString());
        }
        System.out.println();
        //after remove
        people.removeIf(person -> person.getAge() < 18);
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
