package lesson_04_local_inner_class;

import java.util.Comparator;

public class OuterClass {
    private boolean reverse;

    public OuterClass() {

    }

    public OuterClass(boolean reverse) {
        this.reverse = reverse;
    }

    public Comparator<String> getLengtComparator() {
        class StringLengComparator implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }
        return new StringLengComparator();
    }
}


