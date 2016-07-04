// using sqrt()
class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==0)return true;
        int n=floor(sqrt(num));
        if(n*n==num)return true;
        return false;
    }
};
// 1 
// 4=1+3
// 9=1+3+5
// 16=1+3+5+7
// ...
// n*n=1+3+...(2n-1)
class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==0)return true;
        int i=1;
        int tmp=0;
        while(num>0){
            num-=i;
            i+=2;
        }
        return num==0;
    }
};
// binary search
class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==0|num==1)return true;
        int left=0,right=num;
        while(left<right){
            int mid=left+(right-left)/2;
            if(num%mid==0&&num/mid==mid)return true;
            if(num/mid>mid)left=mid+1;
            else
                right=mid;
        }
        return false;
    }
};
// newton method
// initial x
// x=(x+n/x)/2
// stop if x*x==n
class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==0|num==1)return true;
        long x=num;
        while(x*x>num){
            x=(x+num/x)/2;
        }
        return x*x==num;
    }
};