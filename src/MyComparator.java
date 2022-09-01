import java.util.Comparator;

@FunctionalInterface
public interface MyComparator<T> extends Comparator<T> {
    int compare(T t1,T t2);
}
