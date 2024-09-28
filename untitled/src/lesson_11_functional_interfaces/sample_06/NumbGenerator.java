package lesson_11_functional_interfaces.sample_06;

public class NumbGenerator {

    public Integer add(Integer n) {
        return n+10;
    }
    public Double add(Double n) {
        return n+10.0;
    }
    public String add(String n) {
        return n+" "+n;
    }

}
