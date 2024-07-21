public class LastOccurence
{
public static int last(char arr[],char target,int index)
{
    int ans=-1;
   
if(index==0)
{
    return ans;
}
if(arr[index]==target)
{
    ans=index;
    return ans;
}
ans=last(arr,target,index-1);
return ans;
}



public static void main(String[] args) {
char arr[]={'a','b','c','d','d','a','d','e'};
char target='d';
   last(arr,target,arr.length-1);
   System.out.println(last(arr,target,arr.length-1));
}
    
}