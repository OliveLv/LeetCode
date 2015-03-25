package lvxuhong.medium;

/**
 * Given an input string, reverse the string word by word.
 * 
 * For example, Given s = "the sky is blue", return "blue is sky the".
 * 
 * @author xuhong
 *
 */
public class ReverseWordsinaString {
	public String reverseWords(String s) {
         String []str=s.split(" ");
         String ns="";
        // System.out.println(str.length);
         for(int i=str.length-1;i>=0;i--){
        //	 System.out.println("$"+str[i]+"$");
        	 if(str[i].equals(""))continue;
        	 if(i==str.length-1)ns+=str[i];
        	 else
        		 ns+=" "+str[i];
         }
         return ns;
	}
	public static void main(String []args){
		ReverseWordsinaString test=new ReverseWordsinaString();
		System.out.println(test.reverseWords(" 1"));
	}
}
