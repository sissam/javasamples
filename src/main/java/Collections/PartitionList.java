package Collections;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionList {

    public static List<List<Integer>> partitionListEasyWay(List<Integer> bigList, int sizeSubList) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i< bigList.size(); i+=sizeSubList){
            result.add(bigList.subList(i, Math.min(bigList.size(), i+sizeSubList) ));
        }
        return result;
    }

    public List<List<Integer>> partitionList(List<Integer> bigList, int sizeSubList) {

        return null;
    }

    public static int[][] partionPrimitiveTypes(int[] bigArray, int sizeSubArray){
        int numberOfSubArrays = bigArray.length%sizeSubArray == 0 ? bigArray.length/sizeSubArray: bigArray.length/sizeSubArray+1;
        int[][] result = new int[numberOfSubArrays][sizeSubArray] ;
        for(int j = 0; j < numberOfSubArrays; j++) {
            for (int i = 0; i < bigArray.length; i += sizeSubArray) {
                result[j] = Arrays.copyOfRange(bigArray, i, Math.min(bigArray.length, i + sizeSubArray));
            }
        }
        return result;
    }

    public static List<List<Integer>> partionListThirdLibs(List<Integer> bigList, int sizeSubList) {
        return ListUtils.partition(bigList, sizeSubList);
    }

}
