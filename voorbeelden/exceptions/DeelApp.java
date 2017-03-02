class DeelApp
{
  public static void main (String args[]) 
  {
    int deler = 0;
    int uitkomst = 0;
    try
    {
       deler = Integer.parseInt(args[0]);
       uitkomst = 100 / deler; 
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
       uitkomst = 100;
    }
    catch(ArithmeticException e)
    {
     uitkomst = Integer.MAX_VALUE;
     throw e;
    }
    finally
    {
      System.out.println(uitkomst);
    }
  }
}
