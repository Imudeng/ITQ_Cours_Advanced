package lesson_12_liambda_functioin.sample_02;

public class Main {
    public static void main(String[] args) {
        StringModificator stringModificator = text -> {
            String result = " ";
            for (char let : text.toCharArray()) {
                if (Character.isLetter(let) || let == ' ') {
                    result += let;
                }
            }
            return result;
        };
        System.out.println(stringModificator.getString("h213123"));
    }
}
