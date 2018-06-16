package Geekbrains.lesson_7.homework;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window extends JFrame{
    private JButton button = new JButton("Гадание");
    private JTextField input = new JTextField("",5);
    private JLabel lebel = new JLabel("Что вам нравится ?");
    private JRadioButton radio1 = new JRadioButton("Мороженое");
    private JRadioButton radio2 = new JRadioButton("Пироженки");
    private JCheckBox check = new JCheckBox("Котики", false);

    public Window(){
        super("Познай себя");
        this.setBounds(100,100,300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(lebel);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
        class ButtonEventListener implements ActionListener {


            @Override
            public void actionPerformed(ActionEvent e) {
            String message="";
            message +="Я вижу\n";
            message += "Вы любите "+ input.getText()+"\n";
            message += (radio1.isSelected() ? "Мороженое":"Пироженки")+" Не сомневайтесь.\n";
            message += "Котиков " + ((check.isSelected()) ? " Вы честны. " : " Любите но не признаётесь.");
            JOptionPane.showMessageDialog(null,message,"Вывод",JOptionPane.PLAIN_MESSAGE);
            }
        }








    }



