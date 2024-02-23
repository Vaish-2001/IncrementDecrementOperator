class Incrementoperator
{
  
   public static void main(String[]args)
    {
      int a=20;
      int result1=a + 10 + a++ + 20 + a;   //increment operator
      int result2=a + 10 + --a + 20 + a;   //decrement operator

      System.out.println(result1);
      System.out.println(result2);
    }
}