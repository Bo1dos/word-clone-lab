package objects;

public class SearchReplaceDialog {
    public void search(String query, boolean matchCase) {
        System.out.println("Search: looking for \"" + query + "\" (matchCase=" + matchCase + ")");
    }
    
    public void replace(String from, String to) {
        System.out.println("Replace: \"" + from + "\" → \"" + to + "\"");
    }
}
