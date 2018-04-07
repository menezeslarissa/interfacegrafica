import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class Ouvinte implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date momento = new Date(e.getWhen());
		System.out.println("Ação no botão salvar: " + momento);
		
	}
	
}
