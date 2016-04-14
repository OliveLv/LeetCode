public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String []words=str.split(" ");
        if(words.length!=pattern.length())return false;
        Map<String,String>map=new HashMap<String,String>();
        Map<String,String>m=new HashMap<String,String>();
        int n=words.length;
        map.put(words[0],String.valueOf(pattern.charAt(0)));
        m.put(String.valueOf(pattern.charAt(0)),words[0]);
        for(int i=1;i<n;i++){
            String tmp=String.valueOf(pattern.charAt(i));
            if(map.containsKey(words[i])){
                if(!map.get(words[i]).equals(tmp))return false;
            }else
                {
                    if(m.containsKey(tmp))return false;
                    map.put(words[i],tmp);
                    m.put(tmp,words[i]);
                }
        }
        return true;
         
    }
}

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String []words=str.split(" ");
        int n=words.length;
        if(n!=pattern.length())return false;
        String map[]=new String[26];
        Set<String>set=new HashSet<String>();
        char tmp=pattern.charAt(0);
        map[tmp-'a']=words[0];
        set.add(words[0]);
        for(int i=1;i<n;i++){
            tmp=pattern.charAt(i);
            if(map[tmp-'a']==null){
                if(set.contains(words[i]))return false;
                map[tmp-'a']=words[i];
                set.add(words[i]);
            }else{
                if(!words[i].equals(map[tmp-'a']))return false;
            }
        }
        return true;
         
    }
}

public class Solution {
        public boolean partition(String str, ArrayList<String> b) {
            if (str.length()==0) return false;
            int prev=-1, i=str.indexOf(' ');
            while (i!=-1) {
                b.add(str.substring(prev+1,i));
                prev=i;
                i=str.indexOf(' ',i+1);
            }
            b.add(str.substring(prev+1));
            return true;
        }
 
        public boolean wordPattern(String pattern, String str) {
            ArrayList<String> b = new ArrayList<String>();;
            if (!partition(str,b)) return false;
            if (b.size()!=pattern.length()) return false;
            String[] map = new String[26];
            HashSet<String> mapped = new HashSet<String>();
            for (int i=0; i<pattern.length(); i++)
                if (map[pattern.charAt(i)-'a']==null) {
                    if (mapped.contains(b.get(i))) return false;
                    mapped.add(b.get(i));
                    map[pattern.charAt(i)-'a']=b.get(i);
                } else {
                    if (!map[pattern.charAt(i)-'a'].equals(b.get(i))) return false;
                }
            return true;
 
        }
    }