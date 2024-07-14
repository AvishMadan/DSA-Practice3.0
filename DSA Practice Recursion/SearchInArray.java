public class SearchInArray
{
static int  arr[]={1,5,6,2,3};
static int target=4;

public static boolean   search(int arr[],int tar,int index)
{
    if(index==arr.length)
    {
        return false;
    }
    if(arr[index]==tar)
    {
        return true;
    }

boolean a=search(arr,tar,index+1);
return a;
}

public static void main(String[] args) {

   
   System.out.println( "data"+ search(arr,target,0));
}




}