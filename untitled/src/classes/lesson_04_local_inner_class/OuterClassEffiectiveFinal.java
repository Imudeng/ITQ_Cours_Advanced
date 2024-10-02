package lesson_04_local_inner_class;

import java.util.Comparator;

public class OuterClassEffiectiveFinal {
    private boolean reverse;
    private int n;

    OuterClassEffiectiveFinal () {

    }
    OuterClassEffiectiveFinal ( boolean reverse) {
        this.reverse = reverse;
    }
    public Comparator<String> getLengtComparator() {
        int n = 1;/** переменные не меняющие свое значение после инициализации, в зоне доступа**/
        class StringLengComparator implements Comparator<String>{

            @Override
            public int compare(String o1, String o2) {
                return (o1.length()-o2.length())*n;
            }
        }
        return new StringLengComparator();
    }
}
