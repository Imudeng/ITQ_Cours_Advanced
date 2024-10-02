package stream_api.lesson_23.begin.massive;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat() {
        super();
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Сat{name='" + name + "', age=" + age + "}";
    }

}
