class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] daysinMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int AliceArrived = convert(arriveAlice, daysinMonth);
        int AliceLeft = convert(leaveAlice, daysinMonth);
        int BobArrived = convert(arriveBob, daysinMonth);
        int BobLeft = convert(leaveBob, daysinMonth);

        int start = Math.max(AliceArrived, BobArrived);
        int end = Math.min(AliceLeft, BobLeft);
        if(start>end){
            return 0;
        }

        return end-start+1;
        
    }

    public int convert(String date, int[] daysinMonth){
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));

        int total = day;
        for(int i = 0; i < month - 1;i++){
            total += daysinMonth[i];
        }
        return total;
    }
}