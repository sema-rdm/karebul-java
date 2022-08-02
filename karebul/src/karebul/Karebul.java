
package karebul;

import javax.swing.JOptionPane;

public class Karebul {

    public static void main(String[] args) {
      String sayi = JOptionPane.showInputDialog("bir sayı giriniz");
      int s = Integer.parseInt(sayi);
      metotlar met = new metotlar();
      double kare = met.kare(s);
        JOptionPane.showMessageDialog(null, s + "sayısının karesi :" + kare);
    }
    
}
