import java.util.Arrays;

public class ArrayProblems {
    public static int hammingDistance(int[] aList, int[] bList){
        int distance=0;
        int maxLen=Math.max(aList.length,bList.length);
        int extraNumbers = maxLen-Math.min(aList.length,bList.length);
        for(int i=0;i<Math.min(aList.length,bList.length);i++){
            if(aList[i]!=bList[i]){
                distance++;
            }
        }
        return distance + extraNumbers;
    }
    public static void main(String [] argv){
        int [] aList = {1, 2, 0 ,4, 5, 4, 3, 9, 1};
        int [] bList = {1, 2, 8, 4, 5, 4, 3, 5, 1};
        System.out.println("Hamming distance between array" +
                Arrays.toString(aList)+" and array"+Arrays.toString(bList)+" is "+
                ArrayProblems.hammingDistance(aList,bList));
    }
}
