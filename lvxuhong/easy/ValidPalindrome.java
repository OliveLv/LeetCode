package lvxuhong.easy;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 * 
 * @author xuhong
 *
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        boolean flag=true;
        int l=s.length();
        s=s.toLowerCase();
        for(int i=0,j=l-1;i<j;i++,j--){
        	for(;i<l;i++){
        		char c=s.charAt(i);
        		if((c>='0'&&c<='9')||(c>='a'&&c<='z'))break;
        	}
        	for(;j>=0;j--){
        		char c=s.charAt(j);
        		if((c>='0'&&c<='9')||(c>='a'&&c<='z'))break;
        	}
        	//System.out.println(i+" "+j);
        	if(i>=j)break;
        	if(s.charAt(i)!=s.charAt(j)){
        		
        		return false;
        	}
        }
        return flag;
	}
	public static void main(String []args){
		String s="A man, a plan, a canal: Panama";
		String str="1a2";
		ValidPalindrome test=new ValidPalindrome();
		System.out.println(test.isPalindrome(s));
		System.out.println(test.isPalindrome(str));
	}
}
