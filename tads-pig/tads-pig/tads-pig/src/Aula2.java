import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aula2 {
	public static void main(String[] args) {
		JFrame janelaCadastrar = new JFrame("Cadastrar Aluno");
		//sai da aplicação quando o usuário fecha a janela
		janelaCadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel rotuloNome = new JLabel("Nome");
		JLabel rotuloEndereco = new JLabel("Endereço");
		JLabel rotuloTelefone = new JLabel("Telefone");
		
		JTextField campoNome = new JTextField(30);
		JTextField campoEndereco = new JTextField(30);
		JTextField campoTelefone = new JTextField(10);
		
		JButton botaoSalvar = new JButton("Salvar");
		JButton botaoCancelar = new JButton("Cancelar");
		
		JPanel painel = new JPanel();
		painel.setLayout(null);
		
		rotuloNome.setBounds(30, 30, 50, 15);
		campoNome.setBounds(30, 50, 300, 20);
		painel.add(campoNome);
		painel.add(rotuloNome);
		
		rotuloEndereco.setBounds(30, 80, 90, 20);
		campoEndereco.setBounds(30, 100, 300, 20);
		painel.add(campoEndereco);
		painel.add(rotuloEndereco);
		
		rotuloTelefone.setBounds(30, 130, 90, 15);
		campoTelefone.setBounds(30, 150, 300, 20);
		painel.add(campoTelefone);
		painel.add(rotuloTelefone);
		
		botaoSalvar.setBounds(100, 190, 70, 30);
		painel.add(botaoSalvar);
		
		botaoCancelar.setBounds(180, 190, 85, 30);
		painel.add(botaoCancelar);
			
		janelaCadastrar.setBounds(50, 100, 400, 500);
		
		janelaCadastrar.add(painel);
		janelaCadastrar.setLocationRelativeTo(null);
		
		botaoSalvar.addActionListener((ActionEvent e) -> {
				JOptionPane.showMessageDialog(null, "Nome: " + campoNome.getText());
				JOptionPane.showMessageDialog(null, "Endereço: " + campoEndereco.getText());
				JOptionPane.showMessageDialog(null, "Telefone: " + campoTelefone.getText());
			});
		
		botaoCancelar.addActionListener((ActionEvent e) ->{
			campoNome.setText("");
			campoEndereco.setText("");
			campoTelefone.setText("");
		});
		/*JPanel painelCampos = new JPanel();
		 JPanel painelBotoes = new JPanel();
		
		//boxlayout é um layout manager que permite que vários componentes sejam dispostos verticalmente
		// ou horizontalmente
		//constante define que os componentes serão dispostos verticalmente de cima para baixo
		//BoxLayout layout = new BoxLayout(painelCampos, BoxLayout.Y_AXIS);
		//painelCampos.setLayout(layout);
		
		//painelCampos.add(rotuloNome);
		//painelCampos.add(campoNome);
		
		//painelCampos.add(rotuloEndereco);
		//painelCampos.add(campoEndereco);
		
		//painelCampos.add(rotuloTelefone);
		//painelCampos.add(campoTelefone);
		
		//painelBotoes.add(botaoSalvar);
		//painelBotoes.add(botaoCancelar);
		
		//janelaCadastrar.add(painelCampos, BorderLayout.NORTH);
		//janelaCadastrar.add(painelBotoes, BorderLayout.SOUTH);
		//janelaCadastrar.pack();*/
		
		janelaCadastrar.setVisible(true);
	}
}
