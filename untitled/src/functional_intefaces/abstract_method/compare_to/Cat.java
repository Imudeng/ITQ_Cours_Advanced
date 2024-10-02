package functional_intefaces.abstract_method.compare_to;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        super();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cat other = (Cat) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

        @Override
        public int compareTo(Cat cat){
            if (cat == null) {
                throw new NullPointerException();
            }

            if (this.age > cat.age) {
                return 1;
            }
            if (this.age < cat.age) {
                return -1;
            }
            return this.name.compareTo(cat.name);
    }

}


