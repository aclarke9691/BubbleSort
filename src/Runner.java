public class Runner {

    public static void main(String[] args)
    {
        int[] testArr= {8,6,7,5,3,0,9,10,1,2,3};
        int[] before=testArr;
        System.out.print("Before: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();
        utils.bubbleSort(testArr);
        System.out.print("After: ");
        for (int num:testArr)
            System.out.print(num+ " ");
        System.out.println();
        System.out.println("Is the list sorted? " +utils.isSorted(testArr));
        System.out.println("Are the sums the same? " +utils.checkSum(before, testArr));

        long time= System.nanoTime();
        utils.bubbleSort(testArr);
        time= System.nanoTime()-time;
        System.out.println("Time Taken: " + time);

    }
}
