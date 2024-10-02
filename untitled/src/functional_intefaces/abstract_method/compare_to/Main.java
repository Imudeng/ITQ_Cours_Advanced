package functional_intefaces.abstract_method.compare_to;


public class Main {
    public static void main(String[] args) {
        Cat a = new Cat("Boris", 5);
        Cat b = new Cat("Zefir", 15);
        Cat c = new Cat("Vasia", 3);
        Cat d = new Cat("Fenia", 2);
        Cat e = new Cat("Masha", 7);
        System.out.println(sgn(a.compareTo(b)) == -sgn(b.compareTo(a)));
        System.out.println((a.compareTo(b) > 0 && b.compareTo(c) > 0) && a.compareTo(c) > 0);
        System.out.println(a.compareTo(d) == 0 && (sgn(a.compareTo(c)) == sgn(d.compareTo(c))));
        System.out.println(a.equals(d) == true && a.compareTo(d) == 0);
        System.out.println(a.equals(b) == false && a.compareTo(b) != 0);
        System.out.println(a.equals(e) == false && a.compareTo(e) != 0);
    }


    public static int sgn(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        }
        return 0;
    }
}
