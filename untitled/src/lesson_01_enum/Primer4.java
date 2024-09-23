package lesson_01_enum;

public class Primer4 {
    public static void main(String[] args) {
    UserRole3 role0 = UserRole3.editor;
    String p = role0.getFilePermissions();

    System.out.println(p);
}
}
