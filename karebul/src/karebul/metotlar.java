
package karebul;
public class metotlar {
   public double kare(double sayi)
   {
       double karesi = sayi*sayi;
       return karesi;
   }
   public double kare(String sayi)
   {
      double s = Double.parseDouble(sayi);
      double karesi = s*s;
      return karesi;
   }
}
