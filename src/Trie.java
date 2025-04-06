import java.util.ArrayList;
import java.util.List;

public class Trie {
    TrieNode root = new TrieNode(null);
    TrieNode currentNode = root;
    int maxBackRetention;
    int genDelay;

    public Trie(int maxBackRetention, int genDelay) {
        this.maxBackRetention = maxBackRetention;
        this.genDelay = genDelay;
    }

    List<String> onKeyPress(char key){
        if(Character.isWhitespace(key)) return null;
        if(currentNode.children.containsKey(key)) currentNode = currentNode.children.get(key);
        else {
            TrieNode newNode = new TrieNode(currentNode);
            currentNode.children.put(key, newNode);
            currentNode = newNode;
            generateSuggestions();
        }
        return currentNode.suggestions;
    }

    void generateSuggestions(){
        currentNode.suggestions = List.of("example1", "example2");
    }
}
