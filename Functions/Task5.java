class Task5
{
    void printArmstrong(int n)
    {
        int temp = n;
        int sum = 0, digit;

        while(n > 0)
        {
            digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        if(sum == temp)
            System.out.println(temp + " is an Armstrong Number");
        else
            System.out.println(temp + " is not an Armstrong Number");
    }

    public static void main(String args[])
    {
        Armstrong obj = new Armstrong();
        obj.printArmstrong(153);
    }
}