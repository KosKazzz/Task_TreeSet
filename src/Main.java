import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Diego", "Soto Palma", 25));
        people.add(new Person("Cristóbal", "de la Cruz Escobar", 44));
        people.add(new Person("Cristián", "Álvarez del Rí", 34));
        people.add(new Person("Emilia", "ACastro Molina", 31));
        people.add(new Person("María", "Dolores Navarrete Marín", 27));
        people.add(new Person("Natalia", "Escobar Carrasco de la Cruz", 21));
        people.add(new Person("Emilia", "Molina de la Cruz", 17));
        people.add(new Person("Diego", "Palma de la Rí", 5));

        MyComparator<Person> myComp = (p1, p2) -> {
            if (p1.getSurname().split(" ").length == p2.getSurname().split(" ").length) {
                return Integer.compare(p1.getAge(), p2.getAge());
            } else {
                return Integer.compare(p1.getSurname().split(" ").length, p2.getSurname().split(" ").length);
            }
        };
        MyComparator<Person> myCompWithLimit = (p1, p2) -> {
            if (
                    (p1.getSurname().split(" ").length == p2.getSurname().split(" ").length)
                            || (p1.getSurname().split(" ").length >= 3 && p2.getSurname().split(" ").length >= 3)
            ) {
                return Integer.compare(p1.getAge(), p2.getAge());
            } else if (p1.getSurname().split(" ").length < 3) {
                return -1;
            } else if (p2.getSurname().split(" ").length < 3) {
                return 1;
            } else {
                return Integer.compare(p1.getSurname().split(" ").length, p2.getSurname().split(" ").length);
            }
        };
        //before sort
        for (Person p : people) {
            System.out.println(p.toString());
        }
        System.out.println();
        // after sort 1
        people.sort(myComp);
        for (Person p : people) {
            System.out.println(p.toString());
        }
        System.out.println();
        // after sort 2
        people.sort(myCompWithLimit);
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
