import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// ---------------- EXERC�CIO 1 ------------------ //
        int x,y,troca,soma=0;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y"));
		
		if(x>y) {
			troca=x;
			x=y;
			y=troca;
		}
		
		for(int i = x+1; i<y; i++) {
			if(i%2!=0) {
				soma += i;
			}
		}
	
		JOptionPane.showMessageDialog(null, "A soma do �mpares entre eles foi de " + soma);
	}

}
