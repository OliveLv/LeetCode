package lvxuhong.easy;
/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

 * @author xuhong
 *
 */
public class ExcelSheetColumnTitle {
	 public String convertToTitle(int n) {
		 String s="";
	      while(n!=0){
	    	  int temp=n%26;
	    	  n/=26;
	    	  if(temp!=0)temp+=64;
	    	  else
	    		  {
	    		  temp=90;
	    		  n--;
	    		  }
	    	  s=s+(char)(temp);
	    	 
	      }
	      String str="";
	      for(int i=s.length()-1;i>=0;i--)str+=s.charAt(i);
	      return str;
	    }
	 public static void main(String []args){
		 ExcelSheetColumnTitle test =new ExcelSheetColumnTitle();
		 for(int i=25;i<50;i++)
		 System.out.println(test.convertToTitle(i));
	 }
}
