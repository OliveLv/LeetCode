package olivelv.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author olivelv
 * @version time: 2015年5月3日 下午10:58:01
 */
public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		if (n <= 1)
			return n;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int base = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String str = String.valueOf(s.charAt(i));
			if (map.get(str) == null) {
				sum++;
			} else {
				int val = map.get(str);
				if (base > val) {
					sum++;
				} else {
					// System.out.println(val+" "+i);
					sum = i - val;
					base = val + 1;
				}
			}
			map.put(str, i);
			if (sum > max)
				max = sum;
		}
		// if(sum>max)max=sum;
		return max;
	}

	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(test.lengthOfLongestSubstring("abcabcbb"));
	}
}
