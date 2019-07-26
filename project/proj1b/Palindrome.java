public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        Deque<Character> temp = new LinkedListDeque<Character>();
        for(int i = 0; i < word.length(); i ++){
            temp.addLast(word.charAt(i));
        }
        return temp;
    }
    /*Is a String word a Palindrome?
    *  A palindrome is defined as a word
    *  that is the same whether it is read
    *  forwards or backwards. For example “a”, “racecar”
    *  Any word of length 1 or 0 is a palindrome*/
    public boolean isPalindrome(String word){
        Deque<Character> temp = wordToDeque(word);
        while((temp.isEmpty() != true) && (temp.size() != 1)) {
            if (temp.removeFirst() != temp.removeLast()) {
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(String word, CharacterComparator cc){
        Deque<Character> temp = wordToDeque(word);
        while((temp.isEmpty() != true) && (temp.size() != 1)) {
            if ( ! cc.equalChars( temp.removeFirst(), temp.removeLast() ) ) {
                return false;
            }
        }
        return true;
    }
}
