class Solution {
public:
    int getSum(int a, int b) {
        int res=0;
        int base=1;
        int c=0;
        // 控制负数的情况(-1,1)
        int idx=0;
        while((a!=0||b!=0)&&idx<32){
            int a1=a&1;
            int b1=b&1;
            int tmp=a1^b1^c;
            c=(a1&b1)|(a1^b1)&c;
           // cout<<c<<endl;
            res|=base*tmp;
            base<<=1;
            a>>=1;
            b>>=1;
            idx++;
        }
        res|=c*base;
        return res;
    }
};