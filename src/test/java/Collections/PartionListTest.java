package Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PartionListTest {

    int maxSize ;
    List<Integer> input ;
    int numberSubLists;
    @Before
    public void initialize(){
        maxSize = 3 ;
        input = Arrays.asList(1,2,3,4,5);
        //fix
        numberSubLists = getNumberOfSubLists(input, maxSize);
    }

    @Test
    public void testCode(){

        Double tot = 99.35 + 1.10 ;
        System.out.println(tot);
        /*
        HashMap m = new HashMap();
        Object o1 = new Object();
        Object o2 = o1;
        m.put(o1, 1);
        m.put(o2, 2);
        System.out.println(m.get(o1));
        String s = "A";
        s.toLowerCase();
        System.out.println(s);
        ArrayList l = new ArrayList(2);
        l.add(1);
        l.add(1);
        l.add(1);
        System.out.println(l.size());
        */
    }

    @Test
    @Ignore
    public void should_return_list_of_lists_using_easy_way(){
        int i =0 ;
        System.out.println(++i);
        List<List<Integer>> output = PartitionList.partitionListEasyWay(input, maxSize);
        Assert.assertEquals(output.size(), numberSubLists);
        Assert.assertEquals(getMaxSubListSize(output), maxSize);
    }

    @Test
    @Ignore
    public void should_return_list_of_list_using_third_libs(){
        //WHEN
        List<List<Integer>> output = PartitionList.partionListThirdLibs(input, maxSize);
        //THEN
        Assert.assertEquals(output.size(), numberSubLists);
        Assert.assertEquals(getMaxSubListSize(output), maxSize);
    }

    @Test
    @Ignore
    public void should_return_list_of_list_using_primitive_types(){
        //GIVEN
        int[] inputArray = {1,2,3,4,5};
        int max = 3 ;
        //WHEN
        int[][] output = PartitionList.partionPrimitiveTypes(inputArray, max);
        //THEN
        Assert.assertEquals(output.length, numberSubLists);
        //Assert.assertEquals(getMaxSubListSize(ou), maxSize);
    }



    public int getMaxSubListSize(List<List<Integer>> list) {
        //check if null or empty
        int max = list.get(0).size();
        for (List<Integer> comp:list){
            if(comp.size()> max){
                max = comp.size();
            }
        }
        return max ;
    }

    public int getNumberOfSubLists(List<Integer> input, int maxSize){
        int res = input.size()/maxSize;
        if(input.size() % maxSize != 0){
            res+=1;
        }
        return res ;
    }
}
