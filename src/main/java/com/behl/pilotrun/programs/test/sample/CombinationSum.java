package com.behl.pilotrun.programs.test.sample;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {



    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0 ; i < candidates.length - 1 ; i ++ ) {
            for (int j = i +1 ; j <= candidates.length -1 ; j ++ ) {
                if (candidates[i] +  candidates[j] == target) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add( candidates[i] + candidates[j]);
                    list.add(ans);
                }
                if(target % candidates[i] == 0 ) {
                    int n = target / candidates[i];
                    List<Integer> ans = new ArrayList<>();
                    for(int jj = 1 ; jj <=  n ; jj ++ ) {

                        ans.add(candidates[i]);
                    }
                }
            }
        }
        return list;
    }
}
