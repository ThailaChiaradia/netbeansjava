package aula01;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExemploCardLayout {
    private JFrame mainFrame;   // variavel para a janela
    private JLabel headerLabel; // variavel texto do cabeçalho
    private JLabel statusLabel; // variavel texto de status
    private JPanel controlPanel;// variavel controle do painel
    private JLabel msglabel;    // variavel mensagem do texto
 
    public ExemploCardLayout()
    {
        prepareGUI();
    }
    
    public static void main(String[] args)
    {
        ExemploCardLayout swingLayoutDemo = new ExemploCardLayout();
        swingLayoutDemo.showCardLayoutDemo();
    }
    
    private void prepareGUI()
    {
        mainFrame = new JFrame("Exemplo Card Layout");  // definiu janela
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));

        headerLabel = new JLabel("",JLabel.CENTER );    // definiu o texto de cabeçalho

        statusLabel = new JLabel("",JLabel.CENTER);     // definiu o texto de status
        statusLabel.setSize(350,100);
        
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }    
        }
        );

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    
    private void showCardLayoutDemo()
    {
        headerLabel.setText("Exemplo de Card Layout");  // definiu o texto do cabeçalho
        final JPanel panel = new JPanel();  // aqui define que não pode ser modificado por outras variáveis
        panel.setBackground(Color.RED);  // aqui definiu que a cor do retangulo 
        panel.setSize(300,300);

        CardLayout layout = new CardLayout();
        layout.setHgap(10); // aqui define a largura das laterais do retangulo
        layout.setVgap(10); // aqui define a largura da parte de cima e de baixo do retangulo
        
        panel.setLayout(layout);
        JPanel buttonPanel = new JPanel(new FlowLayout()); // criou objeto do botão
        buttonPanel.add(new JButton("OK")); // criou o botão OK
        buttonPanel.add(new JButton("Cancelar")); // criou o botão CANCELAR
        
        JPanel textBoxPanel = new JPanel(new FlowLayout()); // criou objeto para caixa de texto
        textBoxPanel.add(new JLabel("Nome:")); // criou a caixa de texto para botar o nome
        textBoxPanel.add(new JTextField(20));  // definiu quantos caracteres o usuario pode colocar
        
        panel.add("Botão", buttonPanel);
        panel.add("Texto", textBoxPanel);
        final DefaultComboBoxModel panelName = new
        DefaultComboBoxModel();
        panelName.addElement("Botão");
        panelName.addElement("Texto");
        final JComboBox listCombo = new JComboBox(panelName);
        listCombo.setSelectedIndex(0);
        JScrollPane listComboScrollPane = new
        JScrollPane(listCombo);
        JButton showButton = new JButton("Mostrar");
        showButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String data = "";

                if (listCombo.getSelectedIndex() != -1) 
                {
                    CardLayout cardLayout =
                    (CardLayout)(panel.getLayout());
                    cardLayout.show(panel,
                    (String)listCombo.getItemAt(listCombo.getSelectedIndex()));
                }

                statusLabel.setText(data);
            }
        });
        
        controlPanel.add(listComboScrollPane);
        controlPanel.add(showButton);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
}