// Last updated: 7/14/2026, 2:02:07 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int a= (arrivalTime+delayedTime)%24;
        return a;
    }
}