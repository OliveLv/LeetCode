// Forward declaration of guess API.
// @param num, your guess
// @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
int guess(int num);
/**
ÌØÀı
2126753390
1702766719
**/
class Solution {
public:
    int guessNumber(int n) {
        int l=1,r=n;
        while(l<r){
            int mid=((long)l+(long)r)/2;
            int res=guess(mid);
            //cout<<mid<<" "<<res<<endl;
            if(res==0)return mid;
            if(res==1)l=mid+1;
            else
                r=mid-1;
        }
        return l;
    }
};