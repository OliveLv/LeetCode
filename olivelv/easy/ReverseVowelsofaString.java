public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        int n=s.length();
        char[]ans=new char[n];
        StringBuilder res=new StringBuilder("");
        if(n==0)return "";
        char l='a',r='a';
        for(int i=0,j=n-1;i<=j;){
            
               while(i<n){
                   l=s.charAt(i);
                   if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u'||l=='A'||l=='E'||l=='I'||l=='O'||l=='U')break;
                   ans[i++]=l;
               }
               while(j>=0){
                   r=s.charAt(j);
                   if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'||r=='A'||r=='E'||r=='I'||r=='O'||r=='U')break;
                   ans[j--]=r;
               }
               if(i>j)break;
               ans[i]=r;
               ans[j]=l;
               i++;
               j--;
        }
        for(int i=0;i<n;i++)res.append(ans[i]);
        return res.toString();
    }
}