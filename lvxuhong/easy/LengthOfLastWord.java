package lvxuhong.easy;
/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
 Given s = "Hello World",
 return 5. 

 * @author xuhong
 *
 */
public class LengthOfLastWord {
	 public int lengthOfLastWord(String s) {
	        int l=0;
	        int n=s.length();
	        boolean flag=true;
	        for(int i=n-1;i>=0;i--){
	        	if(s.charAt(i)==' '&&!flag)break;
	        	else{
	        		if(s.charAt(i)!=' '){
	        			l++;
	    	        	flag=false;
	        		}
	        	
	        	}
	        }
	        	
	        
	        return l; 
	    }
	 public static void main(String []args){
		 LengthOfLastWord test=new LengthOfLastWord();
		 System.out.println(test.lengthOfLastWord("Hello World"));
		 System.out.println(test.lengthOfLastWord("Hello"));
		 System.out.println(test.lengthOfLastWord("Hello "));
	 }
}
