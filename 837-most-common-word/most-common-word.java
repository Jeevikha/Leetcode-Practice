import java.util.*;

public class Solution{
    public String mostCommonWord(String paragraph,String[] banned){
        Set<String> ban=new HashSet<>(Arrays.asList(banned));
        Map<String,Integer> count=new HashMap<>();
        paragraph=paragraph.toLowerCase().replaceAll("[!?',;.]"," ");
        String[] words=paragraph.split("\\s+");
        int max=0;
        String res="";
        for(String w:words){
            if(!ban.contains(w)&&!w.isEmpty()){
                count.put(w,count.getOrDefault(w,0)+1);
                if(count.get(w)>max){
                    max=count.get(w);
                    res=w;
                }
            }
        }
        return res;
    }
}
