import javafx.scene.control.Labeled;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPersonalitate extends JFrame implements ActionListener {

    JLabel label;
    JRadioButton radioButton[]=new JRadioButton[6];
    JButton buttonNext, buttonResult, buttonReset, buttonExit;
    ButtonGroup bg;

    int current=0;
    int f[]=new int[6];

    TestPersonalitate(String s){
        super(s);
        label=new JLabel();
        add(label);

        bg= new ButtonGroup();

        for(int i=0; i<6; i++){
            radioButton[i]= new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }

        buttonNext=new JButton("NEXT");
        buttonResult= new JButton("REZULTAT");

        buttonReset=new JButton("RESET");
        buttonExit= new JButton("EXIT");

        buttonResult.setVisible(false);
        buttonReset.setVisible(false);
        buttonExit.setVisible(false);

        buttonResult.addActionListener(this);
        buttonNext.addActionListener(this);
        buttonReset.addActionListener(this);
        buttonExit.addActionListener(this);

        add(buttonNext);
        add(buttonResult);
        add(buttonReset);
        add(buttonExit);

        setData();
        label.setBounds(30, 40, 450, 20);

        radioButton[0].setBounds(50, 80, 450, 20);
        radioButton[1].setBounds(50, 110, 450, 20);
        radioButton[2].setBounds(50, 140, 450, 20);
        radioButton[3].setBounds(50, 170, 450, 20);
        radioButton[4].setBounds(50, 200, 450, 20);

        buttonNext.setBounds(270, 240, 100, 30);
        buttonResult.setBounds(300, 240, 100, 30);
        buttonReset.setBounds(60, 240, 100, 30);
        buttonExit.setBounds(400, 240, 100, 30);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 400);

    }
    void setData(){

        radioButton[5].setSelected(true);

        if(current==0){

            label.setText(" Q1: Cum preferi sa iti petreci timpul liber? ");

            radioButton[0].setText("Sa petrec timpul cu prietenii si familia");
            radioButton[1].setText("Sa scriu sau sa citesc");
            radioButton[2].setText("Sa ma relaxez");
            radioButton[3].setText("Nu am timp liber");
            radioButton[4].setText("Sa ma uit la TV");
        }

        if(current==1){

            label.setText(" Q2: Daca cineva ma deranjeaza: ");

            radioButton[0].setText("Ii las in pace");
            radioButton[1].setText("Ii ignor");
            radioButton[2].setText("Ii amenint");
            radioButton[3].setText("Le doresc raul");
            radioButton[4].setText("Ii deranjez inapoi");

        }
        if(current==2){

            label.setText(" Q3: Ce tip de muzica preferi? ");

            radioButton[0].setText("Toate tipurile");
            radioButton[1].setText("Rock");
            radioButton[2].setText("Dance");
            radioButton[3].setText("Folk");
            radioButton[4].setText("Soundtracks");

        }
        if(current==3){

            label.setText("Q4: Ce gen de film iti place? ");

            radioButton[0].setText("Clasic");
            radioButton[1].setText("Orice");
            radioButton[2].setText("Horror");
            radioButton[3].setText("Actiune");
            radioButton[4].setText("Romanta");
        }
        if(current==4){

            label.setText(" Q5: Ce animal preferi? ");

            radioButton[0].setText("Cal");
            radioButton[1].setText("Maimuta");
            radioButton[2].setText("Liliac");
            radioButton[3].setText("Caine");
            radioButton[4].setText("Pisica");
        }
        if(current==5) {

            label.setBounds(60, 80, 400, 100);
            label.setText("<html>"+getResult()+"<html>");
            radioButton[0].setVisible(false);
            radioButton[1].setVisible(false);
            radioButton[2].setVisible(false);
            radioButton[3].setVisible(false);
            radioButton[4].setVisible(false);



        }
        else {
            label.setBounds(30, 40, 400, 50);
            radioButton[0].setBounds(50, 80, 450, 20);
            radioButton[1].setBounds(50, 110, 450, 20);
            radioButton[2].setBounds(50, 140, 450, 20);
            radioButton[3].setBounds(50, 170, 450, 20);
            radioButton[4].setBounds(50, 200, 450, 20);
            radioButton[0].setVisible(true);
            radioButton[1].setVisible(true);
            radioButton[2].setVisible(true);
            radioButton[3].setVisible(true);
            radioButton[4].setVisible(true);
        }
    }


     public void makeFecventaVarianta(){
        if(current==0) {
             if(radioButton[0].isSelected())
                f[0]++;
            if(radioButton[1].isSelected())
                 f[1]++;
            if(radioButton[2].isSelected())
                 f[2]++;
            if(radioButton[3].isSelected())
                f[3]++;
            if(radioButton[4].isSelected())
                f[4]++;
        }
        if(current==1) {
            if(radioButton[0].isSelected())
                f[0]++;
            if(radioButton[1].isSelected())
                f[2]++;
            if(radioButton[2].isSelected())
                f[4]++;
            if(radioButton[3].isSelected())
                f[3]++;
            if(radioButton[4].isSelected())
                f[1]++;
        }
        if(current==2) {
            if(radioButton[0].isSelected())
                f[1]++;
            if(radioButton[1].isSelected())
                f[3]++;
            if(radioButton[2].isSelected())
                f[2]++;
            if(radioButton[3].isSelected())
                f[0]++;
            if(radioButton[4].isSelected())
                f[4]++;
        }
        if(current==3) {
            if(radioButton[0].isSelected())
                f[2]++;
            if(radioButton[1].isSelected())
                f[1]++;
            if(radioButton[2].isSelected())
                f[3]++;
            if(radioButton[3].isSelected())
                f[0]++;
            if(radioButton[4].isSelected())
                f[4]++;
        }
        if(current==4) {
            if(radioButton[0].isSelected())
                f[3]++;
            if(radioButton[1].isSelected())
                f[1]++;
            if(radioButton[2].isSelected())
                f[4]++;
            if(radioButton[3].isSelected())
                f[2]++;
            if(radioButton[4].isSelected())
                f[0]++;
        }

    }

    public String getResult(){
        int maxi=-1;
        for(int i=0; i<4; i++)
            if(f[i]>maxi)
                maxi=f[i];
        if(maxi==f[0]){
            return " Unii te-ar putea considera naiv si timid. " +
                    "Nu te prea intereseaza ce se intampla in jurul tau. "+
                    "Singurele persoane de care chiar iti pasa sunt prietenii si familia ta. " +
                    "Iti plac relatiile pe care deja le ai si ideea de a intalni noi oameni nu te incanta.   ";
        }
        if(maxi==f[1]){
            return "  Ai o gramada de ideei originale. " +
                    " Din pacate consideri ca doar ideiile tale sunt demne de pus in practica. " +
                    "Cu toate acestea, exuberanța ta te ajută să depășești orice provocare!  ";
        }
        if(maxi==f[2]){
            return "  Iti place sa fii intodeauna in centrul atentiei. " +
                    "Esti plin de energie si oamenii vor sa fii in preajma lor pentru a aduce o stare de spirit buna. " +
                    "Esti un optimist convins care vede mereu parte plina a paharului!  ";
        }
        if(maxi==f[3]){
            return "  Nu iti pasa de absolut nimic. Mereu faci ceea ce doresti fara sa iti pese de ce ar spune alti oameni. " +
                    "Esti creativ si iti place sa fii singuratic.  ";
        }
        if(maxi==f[4]){
            return "  Faci tot posibilul sa fii in centrul atentiei chiar daca nu te vezi fata in fata cu ceilalti. " +
                    "Ai grija cu cine te imprietenesti! Daca nu iti plac persoanele pe care le numesti prieteni, " +
                    "ar trebui sa cauti in alta parte.  ";
        }

       return null;
    }
   public void resetTest(){
        current=0;
        setData();
        for(int i=0; i<5; i++)
            f[i]=0;
       buttonReset.setVisible(false);
       buttonExit.setVisible(false);
       buttonNext.setEnabled(true);
       buttonNext.setVisible(true);
   }
   @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==buttonNext) {
            if (radioButton[0].isSelected() || radioButton[1].isSelected() || radioButton[2].isSelected() || radioButton[4].isSelected() || radioButton[3].isSelected()) {
                makeFecventaVarianta();
                current++;
                setData();
                if (current == 4) {
                    buttonNext.setEnabled(false);
                    buttonNext.setVisible(false);
                    buttonResult.setVisible(true);
                    buttonResult.setText("REZULTAT");
                }

            }
        }
        if(e.getActionCommand().equals("REZULTAT")){
            makeFecventaVarianta();
            current++;
            String s=new String();
            s=getResult();
            setData();
            buttonResult.setVisible(false);
            buttonReset.setText("RESET");
            buttonExit.setText("EXIT");
            buttonReset.setVisible(true);
            buttonExit.setVisible(true);

        }
        if(e.getActionCommand().equals("RESET")) {
           resetTest();
        }
       if(e.getActionCommand().equals("EXIT")) {
         System.exit(0);
       }

   }


}







