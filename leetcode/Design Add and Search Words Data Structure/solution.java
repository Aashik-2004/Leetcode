class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean end = false;
}
class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    public void addWord(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.child[index] == null) {
                current.child[index] = new TrieNode();
            }
            current = current.child[index];
        }
        current.end = true;
    }
    public boolean search(String word) {
        return searchInNode(word, root, 0);
    }
    private boolean searchInNode(String word, TrieNode current, int pos) {
        if (current == null) {
            return false;
        }
        if (pos == word.length()) {
            return current.end;
        }
        char ch = word.charAt(pos);
        if (ch == '.') {
            for (int i=0;i<26;i++) { 
                if (current.child[i] != null && searchInNode(word, current.child[i], pos + 1)) {
                    return true;
                }
            }
            return false; 
        } else {
            int index = ch - 'a';
            return searchInNode(word, current.child[index], pos + 1); 
        }
    }
}