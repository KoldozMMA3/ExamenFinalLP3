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
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

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
        
        JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Analizador Lexico C++");
        lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 39));
        lblNewJgoodiesLabel.setForeground(Color.RED);
        
        JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Por: ccarrizalesl@ulasalle.edu.pe");
        lblNewJgoodiesLabel_1.setBackground(SystemColor.activeCaptionBorder);
        lblNewJgoodiesLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        
        JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("https://github.com/KoldozMMA3");
        lblNewJgoodiesLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
        
        JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Codigo a Evaluar");
        lblNewJgoodiesTitle.setForeground(SystemColor.textHighlight);
        lblNewJgoodiesTitle.setBackground(SystemColor.activeCaption);
        lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
        
        JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Lexico Utilizado");
        lblNewJgoodiesTitle_1.setForeground(SystemColor.textHighlight);
        lblNewJgoodiesTitle_1.setBackground(SystemColor.textHighlight);
        lblNewJgoodiesTitle_1.setFont(new Font("Tahoma", Font.BOLD, 24));

        GroupLayout groupLayout = new GroupLayout(frmProgramaDeAnalizador.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(20)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
        										.addGroup(groupLayout.createSequentialGroup()
        											.addGap(72)
        											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        											.addPreferredGap(ComponentPlacement.RELATED)
        											.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))))
        								.addComponent(lblNewJgoodiesLabel_2, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblNewJgoodiesLabel_1))
        							.addPreferredGap(ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(60)
        							.addComponent(lblNewJgoodiesTitle)
        							.addPreferredGap(ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
        							.addComponent(lblNewJgoodiesTitle_1)
        							.addGap(81))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(125)
        					.addComponent(lblNewJgoodiesLabel, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(26, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(lblNewJgoodiesLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
        			.addGap(24)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewJgoodiesTitle)
        				.addComponent(lblNewJgoodiesTitle_1))
        			.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        					.addGap(7))
        				.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE))
        			.addGap(38)
        			.addComponent(lblNewJgoodiesLabel_1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblNewJgoodiesLabel_2)
        			.addGap(26))
        );
        consoleTextArea = new JTextArea();
        consoleTextArea.setBackground(new Color(144, 238, 144));
        scrollPane.setViewportView(consoleTextArea);
        consoleTextArea.setEditable(false);
        frmProgramaDeAnalizador.getContentPane().setLayout(groupLayout);
    }
}