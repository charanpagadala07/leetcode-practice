class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        int[] count = new int[26];

        for(char ch:s.toCharArray()){
            count[ch - 'a']++;
        }

        List<Character> chars = new ArrayList<>();

        for(char ch = 'z';ch>='a';ch--){
            if(count[ch-'a']>=k){
                chars.add(ch);
            }
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        String answer = "";

        while(!queue.isEmpty()){
            String current = queue.poll();

            for(char ch:chars){
                String candidate = current +ch;

                if(isValid(s, candidate, k)){
                    queue.offer(candidate);


                    if (candidate.length() > answer.length() || (candidate.length() == answer.length() && candidate.compareTo(answer) > 0)) {
                        answer = candidate;
                    }
                }
            }
        }

        return answer;
    }

    public boolean isValid(String s, String candidate, int k){
        StringBuilder target = new StringBuilder();

        for (int i = 0; i < k; i++) {
            target.append(candidate);
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < target.length()) {

            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }

            i++;
        }

        return j == target.length();
    }
}