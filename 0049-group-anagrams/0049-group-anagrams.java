import java.util.ArrayList;
import java. util.Map;
import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyStringsMap = new HashMap<>();
        for(String str:strs){

            String frequencyString = getfrequencyString(str);

            if(frequencyStringsMap.containsKey(frequencyString)){
                frequencyStringsMap.get(frequencyString).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                frequencyStringsMap.put(frequencyString, strList);
            }
        }

        return new ArrayList<>(frequencyStringsMap.values());
    }

    public String getfrequencyString(String str){
        int[] frequency = new int[26];

        for(char ch:str.toCharArray()){
            frequency[ch-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int count:frequency){
            sb.append(count).append('#');
        }

        return sb.toString();
    }
}