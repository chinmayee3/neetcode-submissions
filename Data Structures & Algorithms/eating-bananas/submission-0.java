class Solution {

    public int totalHrs(int[] piles,int k){//k=14, 25 10 23 4
        int total=0;
        for(int i=0;i<piles.length;i++){
            total += Math.ceil(piles[i]/k);
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        //lenght of array
        int n=piles.length;
        //find min element in array
        int max=piles[0];
       
        //find max element in array
        for(int i=1;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }

        }

        // array range is min -> max
        int low=1;//4
        int high= max;//25
        
        while(low<high){
            int mid= low + (high-low)/2;//14
            // if(mid==0) break;
            // int hoursNeeded=totalHrs(piles,mid);//
            long hoursNeeded = 0;
            
            // Calculate total hours required at speed 'mid'
            for (int pile : piles) {
                // Equivalent to Math.ceil(pile / (double) mid)
                hoursNeeded += (pile + mid - 1) / mid;
            }
            
            
            if (hoursNeeded <= h) {
                // If feasible, try a slower speed
                high = mid;
            } else {
                // If not feasible, must eat faster
                low = mid + 1;
            }
    
        }

        return low;
        
    }
}
