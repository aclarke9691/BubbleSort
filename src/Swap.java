public class Swap {

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
}
