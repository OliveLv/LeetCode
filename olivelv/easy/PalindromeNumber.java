package olivelv.easy;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.»ØÎÄ´®
 * 
 * @author olive
 *
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int l=s.length();
        for(int i=l-1,j=0;i>=j;i--,j++)
        	if(s.charAt(i)!=s.charAt(j))return false;
        return true;
	}
	public static void main(String []args){
		PalindromeNumber test =new PalindromeNumber();
		System.out.println(test.isPalindrome(123));
		System.out.println(test.isPalindrome(121));
	}
}
