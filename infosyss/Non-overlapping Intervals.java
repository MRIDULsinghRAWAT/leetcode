class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;// sorting is based in end !
            Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
            int c=0;
            int lastend=intervals[0][1];
            for(int i=1;i<intervals.length;i++){
                if(intervals[i][0]<lastend)c++;
                else{
                    lastend=intervals[i][1]; //update move- foreward
                }
            }
return c;

    }
}

/**  iska  logic to kaafi clear h - agr last elemt of the btracket is not queal 
 * to 1st elemt of the next the count ++*/