class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            int x=temperatures[i];
            for(int j=i+1;j<n;j++){
                int y=temperatures[j];
                if(y>x) {
                    count=j;
                    break;
                }
            }
            int v=count-i;
            if(v>0){
                arr[i]=v;
            }
            else{
                arr[i]=0;
            }
        }
        return arr;
    }
}
