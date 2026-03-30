class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
  
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int size=position.length;
        Pair[] pairs=new Pair[size];
        for (int i=0;i<size;i++){
            pairs[i]=new Pair(position[i],speed[i]);
        }
        Arrays.sort(pairs,(a,b)->b.x - a.x);
        Stack<Double>stack=new Stack<Double>();
        int count=0;
        
        for(int i=0;i<size;i++){
            Pair v=pairs[i];
            int x=v.x;
            int td=target-x;
            double t=(double) td / v.y;
            if(stack.isEmpty() || stack.peek()<t){
                stack.push(t);
            }
                
        }
        return stack.size();
    }
}
