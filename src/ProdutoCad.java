import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ProdutoCad extends JFrame {

	private JPanel contentPane;
	private JTextField txv1;
	private JTextField txv2;
	private JTextField txresultado;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProdutoCad frame = new ProdutoCad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProdutoCad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSomar = new JButton("somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v1, v2,total;
				v1=Double.parseDouble(txv1.getText());
				v2=Double.parseDouble(txv2.getText());
				total=v1+v2;
				txresultado.setText(""+total);
			}
		});
		btnSomar.setBounds(283, 78, 105, 27);
		contentPane.add(btnSomar);
		
		txv1 = new JTextField();
		txv1.setBounds(120, 57, 114, 21);
		contentPane.add(txv1);
		txv1.setColumns(10);
		
		txv2 = new JTextField();
		txv2.setBounds(120, 104, 114, 21);
		contentPane.add(txv2);
		txv2.setColumns(10);
		
		txresultado = new JTextField();
		txresultado.setBounds(283, 181, 114, 21);
		contentPane.add(txresultado);
		txresultado.setColumns(10);
		
		lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setBounds(42, 59, 60, 17);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Valor 2");
		lblNewLabel_1.setBounds(42, 106, 60, 17);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(307, 149, 60, 17);
		contentPane.add(lblNewLabel_2);
	}
}
