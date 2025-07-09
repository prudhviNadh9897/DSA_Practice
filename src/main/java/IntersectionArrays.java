import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionArrays {

    public static void main(String[] args) {


    }

    public int[] intersectWithHashMap(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> countHash = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i =0; i<nums1.length; i++){
            int num1 = nums1[i];
            countHash.put(num1, countHash.getOrDefault(num1,0)+1);
        }

        for(int j =0; j<nums2.length; j++){
            int num2 = nums2[j];
            int count = countHash.getOrDefault(num2,0);
            if(count!=0){
                result.add(num2);
                countHash.put(num2,count-1);

            }
        }
        int[] resArr = new int[result.size()];
        for(int i =0; i<result.size(); i++){
            resArr[i]=result.get(i);
        }
        return resArr;
    }
}
