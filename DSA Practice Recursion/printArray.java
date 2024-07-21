public class printArray

{
static int  arr[]={1,5,6,2,3};


public static void   search(int arr[],int index)
{
    //base case
    if(index==arr.length)
    {
        return ;
    }
  
System.out.print(arr[index]); // 1 case hum solve karege

//recursion 
search(arr,index+1);  //recursive call

}

public static void main(String[] args) {

   System.out.print("data");
    search(arr,0);
}




}