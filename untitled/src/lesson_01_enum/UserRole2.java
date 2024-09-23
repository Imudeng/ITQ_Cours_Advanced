package lesson_01_enum;

public enum UserRole2 { admin, editor, reader;
private String filePermissions = "rwd";
public String getFilePermissions() {
    return filePermissions;
}
public void setFilePermissions(String filePermissions) {
    this.filePermissions = filePermissions;
}
}
