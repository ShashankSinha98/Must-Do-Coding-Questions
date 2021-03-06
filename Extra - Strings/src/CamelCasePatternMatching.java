import java.util.*;

public class CamelCasePatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new CamelCasePatternMatching()
				.CamelCase(8, new String[] {"Hi","Hello","HelloWorld",
						"HiTech","HiGeek","HiTechWorld",
						"HiTechCity","HiTechLab"}, "HT"));
	}
	
	ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        
		Trie trie = new Trie();
		
		for(String word: Dictionary) {
			String acronym = getAcronym(word);
			trie.insert(acronym, word);
		}
		
		return trie.get(Pattern);
    }
	
	private String getAcronym(String word) {
		String res="";
		for(char c: word.toCharArray()) {
			if(c>='A' && c<='Z') res+=c;
		}
		return res;
	}
	
	

}


class TrieNode {
	
	char c;
	boolean isLeaf;
	ArrayList<String> words;
	TrieNode[] childrens;
	
	public TrieNode(char c) {
		this.c = c;
		isLeaf = false;
		words = new ArrayList<>();
		childrens = new TrieNode[26];
	}
}




class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	public void insert(String acronym, String fullWord) {
		
		TrieNode curr = root;
		
		for(int i=0; i<acronym.length(); i++) {
			
			char c = acronym.charAt(i);
			
			if(curr.childrens[c-'A']==null) {
				TrieNode n = new TrieNode(c);
				curr.childrens[c-'A'] = n;
			}
			
			curr = curr.childrens[c-'A'];
		}
		
		curr.isLeaf = true;
		curr.words.add(fullWord);
	}


	public ArrayList<String> get(String acronym) {
		ArrayList<String> res = new ArrayList<>();
		
		TrieNode curr = root;
		for(int i=0; i<acronym.length(); i++) {
			
			char c = acronym.charAt(i);
			
			if(curr.childrens[c-'A']==null) return res;
			
			curr = curr.childrens[c-'A'];
		}
		
		get(curr, res);
		
		return res;
	}
	
	
	private void get(TrieNode curr, ArrayList<String> res) {
		
		if(curr.isLeaf) {
			for(String s: curr.words) {
				res.add(s);
			}
		}
		
		for(int i=0; i<curr.childrens.length; i++) {
			if(curr.childrens[i]!=null) 
				get(curr.childrens[i], res);
		}
		
	}
	
	
	
	
}




