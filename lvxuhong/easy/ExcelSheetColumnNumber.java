package lvxuhong.easy;

public class ExcelSheetColumnNumber {
   public int titleToNumber(String s) {
        int num=0;
        int n=s.length();
        for(int i=0;i<n;i++){
        	num=num*26+s.charAt(i)-'A'+1;
        }
        return num;
    }
   public static void main(String []args){
	   ExcelSheetColumnNumber test=new ExcelSheetColumnNumber();
	   System.out.println(test.titleToNumber("A"));
	   System.out.println(test.titleToNumber("Z"));
	   System.out.println(test.titleToNumber("AB"));

   }
}
