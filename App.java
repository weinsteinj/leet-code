import java.util.Arrays;

public class App {
    private static RankTransform rank = new RankTransform();
    private static kthMissing kthMissing = new kthMissing();
    private static TwoPointers twoPointers = new TwoPointers();

    public static void main(String[] args) {
//        int[] arr = new int[] {4,6,1,4,9};
//        int[] result = rank.rankArray(arr);
//
//        int[] ascendingArray = new int[] {2,3,4,7,11};
//        int[] ascendingArrayTwo = new int[] {1,3,4};
//        System.out.println(kthMissing.kthMissingPosNumber(ascendingArrayTwo, 2));
//
//        System.out.println(kthMissing.kthMissingBinarySearch(ascendingArrayTwo, 2));
        int[] arrWithZeroes = new int[] {0,1,0,3,12};
        String result = Arrays.toString(twoPointers.moveZeroes(arrWithZeroes));
        System.out.println(result);

        DataStructuresScratch data = new DataStructuresScratch();
        data.dataStructures();
    }
}
