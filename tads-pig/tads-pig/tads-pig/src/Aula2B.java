import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aula2B {
	public class Ouvinte2 implements ActionListener {
		final String nomeNaClasseExterna = "ouvinte na classe externa";

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(nomeNaClasseExterna);
		}
	}
	
	public static void main(String[] args) {
		JFrame janela = new JFrame("teste");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton botao = new JButton("Salvar");
		Ouvinte ouvinte = new Ouvinte();
		
		botao.addActionListener((ActionEvent e) -> {;
			System.out.println("na classe interna é anonima");
		});
		
		JPanel painel = new JPanel();
		painel.add(botao);
		janela.add(painel);
		
		janela.pack();
		
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		
	}
}
