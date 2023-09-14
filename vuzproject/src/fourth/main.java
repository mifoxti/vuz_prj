package fourth;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BoderLayoutDemo extends JFrame {
    private int milScore = 0;
    private int rmScore = 0;
    JPanel[] pa = new JPanel[6];
    public BoderLayoutDemo()
    {
        setLayout(new GridLayout(2,3));
        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");
        JLabel scoreInfo = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        JLabel lastScore = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        Label winInfo = new Label("Winner: DRAW");

        for (int i = 0; i < 6; i++) {
            pa[i] = new JPanel();
            add(pa[i]);
        }

        pa[0].add(lastScore);
        pa[1].add(scoreInfo);
        pa[2].add(winInfo);
        pa[3].add(but1);
        pa[5].add(but2);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milScore++;
                lastScore.setText("Last Scorer: " + but1.getText());
                scoreInfo.setText("Result: " + milScore + " X " + rmScore);
                if (milScore > rmScore){
                    winInfo.setText("Winner: " + but1.getText());
                } else if (milScore < rmScore) {
                    winInfo.setText("Winner: " + but2.getText());
                }
                else {
                    winInfo.setText("Winner: DRAW");
                }
            }
        });

        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rmScore++;
                lastScore.setText("Last Scorer: " + but2.getText());
                scoreInfo.setText("Result: " + milScore + " X " + rmScore);
                if (milScore > rmScore){
                    winInfo.setText("Winner: " + but1.getText());
                } else if (milScore < rmScore) {
                    winInfo.setText("Winner: " + but2.getText());
                }
                else {
                    winInfo.setText("Winner: DRAW");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setVisible(true);



    }

}

class MainFrame {

    // Driver code
    public static void main(String[] args)
    {

        new BoderLayoutDemo();

    }
}