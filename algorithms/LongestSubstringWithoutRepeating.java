public class Solution {
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> charLocationMap = new HashMap<>();
		int startIndex = 0;
		int length = 0;
		int maxLength = 0;
		for (int index = 0; index < s.length(); index++) {
			char currentChar = s.charAt(index);
			if (charLocationMap.containsKey(currentChar)&& charLocationMap.get(currentChar) >= startIndex) {
				
					length = index - charLocationMap.get(currentChar);
					startIndex = charLocationMap.get(currentChar) + 1;
                    charLocationMap.put(currentChar, index);
					continue;
				
			}
			charLocationMap.put(currentChar, index);
			length++;
			if (length > maxLength) {
				maxLength = length;
			}
		}
		return maxLength;

	}
}