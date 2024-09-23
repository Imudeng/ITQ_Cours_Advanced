package lesson_01_enum;

public class Primer1 {
    public static void main(String[] args) {
            UserRole role1 = UserRole.EDITOR;
            UserRole role2 = UserRole.READER;
            System.out.println(role2 == role1);
            System.out.println(role1 == role1);
            switch (role1) {
                case ADMIN:
                    System.out.println("God");
                    break;
                case EDITOR:
                    System.out.println("Half-God");
                    break;
                case READER:
                    System.out.println("Human");
                    break;
            }
            String name2 = role2.name();
            int ord2 = role2.ordinal();
        System.out.println(name2);
        System.out.println(ord2);
    }
}

