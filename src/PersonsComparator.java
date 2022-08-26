import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String[] surArrayOne = o1.getSurname().split(" ");
        String[] surArrayTwo = o2.getSurname().split(" ");
        if(surArrayOne.length > surArrayTwo.length){
            return 1;
        } else if (surArrayOne.length < surArrayTwo.length) {
            return  -1;
        } else {
            if(o1.getAge() > o2.getAge()){
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            }
        }
        return 0;
    }
}
