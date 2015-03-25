package lvxuhong.easy;

/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * Update (2014-11-02):
 * 
 * @author xuhong
 *
 */
public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
       if(!haystack.contains(needle))return -1;
       return haystack.indexOf(needle);
	}
}
