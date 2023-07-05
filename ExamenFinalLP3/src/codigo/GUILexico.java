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
import java.io.IOException;
import java.io.StringReader;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Window.Type;

public class GUILexico {

	private JFrame frmProgramaDeAnalizador;
	private JTextArea textArea_1;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILexico window = new GUILexico();
					window.frmProgramaDeAnalizador.setVisible(true);
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
		frmProgramaDeAnalizador = new JFrame();
		frmProgramaDeAnalizador.setBackground(new Color(0, 128, 192));
		frmProgramaDeAnalizador.setTitle("Programa de Analizador Lexico");
		frmProgramaDeAnalizador.setBounds(100, 100, 750, 620);
		frmProgramaDeAnalizador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane txtpnCodigoAEvaluar = new JTextPane();
		txtpnCodigoAEvaluar.setFont(txtpnCodigoAEvaluar.getFont().deriveFont(txtpnCodigoAEvaluar.getFont().getStyle() | Font.BOLD, txtpnCodigoAEvaluar.getFont().getSize() + 13f));
		txtpnCodigoAEvaluar.setText("Codigo a Evaluar");
		
		JButton btnNewButton = new JButton("Analizar");
		btnNewButton.setBackground(new Color(140, 253, 154));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String expresion = textArea_1.getText();
				AnalizadorLexico lexico = new AnalizadorLexico(new StringReader(expresion));
				//mete el texto y lo analiza
				try {
					lexico.yylex();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		
		JTextPane txtpnLexicoUtilizado = new JTextPane();
		txtpnLexicoUtilizado.setText("Lexico Utilizado");
		txtpnLexicoUtilizado.setFont(txtpnLexicoUtilizado.getFont().deriveFont(txtpnLexicoUtilizado.getFont().getStyle() | Font.BOLD, txtpnLexicoUtilizado.getFont().getSize() + 13f));
		
		JTextPane txtpnPor = new JTextPane();
		txtpnPor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPor.setText("Por: ccarrizalesl@ulasalle.edu.pe");
		
		JTextPane txtpnGitHubHttpsgithubcomkoldozmma = new JTextPane();
		txtpnGitHubHttpsgithubcomkoldozmma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnGitHubHttpsgithubcomkoldozmma.setText("Git hub: https://github.com/KoldozMMA3");
		
		JTextPane txtpnAnalizadorLexicoC = new JTextPane();
		txtpnAnalizadorLexicoC.setForeground(Color.RED);
		txtpnAnalizadorLexicoC.setBackground(SystemColor.info);
		txtpnAnalizadorLexicoC.setText("Analizador Lexico C++");
		txtpnAnalizadorLexicoC.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		
		textArea = new JTextArea();
		
		textArea_1 = new JTextArea();
		
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("");
			}
		});
		btnLimpiar.setBackground(new Color(255, 89, 94));
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GroupLayout groupLayout = new GroupLayout(frmProgramaDeAnalizador.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnGitHubHttpsgithubcomkoldozmma, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(197)
							.addComponent(txtpnAnalizadorLexicoC, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnPor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(46)
									.addComponent(txtpnCodigoAEvaluar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(32)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(10)
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
											.addGap(29)
											.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(91)
									.addComponent(txtpnLexicoUtilizado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnAnalizadorLexicoC, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtpnCodigoAEvaluar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textArea_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtpnLexicoUtilizado, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(txtpnPor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnGitHubHttpsgithubcomkoldozmma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		frmProgramaDeAnalizador.getContentPane().setLayout(groupLayout);
	}
}
