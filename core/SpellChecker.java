public class SpellChecker {
    public void checkWord(String word) {
        if (!word.matches("[а-яА-Я]+")) {  // простейшая проверка
            System.out.println("SpellChecker: possible misspelling: \"" + word + "\"");
        }
    }
    
    public String[] suggestCorrections(String word) {
        System.out.println("SpellChecker: suggestions for \"" + word + "\"");
        return new String[]{"вариант1", "вариант2"};
    }
}