import java.text.NumberFormat;

public class Mortgage {

 public void Calc(){
NumberFormat currency = NumberFormat.getCurrencyInstance();


  double P = 100000;
  double r = 3.92;
  r= (r/100)/12;
  double n = 30 ;
  n= n*12;
  double M;



  //M = P((r(1+r)^n)/((1+r)^n - 1));



// Below calc is for converting : ri = (1+r)^n

double a = 1+r;
double ri =(Math.pow(a,n));


M =  (P*(r*ri)/(ri - 1));

  System.out.println("Mortgage is " + currency.format(M));

 }

 public static void main(String[] args) {
  Mortgage mortgage = new Mortgage();
  mortgage.Calc();
 }


}