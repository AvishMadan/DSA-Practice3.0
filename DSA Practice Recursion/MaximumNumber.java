public class MaximumNumber
{
static int arr[]={1,3,-1,-6,0};
public static  int maxi(int arr[],int index,int max)
{
    if(index ==arr.length)
    {
        return max; 
    }
if(max <arr[index])
{
    max=arr[index];
}

int data=maxi(arr,index+1,max);
return data;
}
public static void main(String[] args) {
    System.out.print(maxi(arr, 0, 0));
   
}

}