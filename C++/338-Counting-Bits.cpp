class Solution {
public:
    vector<int> countBits(int num) {
        vector<int>res(num+1,0);
        int base=1;
        int k=1;
        while(k<=num){
        for(int j=0;j<base&&k<=num;j++)
                res[k++]=res[j]+1;
            base<<=1;
        }
        return res;
         
    }
};
