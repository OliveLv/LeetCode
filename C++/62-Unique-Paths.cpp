class Solution {
public:
    int uniquePaths(int m, int n) {
        int res=1;
        if(n==1||m==1)return 1;
        int tmp=m>n?n-1:m-1;
       for(int i=m+n-2,j=1;j<=tmp;i--,j++)
       res=(int)((long)res*(long)i/j);
       return res;
    }
};