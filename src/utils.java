public class utils {

    public static void swap(int[]arr,int i,int j)
    {
        int temp= arr[j];
        arr[j]=arr[i];
        arr[i]= temp;

    }

    public static void bubbleSort(int[] arr)
    {
        boolean swapcount=true;
        while(swapcount)
        {
            swapcount=false;
            for(int i=0; i< arr.length-1; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    swap(arr,i,i+1);
                    swapcount=true;
                }
            }

        }
    }

    public static boolean isSorted(int [] arr)
    {
        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                    return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[]before, int[]after)
    {
        int a=0;
        int b=0;
        if(before.length!=after.length)
        {
            return false;
        }
        else
        {
            for(int i=0; i<before.length; i++)
            {
                a=a+ before[i];
                b=b+ after[i];
            }
            if(a!=b)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }

}
