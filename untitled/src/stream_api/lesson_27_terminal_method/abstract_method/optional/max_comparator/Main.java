package stream_api.lesson_27_terminal_method.abstract_method.optional.max_comparator;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ProgrammingLanguage lan1 = new ProgrammingLanguage("Haskell",DifficultLevel.Hard);
        ProgrammingLanguage lan2 = new ProgrammingLanguage("Python",DifficultLevel.Easy);
        ProgrammingLanguage lan3 = new ProgrammingLanguage("Java",DifficultLevel.Medium);
        ProgrammingLanguage lan4 = new ProgrammingLanguage("C++",DifficultLevel.Hard);
        ProgrammingLanguage lan5 = new ProgrammingLanguage("JS", DifficultLevel.Easy);
        List<ProgrammingLanguage> languages = List.of(lan1,lan2,lan3,lan4,lan5);
        Optional<ProgrammingLanguage> result = languages.stream().max(Main::compareHard);

        System.out.println(result.get());

    }
    public static int compareHard(ProgrammingLanguage a, ProgrammingLanguage b) {
        if (a.getComplexity().ordinal()>b.getComplexity().ordinal()) {
            return 1;
        }
        if (a.getComplexity().ordinal()<b.getComplexity().ordinal()){
            return -1;
        }
        return Integer.compare(a.getName().length(),b.getName().length());
    }
}
