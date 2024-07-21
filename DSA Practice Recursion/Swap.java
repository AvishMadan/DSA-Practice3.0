



public class Swap
{
public static String sw(int s,int e,String str)
{
char str1[]=str.toCharArray();
if(s>=e)
{
return new String(str1);

}


char temp= str1[s];    
    str1[s]=str1[e];
    str1[e]=temp;



return sw( ++s, --e, new String(str1)); 


}
public static void main(String[] args) {

   String s="abcdef";
   System.out.println(sw( 0,s.length()-1, s));
}



}