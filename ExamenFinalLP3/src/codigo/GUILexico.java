package codigo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;

public class GUILexico {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILexico window = new GUILexico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUILexico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane txtpnCodigoAEvaluar = new JTextPane();
		txtpnCodigoAEvaluar.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		txtpnCodigoAEvaluar.setText("Codigo a Evaluar");
		
		JButton btnNewButton = new JButton("Analizar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JTextPane txtpnLexicoUtilizado = new JTextPane();
		txtpnLexicoUtilizado.setText("Lexico Utilizado");
		txtpnLexicoUtilizado.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JTextPane txtpnPor = new JTextPane();
		txtpnPor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPor.setText("Por: Cristian Edward Carrizales Luna");
		
		JTextPane txtpnGitHubHttpsgithubcomkoldozmma = new JTextPane();
		txtpnGitHubHttpsgithubcomkoldozmma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnGitHubHttpsgithubcomkoldozmma.setText("Git hub: https://github.com/KoldozMMA3");
		
		JTextPane txtpnAnalizadorLexicoC = new JTextPane();
		txtpnAnalizadorLexicoC.setForeground(Color.RED);
		txtpnAnalizadorLexicoC.setBackground(SystemColor.info);
		txtpnAnalizadorLexicoC.setText("Analizador Lexico C++");
		txtpnAnalizadorLexicoC.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		
		JTextArea textArea = new JTextArea();
		
		JTextArea textArea_1 = new JTextArea();
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(67)
									.addComponent(txtpnCodigoAEvaluar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE))
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtpnLexicoUtilizado, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(txtpnPor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(txtpnGitHubHttpsgithubcomkoldozmma, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(217)
							.addComponent(txtpnAnalizadorLexicoC, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnAnalizadorLexicoC, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtpnCodigoAEvaluar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addComponent(txtpnLexicoUtilizado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(txtpnPor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(txtpnGitHubHttpsgithubcomkoldozmma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
