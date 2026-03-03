package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {4,6,3,63,4,67,2,9};
        System.out.println(findIndex(arr,6,0)) ;
        System.out.println(findAll(arr,0,4,new ArrayList<>()));
    }

    static int findIndex(int[] arr,int target, int index){
        if(index== arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else {
            return findIndex(arr,target,index+1);
        }

    }


    static ArrayList<Integer> findAll(int[] arr, int index,int target, ArrayList<Integer>  list){
        if(index == arr.length){
            return  list;

        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAll(arr,index+1,target,list);
    }
}
