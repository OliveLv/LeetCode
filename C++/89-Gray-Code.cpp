class Solution {
public:
    vector<int> grayCode(int n) {
        vector<int>res;
        res.push_back(0);
        if(n==0)return res;
        res.push_back(1);
        if(n==1)return res;
        int tmp=2;
        int num=(1<<n);
        while(tmp!=num){
            for(int i=tmp-1;i>=0;i--)res.push_back(res[i]+tmp);
            tmp<<=1;
        }
        return res;
    }
};