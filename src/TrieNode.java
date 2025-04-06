import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TrieNode {
    HashMap <Character, TrieNode> children = new HashMap<>();
    boolean isLeaf = false;
    List<String> suggestions = new ArrayList<>();
    TrieNode parent = null;

    public TrieNode(TrieNode parent) {
        this.parent = parent;
    }
}
