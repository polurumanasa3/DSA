class b
{
    public static void main(String args[])
    {
        int target=10;
        int[] arr={1,2,3,4,5,6,7,8,9};
       target(arr,target);
    }
    
    public static int target(int[] arr,int tr)
    {
        boolean status=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==tr)
                {
                  status=true;
                  System.out.println(arr[i]+"+"+arr[j]+"="+tr);
                }
            }
        }
        if(!status)
        {
            System.out.println("target not found!");
        }
        return 0;
      
    }
}    