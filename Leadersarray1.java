class Leadersarray1{
    public static void main(String args[])
    {
        int[] arr={19,10,12,6,4,3,9,4,5,3};
        int max=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                System.out.print(max+" ");
            }
        }
    }
}