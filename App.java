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
        BinarySearch bsearch = new BinarySearch();
        int[] arr = new int[]{5,8,77,88,105,222};
        System.out.println(bsearch.searchInsert(arr, 79));

        int[][] twoDimensionalArray = new int[][]{{2,2,4},{4,2,5},{8,5,7},{1,1,2},{4,5,8},{8,7,8},{9,9,8}};
        System.out.println(Arrays.toString(twoDimensionalArray[1]));


    }
}
