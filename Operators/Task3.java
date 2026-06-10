class Task3
{
 public static void main(String args[])
 {
 int num=1234;
 System.out.println("Given Number :"+num);
 int a=num/1000*1000;
 System.out.println("Thousands :"+a);
 int b=(num/100%10)*100;
 System.out.println("Hundereds :"+b);
 int c=(num/10%10)*100;
 System.out.println("Tens :"+c);
 int d=(num%10);
 System.out.println("Ones :"+d);
 }
}