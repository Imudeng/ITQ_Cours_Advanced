package lesson_01_enum;

//пример с полями и методами
public class Primer3 {
    public static void main(String[] args) {
        UserRole2 role0 = UserRole2.admin;
        String p = role0.getFilePermissions();

        System.out.println(p);
    }
}
