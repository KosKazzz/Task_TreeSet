import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    private int maxCountWords;

    public PersonsComparator(int maxCount) {
        this.maxCountWords = maxCount;
    }

    public PersonsComparator() {
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surArrayOne = o1.getSurname().split(" ");
        String[] surArrayTwo = o2.getSurname().split(" ");
        if (maxCountWords <= 0 || (maxCountWords > surArrayOne.length && maxCountWords > surArrayTwo.length)) {
            if (surArrayOne.length > surArrayTwo.length) {
                return 1;
            } else if (surArrayOne.length < surArrayTwo.length) {
                return -1;
            } else {
                return ageCompare(o1.getAge(), o2.getAge());
            }
        } else if (maxCountWords <= surArrayOne.length && maxCountWords <= surArrayTwo.length) {
            return ageCompare(o1.getAge(), o2.getAge());
        } else if (maxCountWords < surArrayOne.length) {
            if (surArrayTwo.length < maxCountWords) {
                return 1;
            } else {
                return -1;
            }
        } else if (maxCountWords < surArrayTwo.length) {
            if (surArrayOne.length < maxCountWords) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public int ageCompare(int age1, int age2) {
        if (age1 > age2) {
            return 1;
        } else if (age1 < age2) {
            return -1;
        }
        return 0;
    }

}
