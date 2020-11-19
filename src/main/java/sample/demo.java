package sample;

public class demo {
    public static void main(String[] args)
    {
//        int[] nums = {1,2,3,4,4,3,2,1};
//        Integer listN = 4;
//        int[] result = shuffle(nums,listN);
//
//        System.out.println("result = " + result);

        int[] arr = {5,4,2,7,1,2,3};
        int resultNum = getWinner(arr,2);
        System.out.println("result num = " + resultNum);

    }


    public static int[] shuffle(int[] nums, int n) {

        int[] sum = new int[nums.length];

        for (int i = 0 ; i < nums.length; i++) {

            if(i%2 == 0) {
                sum[i] = nums[i / 2];
            } else {
                sum[i] = nums[(i / 2) +n];
            }

        }
        return sum;
    }

//    Input: arr = [2,1,3,5,4,6,7], k = 2
//    Output: 5
//    Round |       arr       | winner | win_count
//      1   | [2,1,3,5,4,6,7] | 2      | 1
//      2   | [2,3,5,4,6,7,1] | 3      | 1
//      3   | [3,5,4,6,7,1,2] | 5      | 1
//      4   | [5,4,6,7,1,2,3] | 5      | 2

    public static int getWinner(int[] arr, int k) {
        int winnerCount= 0;
        int winnerValue = 0;
        int[] newArr = new int[arr.length];
        while(winnerCount < k ) {

            if(newArr[0] > newArr[1]) {
                winnerCount++;
                newArr[0] = arr[1];
                for(int i =1; i< arr.length -2; i++) {
                    newArr[i] = arr[i+1];
                }
                newArr[arr.length-1] = arr[1];
            } else {
//                winnerCount =0;
            }


        }
        System.out.println("total count = " + winnerCount);
        return newArr[0];
    }
}
