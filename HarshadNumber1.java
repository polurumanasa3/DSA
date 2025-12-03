class HarshadNumber1{
    public static void main(String args[])
    {
        int num=6;
        int sum=0;
        for(int i=1;i<=num/2; i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(num==sum)
        {
            System.out.println("Harshadnumber");
        }
        else{
            System.out.println("not Harshadnumber");
        }
        }
            }
        
    
