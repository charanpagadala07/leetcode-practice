class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getValue(s).equals(getValue(t));
    }

    public String getValue(String input){
        StringBuilder result = new StringBuilder();
        int hashcount = 0;

        for(int i = input.length() - 1; i>=0;i--){
            if(input.charAt(i)=='#'){
                hashcount++;
                continue;
            }

            if(hashcount>0){
                hashcount--;
            } else {
                result.insert(0, input.charAt(i));
            }
        }
        return result.toString();
    }
}