package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

//LeetCode 253
public class MeetingRoomsII {

    public static int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0) return 0;

        //1. sort Array by start times
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(intervals));

        PriorityQueue<Integer> meetEnd= new PriorityQueue<>();

        // Add first meeting's end time
        meetEnd.offer(intervals[0][1]);

        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0] >= meetEnd.peek()){
                meetEnd.poll();
            }
            meetEnd.offer(intervals[i][1]);
        }

        return meetEnd.size();
    }

    public static void main(String[] args) {
        int[][] intervals = {{15, 20}, {0, 30}, {5, 10}};
        int meetRooms = minMeetingRooms(intervals);
        System.out.println(meetRooms);
    }

    public static int bruteForce(int[][] intervals)
    {
        int max = 0;

        for (int row = 0; row<intervals.length;row++){
            for (int col = 0;col<intervals.length;col++){
                if(col!=row){
                    int start = intervals[row][0];
                    int end = intervals[row][1];

                    if(start< intervals[col][0] && intervals[col][0] <end ){
                        max+=1;
                    }
                }
            }
        }
        System.out.println(max);
    return max;
    }
}
