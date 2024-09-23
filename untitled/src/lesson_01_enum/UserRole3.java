package lesson_01_enum;

public enum UserRole3 {
    admin("rwd"), editor("rw"), reader;// поле перечисления
    private String filePermissions = "r";

    private UserRole3(String filePermissions) {// конструктор перечисления
        this.filePermissions = filePermissions;
    }
    private UserRole3() {

    }
    public String getFilePermissions() {// метод перечисления
        return filePermissions;
    }
}