Task description: 
implement a Palindrome class, in which there are two overloading methods testing whether a word is Palindrome. 
Methods format is "boolean isPalindrome(String word)" and "boolean isPalindrome(String word, CharacterComparator cc)"
The first method return true if the word is the same whether it is read forwards or backwards. For example ¡°a¡±, ¡°racecar¡±are palindromes. Any word of length 1 or 0 is a palindrome.
The second method return true if the corresponding characters of a word is off by one. For example, "ab","ba" and "flake".

codes:
A LinkedListDeque class implements Deque interface. In palindrome class, a method "Deque<Character> wordToDeque(String word" is defined to convert a word to Deque. And this method is used in isPalindrome() to compare the corresponding characters.
A OffByOne class implements CharacterComparator interface and is used in isPalindrome().
And there are also several test class.