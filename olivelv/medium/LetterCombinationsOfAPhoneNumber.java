package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a digit string, return all possible letter combinations that the number
 * could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below.
 * 
 * 
 * Input:Digit string "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd",
 * "ce", "cf"].
 * 
 * 
 * @author olive
 *
 */
public class LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
      List<String>list=new ArrayList<String>();
      String []set={" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      for(int i=0;i<digits.length();i++){
    	  char s=digits.charAt(i);
    	  String str=set[s-'0'];
    	  List<String>tmp=new ArrayList<String>();
    	  for(int j=0;j<str.length();j++){
    		  if(list.isEmpty())tmp.add(String.valueOf(str.charAt(j)));
    		  else{
    			  for(String ele:list){
        			  tmp.add(ele+str.charAt(j));
        		  } 
    		  }
    		  
    	  }
    	  list=tmp;
      }
      /*for(String ele:list){
    	  System.out.println(ele);
      }*/
      return list;
	}
	public static void main(String []args){
		LetterCombinationsOfAPhoneNumber test =new LetterCombinationsOfAPhoneNumber();
	    test.letterCombinations("23");
	}
}
