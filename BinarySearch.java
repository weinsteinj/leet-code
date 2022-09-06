public class BinarySearch {

        public int search(int[] nums, int target) {
            int leftBound = 0;
            int rightBound = nums.length - 1;

            while (rightBound - leftBound >=0)  {
                if (nums.length == 0) {
                    if (nums[0] == target) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    int middle = leftBound + ((rightBound - leftBound)/2);
                    if (nums[middle] == target) {
                        return middle;
                    } else if (nums[middle] < target) {
                        leftBound = middle + 1;
                    } else {
                        rightBound = middle - 1;
                    }
                }
            }
            return -1;
        }

    public int firstBadVersion(int n) {
            // lowest bad && lowest n == 1 --> solve this case first:
            if (n == 1) {
                return 1;
            }

            int leftBound = 0;
            int rightBound = n;

            int bad = -1;

            while (rightBound >= leftBound) {
                int middle = leftBound + ((rightBound - leftBound) / 2);
                if (isBadVersion(middle) == false) {
                    leftBound = middle + 1;
                } else {
                    // ie. if isBadVersion(middle) evals true -->
                    rightBound = middle - 1;
                    bad = middle;
                }
            }
            return bad;

        }
    // below is a mock method to avoid build errors in firstBadVersion above... from LeetCode #278 (code for this boolean method is not disclosed there
    public boolean isBadVersion (int n) {
            return false;
    }

    public int searchInsert(int[] nums, int target) {
        int targetIndex = -1;
        if (nums.length == 1 && nums[0] < target) {
            // can't have neg index, but if target is greater than nums[0], and length of nums == 1, target must be at first position in the array i.e. index 0;
            return 1;
        } else if (nums.length == 1 && nums[0] >= target){
            return 0;
        }

        int leftBound = 0;
        int rightBound = nums.length - 1;

        while (rightBound - leftBound >= 0) {
            int middle = leftBound + ((rightBound - leftBound) / 2);

            if (nums[middle] == target) {
                targetIndex = middle;
                return targetIndex;
            } else if (nums[middle] < target) {
                leftBound = middle + 1;
                targetIndex = middle + 1;
            } else {
                // for case if nums[middle] > target
                rightBound = middle - 1;
            // code below accounts for edge cases with small array length and target not exactly matching an array element
                if (middle >= 1 && target <= nums[middle - 1]) {
                    targetIndex = middle - 1;
                } else if (middle >= 1 && target > nums[middle - 1]) {
                    targetIndex = middle;
                }
                else {
                    targetIndex = 0;
                }
            }
        }
        return targetIndex;
    }

}
