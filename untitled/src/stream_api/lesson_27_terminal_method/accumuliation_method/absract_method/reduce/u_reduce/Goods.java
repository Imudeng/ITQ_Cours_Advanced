package stream_api.lesson_27_terminal_method.accumuliation_method.absract_method.reduce.u_reduce;

public class Goods {
    private String name;
    private int price;

    public Goods (String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return  "Goods "+ name+"price "+ price;
    }
}
