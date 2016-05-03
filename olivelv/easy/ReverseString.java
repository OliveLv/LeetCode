public class ReverseString {
	// 4ms
    public String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
	// 4ms
	public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
	// 5ms
	public String reverseString(String s) {
         StringBuilder str=new StringBuilder();
        int n=s.length();
        if(n==0)return s;
        for(int i=n-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}