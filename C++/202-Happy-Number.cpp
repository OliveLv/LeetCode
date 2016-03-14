// using set costs 4ms
class Solution {
public:
    bool isHappy(int n) {
       set<int>s;
       if(n==0)return false;
       s.insert(n);
       while(true){
           int tmp=0;
           while(n){
               tmp+=(n%10)*(n%10);
               n/=10;
           }
           n=tmp;
           if(n==1)return true;
           if(s.find(n)!=s.end())return false;
           s.insert(n);
       }
       return false;
    }
};

// https://en.wikipedia.org/wiki/Happy_number
// Happy_number has attribute all happy number ends in 1,all non-happy number ends in 4;
// costs 0ms sometimes
class Solution {
public:
    bool isHappy(int n) {
       if(n==0)return false;
	   int tmp=0;
       while(n!=1&&n!=4){
           while(n){
               tmp+=(n%10)*(n%10);
               n/=10;
           }
           n=tmp;
		   tmp=0;
       }
       return n==1;
    }
};