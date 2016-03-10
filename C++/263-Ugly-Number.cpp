class Solution {
public:
    bool isUgly(int num) {
        if(num<1)return false;
		// 4ms
        while((num&1)==0)num>>=1;
		// 8ms
        //while((num%2)==0)num/=2;
        while(num%3==0)num/=3;
        while(num%5==0)num/=5;
        return num==1;
    }
};