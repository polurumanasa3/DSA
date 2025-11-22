class Targetarray
{
    public static void main(String args[])
    {
        int target=10;
        int[] arr={3,5,6,8,7,4,3,6,2};
        System.out.println(target(arr,target));
    }
    
    public static int target(int[] arr,int tr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==tr)
                {
                    return arr[i]+arr[j];
                }
            }
        }
        return 0;
    }
}    
