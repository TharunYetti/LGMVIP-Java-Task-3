import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ScientificCalculator{
    static int flag=0;
    static double arg1=-1.0;
    static String op="";
    public static void main(String args[]){
        JFrame f=new JFrame("Scientific Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,600);
        Container con=new Container();
        //f.setOpaque(true);
        f.getContentPane().setBackground(Color.cyan);
        con.setLayout(null);

        JLabel head=new JLabel("SCIENTIFIC CALCULATOR");
        head.setLocation(60,10);
        head.setSize(380,50);
        head.setFont(new Font((head.getText()),Font.ROMAN_BASELINE,30));
        con.add(head);

        JTextArea ta1=new JTextArea();
        ta1.setSize(350,50);
        ta1.setLocation(70,70);
        ta1.setFont(new Font(ta1.getText(),Font.PLAIN,20));
        con.add(ta1);

        JButton b1=new JButton("sin");
        JButton b2=new JButton("cos");
        JButton b3=new JButton("tan");
        JButton b4=new JButton("DL");
        JButton b5=new JButton("C");
        JButton b6=new JButton("sinh");
        JButton b7=new JButton("cosh");
        JButton b8=new JButton("tanh");
        JButton b9=new JButton("log");
        JButton b10=new JButton("lg10");
        JButton b11=new JButton("7");
        JButton b12=new JButton("8");
        JButton b13=new JButton("9");
        JButton b14=new JButton("+");
        JButton b15=new JButton("-");
        JButton b16=new JButton("4");
        JButton b17=new JButton("5");
        JButton b18=new JButton("6");
        JButton b19=new JButton("x");
        JButton b20=new JButton("/");
        JButton b21=new JButton("1");
        JButton b22=new JButton("2");
        JButton b23=new JButton("3");
        JButton b24=new JButton("^");
        JButton b25=new JButton("%");
        JButton b26=new JButton("0");
        JButton b27=new JButton(".");
        JButton b28=new JButton("sqrt");
        JButton b29=new JButton("=");

        b1.setSize(70,50);
        b2.setSize(70,50);
        b3.setSize(70,50);
        b4.setSize(70,50);
        b5.setSize(70,50);
        b6.setSize(70,50);
        b7.setSize(70,50);
        b8.setSize(70,50);
        b9.setSize(70,50);
        b10.setSize(70,50);
        b11.setSize(70,50);
        b12.setSize(70,50);
        b13.setSize(70,50);
        b14.setSize(70,50);
        b15.setSize(70,50);
        b16.setSize(70,50);
        b17.setSize(70,50);
        b18.setSize(70,50);
        b19.setSize(70,50);
        b20.setSize(70,50);
        b21.setSize(70,50);
        b22.setSize(70,50);
        b23.setSize(70,50);
        b24.setSize(70,50);
        b25.setSize(70,50);
        b26.setSize(140,50);
        b27.setSize(70,50);
        b28.setSize(70,50);
        b29.setSize(70,50);

        b1.setLocation(70,130);
        b2.setLocation(140,130);
        b3.setLocation(210,130);
        b4.setLocation(280,130);
        b5.setLocation(350,130);
        b6.setLocation(70,180);
        b7.setLocation(140,180);
        b8.setLocation(210,180);
        b9.setLocation(280,180);
        b10.setLocation(350,180);
        b11.setLocation(70,230);
        b12.setLocation(140,230);
        b13.setLocation(210,230);
        b14.setLocation(280,230);
        b15.setLocation(350,230);
        b16.setLocation(70,280);
        b17.setLocation(140,280);
        b18.setLocation(210,280);
        b19.setLocation(280,280);
        b20.setLocation(350,280);
        b21.setLocation(70,330);
        b22.setLocation(140,330);
        b23.setLocation(210,330);
        b24.setLocation(280,330);
        b25.setLocation(350,330);
        b26.setLocation(70,380);
        b27.setLocation(210,380);
        b28.setLocation(280,380);
        b29.setLocation(350,380);

        con.add(b1);con.add(b2);con.add(b3);con.add(b4);
        con.add(b5);con.add(b6);con.add(b7);con.add(b8);
        con.add(b9);con.add(b10);con.add(b11);con.add(b12);
        con.add(b13);con.add(b14);con.add(b15);con.add(b16);
        con.add(b17);con.add(b18);con.add(b19);con.add(b20);
        con.add(b21);con.add(b22);con.add(b23);con.add(b24);
        con.add(b25);con.add(b26);con.add(b27);con.add(b28);
        con.add(b29);

        JLabel note=new JLabel("This space is for any alert dislaying");
        note.setSize(350,30);
        note.setLocation(70,450);
        note.setForeground(Color.red);
        note.setFont(new Font(note.getText(),Font.CENTER_BASELINE,15));
        note.setHorizontalAlignment(JLabel.CENTER);
        con.add(note);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}
                ta1.setText(Double.toString(Math.sin(Double.parseDouble(ta1.getText()))));
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}   
                ta1.setText(Double.toString(Math.cos(Double.parseDouble(ta1.getText()))));
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}
                ta1.setText(Double.toString(Math.tan(Double.parseDouble(ta1.getText()))));
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0) return;
                ta1.setText(ta1.getText().substring(0,ta1.getText().length()-1));
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ta1.setText("");
                flag=0;
                op="";
                arg1=0.0;
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}
                ta1.setText(Double.toString(Math.sinh(Double.parseDouble(ta1.getText()))));
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}
                ta1.setText(Double.toString(Math.cosh(Double.parseDouble(ta1.getText()))));
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}
                ta1.setText(Double.toString(Math.tanh(Double.parseDouble(ta1.getText()))));
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}
                ta1.setText(Double.toString(Math.log(Double.parseDouble(ta1.getText()))));
            }
        });
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}
                ta1.setText(Double.toString(Math.log10(Double.parseDouble(ta1.getText()))));
            }
        });
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("7");
                }
                else{
                    ta1.setText(ta1.getText()+"7");
                }
            }
        });
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("8");
                }
                else{
                    ta1.setText(ta1.getText()+"8");
                }
            }
        });
        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("9");
                }
                else{
                    ta1.setText(ta1.getText()+"9");
                }
            }
        });
        b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                flag=1;
                op="+";
                if(ta1.getText().length()==0){arg1=0.0;return;}
                arg1=Double.parseDouble(ta1.getText());
                ta1.setText("");
                
            }
        });
        b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                flag=1;
                op="-";
                if(ta1.getText().length()==0){arg1=0.0;return;}
                arg1=Double.parseDouble(ta1.getText());
                ta1.setText("");
            }
        });
        b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("4");
                    flag=2;
                }
                else{
                    ta1.setText(ta1.getText()+"4");
                }
            }
        });
        b17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("5");
                    flag=2;
                }
                else{
                    ta1.setText(ta1.getText()+"5");
                }
            }
        });
        b18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("6");
                    flag=2;
                }
                else{
                    ta1.setText(ta1.getText()+"6");
                }
            }
        });
        b19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter one argument first!");return;}
                flag=1;
                op="x";
                arg1=Double.parseDouble(ta1.getText());
                ta1.setText("");
            }
        });
        b20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter one argument first!");return;}
                flag=1;
                op="/";
                arg1=Double.parseDouble(ta1.getText());
                ta1.setText("");
            }
        });
        b21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("1");
                    flag=2;
                }
                else{
                    ta1.setText(ta1.getText()+"1");
                }
            }
        });
        b22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("2");
                    flag=2;
                }
                else{
                    ta1.setText(ta1.getText()+"2");
                }
            }
        });
        b23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("3");
                    flag=2;
                }
                else{
                    ta1.setText(ta1.getText()+"3");
                }
            }
        });
        b24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter one argument first!");return;}
                flag=1;
                op="^";
                arg1=Double.parseDouble(ta1.getText());
                ta1.setText("");
            }
        });
        b25.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter one argument first!");return;}
                flag=1;
                op="%";
                arg1=Double.parseDouble(ta1.getText());
                ta1.setText("");
            }
        });
        b26.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag==1){
                    ta1.setText("0");
                    flag=2;
                }
                else{
                    ta1.setText(ta1.getText()+"0");
                }
            }
        });
        b27.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ta1.setText(ta1.getText()+".");
            }
        });
        b28.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta1.getText().length()==0){note.setText("Please enter argument first!!!");return;}
                ta1.setText(Double.toString(Math.sqrt(Double.parseDouble(ta1.getText()))));
            }
        });
        b29.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //ta1.setText("wait...");
                if(flag==1 && ta1.getText().length()==0){
                    note.setText("Enter the second argument!!");
                    return;
                }
                if(flag>=1 && op!="" && ta1.getText().length()!=0){
                    if(op.equals("+")){
                        ta1.setText(Double.toString(arg1+Double.parseDouble(ta1.getText())));
                    }
                    else if(op.equals("-")){
                        ta1.setText(Double.toString(arg1-(Double.parseDouble(ta1.getText()))));
                    }
                    else if(op.equals("x")){
                        ta1.setText(Double.toString(arg1*(Double.parseDouble(ta1.getText()))));
                    }
                    else if(op.equals("/")){
                        ta1.setText(Double.toString(arg1/(Double.parseDouble(ta1.getText()))));
                    }
                    else if(op.equals("^")){
                        ta1.setText(Double.toString(Math.pow(arg1,(Double.parseDouble(ta1.getText())))));
                    }
                    else if(op.equals("%")){
                        ta1.setText(Double.toString(arg1%(Double.parseDouble(ta1.getText()))));
                    }
                    flag=0;
                    note.setText("This space is for any alert dislaying");
                }

            }
        });

        f.add(con);
        f.setVisible(true);
    }
}
