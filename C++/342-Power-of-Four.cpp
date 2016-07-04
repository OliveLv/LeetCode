class Solution {
public:
    bool isPowerOfFour(int num) {
        if(num<=0||((num&(num-1))!=0))return false;
        while(num){
            if(num&1==1)return true;
            num>>=2;
        }
        return false;
    }
};

class Solution {
public:
    bool isPowerOfFour(int num) {
        return num>0&&(num&(num-1))==0&&((num&0xAAAAAAAA)==0);
    }
};