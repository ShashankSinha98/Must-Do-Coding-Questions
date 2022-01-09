import java.util.*;
public class MostFrequentWordInAnArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String res = new MostFrequentWordInAnArrayOfStrings()
				.mostFrequentWord(new String[] {"hello","for","geeks"}, 3);
		
		System.out.println(res);
	}
	
	public String mostFrequentWord(String arr[],int n)
    {
        ArrayList<Word> list = new ArrayList<>();
        HashMap<String, Word> map = new HashMap<>();
        
        for(String word: arr) {
        	
        	if(!map.containsKey(word)) {
        		Word newWord = new Word(word);
        		newWord.count = 1;
        		list.add(newWord);
        		map.put(word, newWord);
        	
        	} else {
        		Word exWord = map.get(word);
        		exWord.count+=1;
        	}
        }
        
        int maxCount = 0;
        
        for(Word word: list) {
        	maxCount = Math.max(maxCount, word.count);
        }
        
        for(int i=list.size()-1;i>=0; i--) {
        	if(list.get(i).count==maxCount) return list.get(i).name;
        }
        
        return null;
    }
	
	class Word {
		String name;
		int count;
		
		public Word(String name) {
			this.name = name;
			count = 0;
		}
	}

}
