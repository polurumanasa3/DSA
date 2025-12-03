import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Twosum{
    public static void main(String args[])
    {
        int[] arr1={1,9,7,6,5,3};
        int[] arr2={8,5,3,2,0,0};
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1)
        {
            set.add(i);
        }
        for(int j:arr2)
        {
          if(set.contains(j))
          {
            System.out.println(j+" ");
          }
        }
        }
    }
