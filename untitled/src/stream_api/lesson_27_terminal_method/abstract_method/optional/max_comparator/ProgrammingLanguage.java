package stream_api.lesson_27_terminal_method.abstract_method.optional.max_comparator;

enum DifficultLevel {
    Easy, Medium, Hard;
}
public class ProgrammingLanguage {
    private String name;
    private DifficultLevel complexity;

    public ProgrammingLanguage(String name, DifficultLevel complexity){
        super();
        this.name= name;
        this.complexity = complexity;
    }
    public String getName() {
        return name;
    }
    public DifficultLevel getComplexity() {
        return complexity;
    }
    @Override
    public String toString(){
        return "ProgrammingLanguage: "+name+"complexity: "+ complexity;
    }
}
