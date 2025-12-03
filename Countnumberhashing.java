import java.util.*;
class Countnumberhashing
{
    public static void main(String args[])
    {
        int num=112256;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(num!=0)
        {
            int digit=num%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            num/=10;
        }
        System.out.println(map);
    }
}