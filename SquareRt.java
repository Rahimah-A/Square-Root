import java.text.DecimalFormat;

public class SquareRt
{
  public static void main(String[] args)
  {
    double square = 250.0;
    double rootGuess = squareRoot(square);
    System.out.println("The guess for the square root of "+ square + " is " + rootGuess);
  }
    
  public static double squareRoot(double x)
  {
    double g = (double)x/4.0;
    System.out.println(g);
    if ( g*g == x)
    {
      
      return g;
    }
    else if(x<0)
    {
   
      return 0.0;
    }
    else 
    {
      
      return squareRootGuess(x,g);
    }
  }
  public static double squareRootGuess(double x,double g)
  {
    if(Math.abs(x-(g*g))>0.005)
    {    
      g=(g+(x/g)*1.0)/2.0;
      return squareRootGuess(x,g);
    }
    else 
    {
     double temp = g;
     DecimalFormat df = new DecimalFormat("0.00");
     g = Double.valueOf(df.format(temp));
     
     return g;
    }
    
  }
}
          
    