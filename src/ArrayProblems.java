import java.util.Arrays;

public class ArrayProblems {
    public static int hammingDistance(int[] aList, int[] bList){
        if(aList.length!=bList.length){
            return -1;
        }
        int distance=0;
        for(int i=0;i<aList.length;i++){
            if(aList[i]!=bList[i]){
                distance++;
            }
        }
        return distance;
    }
    public static void main(String [] argv){
        int [] aList = {1, 2, 0 ,4, 5, 4, 3, 9, 1};
        int [] bList = {1, 2, 8, 4, 5, 4, 3, 5, 1};
        int distance =ArrayProblems.hammingDistance(aList,bList);
        if(distance>=0) {
            System.out.println("Hamming distance between array" +
                    Arrays.toString(aList) + " and array" + Arrays.toString(bList) + " is " +distance);
        }
        else System.out.println("Unequal Lengths of arrays ");
    }
}
