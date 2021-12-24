package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela implements ActionListener {

    int count = 0;
    private JLabel label;
    private JFrame jf;
    private JPanel panel;

    public Janela() {
        jf = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("Click Me!");
        button.addActionListener(this);
        label = new JLabel("Numero de clicks: ");

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        jf.add(panel, BorderLayout.CENTER);
        jf.setTitle("Contador de clicks");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Metodo para fechar a aplicação ao apertar no X
        jf.setResizable(true);//
        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Numero de clicks: "+ count);
    }
}
