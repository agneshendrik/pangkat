package pangkat;
import javax.swing.JOptionPane;
public class Pangkat {
    public static void main(String[] args) {
    int k=1;
    String l="";
    String m="";
    
    l=JOptionPane.showInputDialog("Silahkan masukkan angka disini ");
    int angka = Integer.valueOf(l).intValue();
		
    m=JOptionPane.showInputDialog("Silahkan masukkan pangkat disni ");
    int pangkat = Integer.valueOf(m).intValue();
		
    int n=1;

    while (n<=pangkat){
    n++;
    k=k*angka;
		}
    String hasil= angka + "^" + pangkat + "=" + k;
    JOptionPane.showMessageDialog(null, hasil);

    }
}