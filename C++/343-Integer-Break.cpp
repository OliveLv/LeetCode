// find regulation 
// n  res
// 6  3*3
// 7  3*4
// 8  3*3*2
// 9  3*3*3
// 10 3*3*4
// 11 3*3*3*2
class Solution {
public:
    int integerBreak(int n) {
        if(n<=2)return 1;
        if(n==3)return 2;
        if(n==4)return 4;
        int res=1;
        for(int i=3;i<=n;i+=3){
    	     if(n-i==1){
    		     res*=4;
    		    break;
    	    }
    	if(n-i==2){
    		res*=6;
    		break;
    	}
    	res*=3;
     }
     return res;
    }
};