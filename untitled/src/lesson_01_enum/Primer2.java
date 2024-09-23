package lesson_01_enum;

import java.util.Scanner;
public class Primer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedi rol");

        UserRole userRole = UserRole.valueOf(sc.nextLine());
        switch (userRole) {
            case ADMIN:
                System.out.println("God");
                break;
            case EDITOR:
                System.out.println("Half-God");
                break;
            case READER:
                System.out.println("Human");
                break;
            default:// попробовать добавить экземпшн
                System.out.println("Neverno");
        }
        //получение всех значениц перечиления
        UserRole[] role = UserRole.values();
        for (int i=0;i<role.length;i++) {
            System.out.println(role[i]);
        }
    }
}/*авп

