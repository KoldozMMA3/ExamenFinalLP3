package codigo;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout.Alignment;

public class GUILexico {

    private JFrame frmProgramaDeAnalizador;
    private static JTextArea textArea_1;
    private static JTextArea consoleTextArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUILexico window = new GUILexico();
                    window.frmProgramaDeAnalizador.setVisible(true);
                    textArea_1.setText("");
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GUILexico() {
        initialize();
    }

    private void initialize() {
        frmProgramaDeAnalizador = new JFrame();
        frmProgramaDeAnalizador.getContentPane().setBackground(SystemColor.info);
        frmProgramaDeAnalizador.setBackground(new Color(0, 128, 192));
        frmProgramaDeAnalizador.setTitle("Programa de Analizador Lexico");
        frmProgramaDeAnalizador.setBounds(100, 100, 747, 759);
        frmProgramaDeAnalizador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextPane txtpnCodigoAEvaluar = new JTextPane();
        txtpnCodigoAEvaluar.setBackground(new Color(192, 192, 192));
        txtpnCodigoAEvaluar.setFont(txtpnCodigoAEvaluar.getFont().deriveFont(txtpnCodigoAEvaluar.getFont().getStyle() | Font.BOLD, txtpnCodigoAEvaluar.getFont().getSize() + 13f));
        txtpnCodigoAEvaluar.setText("Codigo a Evaluar");

        JButton btnNewButton = new JButton("Analizar");
        btnNewButton.setBackground(new Color(140, 253, 154));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expresion = textArea_1.getText();
                AnalizadorLexico lexico = new AnalizadorLexico(new StringReader(expresion));

                // Redirigir la salida a JTextArea
                PrintStream oldOut = System.out;
                OutputStream out = new OutputStream() {
                    @Override
                    public void write(int b) throws IOException {
                        consoleTextArea.append(String.valueOf((char) b));
                    }
                };
                PrintStream printStream = new PrintStream(out);
                System.setOut(printStream);

                try {
                    lexico.yylex();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                // Restaurar la salida original
                System.setOut(oldOut);
            }
        });

        JTextPane txtpnLexicoUtilizado = new JTextPane();
        txtpnLexicoUtilizado.setBackground(new Color(192, 192, 192));
        txtpnLexicoUtilizado.setText("Lexico Utilizado");
        txtpnLexicoUtilizado.setFont(txtpnLexicoUtilizado.getFont().deriveFont(txtpnLexicoUtilizado.getFont().getStyle() | Font.BOLD, txtpnLexicoUtilizado.getFont().getSize() + 13f));

        JTextPane txtpnPor = new JTextPane();
        txtpnPor.setBackground(new Color(230, 230, 250));
        txtpnPor.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtpnPor.setText("Por: ccarrizalesl@ulasalle.edu.pe");

        JTextPane txtpnGitHubHttpsgithubcomkoldozmma = new JTextPane();
        txtpnGitHubHttpsgithubcomkoldozmma.setBackground(new Color(230, 230, 250));
        txtpnGitHubHttpsgithubcomkoldozmma.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtpnGitHubHttpsgithubcomkoldozmma.setText("Git hub: https://github.com/KoldozMMA3");

        JTextPane txtpnAnalizadorLexicoC = new JTextPane();
        txtpnAnalizadorLexicoC.setForeground(Color.RED);
        txtpnAnalizadorLexicoC.setBackground(SystemColor.info);
        txtpnAnalizadorLexicoC.setText("Analizador Lexico C++");
        txtpnAnalizadorLexicoC.setFont(new Font("Impact", Font.PLAIN, 49));

        textArea_1 = new JTextArea();
        textArea_1.setBackground(new Color(152, 251, 152));

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	consoleTextArea.setText("");
                textArea_1.setText("");
            }
        });
        btnLimpiar.setBackground(new Color(255, 89, 94));
        btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 17));

        JScrollPane scrollPane = new JScrollPane();

        GroupLayout groupLayout = new GroupLayout(frmProgramaDeAnalizador.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(20)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtpnGitHubHttpsgithubcomkoldozmma, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addGap(38)
        									.addComponent(txtpnCodigoAEvaluar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addComponent(txtpnPor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addGap(63)
        							.addGap(43)
        							.addComponent(txtpnLexicoUtilizado, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(140)
        					.addComponent(txtpnAnalizadorLexicoC, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(26, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(txtpnAnalizadorLexicoC, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        			.addGap(37)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(txtpnLexicoUtilizado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtpnCodigoAEvaluar, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        					.addGap(7))
        				.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(txtpnPor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtpnGitHubHttpsgithubcomkoldozmma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consoleTextArea = new JTextArea();
        consoleTextArea.setBackground(new Color(144, 238, 144));
        scrollPane.setViewportView(consoleTextArea);
        consoleTextArea.setEditable(false);
        frmProgramaDeAnalizador.getContentPane().setLayout(groupLayout);
    }
}