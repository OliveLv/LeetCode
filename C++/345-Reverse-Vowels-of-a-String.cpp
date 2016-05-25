// 类快排的partition函数
class Solution {
public:
    string reverseVowels(string s) {
        int n=s.size();
        if(n==0)return "";
        for(int i=0,j=n-1;i<=j;){
            while(i<n){
                if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')break;
                i++;
            }
            while(j>=0){
                if(s[j]=='a'||s[j]=='e'||s[j]=='i'||s[j]=='o'||s[j]=='u'||s[j]=='A'||s[j]=='E'||s[j]=='I'||s[j]=='O'||s[j]=='U')break;
                j--;
            }
            if(i>j)break;
            char tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
            i++;
            j--;
        }
        return s;
    }
};