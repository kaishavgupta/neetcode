class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length;
        int max = Arrays.stream(piles).max().getAsInt();
        int min=1;
        int res=max;
        
        while(min<=max){
            int k=min+(max-min)/2;
            long tot=0;
            for (int p:piles){
                tot+=(p + k - 1L) / k;
            }
            if(tot<=h){
                res= k;
                max=k-1;
            }
            else{
                min=k+1;
            }
        }
        return res;
    }
}
