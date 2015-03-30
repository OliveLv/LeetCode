package olivelv.easy;
//http://baike.baidu.com/link?url=X4aC6UQlP8kdrICjjsiBwD9BPLyt043ljIz8Tpz5BzooCt1qBS_qim3GLdMxbYndpWol2VVuWQPwKXnF8xW-tq
//ÂÞÂíÊý×Ö½éÉÜ
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	Map<String,Integer>map=new HashMap<String,Integer>();
	public RomanToInteger(){
		map.put("I", 1);
		map.put("V", 5);
		map.put("X",10 );
		map.put("L",50 );
		map.put("C",100 );
		map.put("D",500 );
		map.put("M",1000 );
	}
	public int romanToInt(String s) {
        int n=0;
        int l=s.length();
        if(l==0)return 0;
       // System.out.println(s.charAt(0));
        int x=map.get(String.valueOf(s.charAt(0)));
        n=x;
        for(int i=1;i<l;i++){
        	int y=map.get(String.valueOf(s.charAt(i)));
        	if(y>x)n+=y-x-x;
        	else
        		n+=y;
        	x=y;
        }
        return n;
	}
	public static void main(String []args){
		RomanToInteger test=new RomanToInteger();
		System.out.println(test.romanToInt("III"));
		System.out.println(test.romanToInt("IV"));
		System.out.println(test.romanToInt("VI"));
		
		System.out.println(test.romanToInt("MCMLXXXIV"));
		System.out.println(test.romanToInt("MDCCCLXXXVIII"));
	}
}
