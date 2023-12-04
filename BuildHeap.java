public class BuildHeap
{
    static void heapify(int arr[],int N, int i)
    {
        int largest=i;                      //lagest as root
        int left=2*i+1;                     //left child
        int right=2*i+2;                   //right child

        if(left < N && arr[left] > arr[largest])
        largest=left;

        if(right < N &&arr[right]>arr[largest])
        largest=right;

        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,N, largest);
        }
    }


static void buildHeap(int arr[],int N)
{
    int startIndex=(N/2)-1;
    for(int i=startIndex;i>=0;i--)
    {
        heapify(arr,N,i);
    }
}
static void printHeap(int arr[],int N)
{
    System.out.println("Array representaion ::");
    for(int i=0;i<N;i++)
    System.out.println(arr[i]+" ");

    System.out.println();
}
public static void main(String args[])
{
    int arr[]={100,25,50,75,60,23,20,15};
    int N = arr.length;

    buildHeap(arr, N);
    printHeap(arr, N);
}
}