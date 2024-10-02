package lesson_04_local_inner_class;

import java.util.Comparator;

public class OuterClassProblemAccess {
    private boolean reverse;

    public OuterClassProblemAccess() {

    }

    public OuterClassProblemAccess(boolean reverse) {
        this.reverse = reverse;
    }

    public Comparator<String> getLengComparator() {
        class StringLengComparator implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                int direction = 1;
                if (OuterClassProblemAccess.this.reverse) {
                    direction = -1;
                }
                return (o1.length() - o2.length()) * direction;
            }
        }
        return new StringLengComparator();
    }
}
