import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFrame extends JFrame {
    private JLabel jLabelID = new JLabel("ID:");
    private JLabel jLabelPW = new JLabel("Password:");
    private JTextField jtfID = new JTextField();
    // private JTextField jtfPW = new JTextField();
    private JPasswordField jtfPW = new JPasswordField();
    private JButton jbtnExit = new JButton("Exit");
    private JButton jbtnLogin = new JButton("Login");
    private Container cp;
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int frmW = 300, frmH = 150, screenW, screenH;



    public LoginFrame(){
        initComp();
    }
    private void initComp(){
        screenW = dim.width;
        screenH = dim.height;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(screenW/2-frmW/2,screenH/2-frmH/2,frmW,frmH);
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3,2,3,3));


        jLabelID.setHorizontalAlignment(JLabel.RIGHT);
        jLabelPW.setHorizontalAlignment(JLabel.RIGHT);

        jbtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtfID.getText().equals("h123") &&
                        (new String(jtfPW.getPassword())).equals("9487")) {
                    LoginFrame mainFrame = new LoginFrame();
                    mainFrame.setVisible(true);
                } else {
                    System.out.println("NO" + jtfID.getText() + " \tpw");
                }
            }
        });

        cp.add(jLabelID);
        cp.add(jtfID);
        cp.add(jLabelPW);

        cp.add(jtfPW);
        cp.add(jbtnLogin);
        cp.add(jbtnExit);

    }}