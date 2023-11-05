class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        
        int lastFallTime = 0;
        for(int leftPosition: left){
            lastFallTime = Math.max(lastFallTime, leftPosition);
        }
        for(int rightPosition: right){
            lastFallTime = Math.max(lastFallTime, n-rightPosition);
        }
        return lastFallTime;
    }
}