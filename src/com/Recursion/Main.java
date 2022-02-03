package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// subsets of an array.

    int[] arr = {1,2,3,4,5};
    List<List<Integer>> list = subsets(arr);
        System.out.println(list);
    }
    public static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
    }
}
