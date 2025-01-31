
package Application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel minilabel;
	JLabel displayLabel;
	Boolean isOperatorClicked=false;
	String  oldValue;
	String newValue;
	float result;
	String operator;
	
	JButton ACbuttons;
	JButton percentagebuttons;
	JButton clearbuttons;
	JButton ninebuttons;
	JButton eightbuttons;
	JButton sevenbuttons;
	JButton dividebuttons;
	JButton  multiplebuttons;
	JButton fourbuttons;
	JButton fivebuttons;
	JButton sixbuttons;
	JButton substractionbuttons;
	JButton onebuttons;
	JButton twobuttons;
	JButton threebuttons;
	JButton additionbuttons;
	JButton doublezerobuttons;
	JButton zerobuttons;
	JButton pointbuttons;
	JButton equalbuttons;
	
	public Calculator()
{
	jf=new JFrame("Calculator");
	jf.setLayout(null);
	jf.setSize(422,650);
	jf.setLocation(1000,200 );
	jf.getContentPane().setBackground(Color.black);
	
	minilabel=new JLabel("Ans");
    minilabel.setBounds(0, 0, 50, 50);
	minilabel.setBackground(Color.white);
	minilabel.setForeground(Color.white);
	minilabel.setFont(new Font("SanSerif",0,20));
	    
	displayLabel=new JLabel("");
    displayLabel.setBounds(10, 20, 385, 80);
    displayLabel.setBackground(Color.black);
    displayLabel.setOpaque(true);
    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displayLabel.setForeground(Color.white);
    displayLabel.setFont(new Font("SanSerif",0,60));
	displayLabel.setBorder(BorderFactory.createLineBorder(Color.white, 3));
    displayLabel.setBorder(new RoundedBorder(40));
   
    jf.add(displayLabel);
	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
//AC
ACbuttons=new JButton("AC");
ACbuttons.setBounds(20,150,80,80);
ACbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
ACbuttons.addActionListener(this);
ACbuttons.setForeground(Color.white);
ACbuttons.setBackground(Color.BLACK);

jf.add(ACbuttons);
//%
percentagebuttons=new JButton("%");
percentagebuttons.setBounds(115,150,80,80);	
percentagebuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
percentagebuttons.addActionListener(this);
jf.add(percentagebuttons);
percentagebuttons.setForeground(Color.white);
percentagebuttons.setBackground(Color.black);
//Clear	
clearbuttons=new JButton("Clear");
clearbuttons.setBounds(210,150,80,80);
clearbuttons.setFont( new Font("SanSerif", Font.PLAIN,18));
clearbuttons.addActionListener(this);
jf.add(clearbuttons);
clearbuttons.setForeground(Color.white);
clearbuttons.setBackground(Color.black);
//"/"
dividebuttons=new JButton("/");
dividebuttons.setBounds(305,150,80,80);
dividebuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
dividebuttons.addActionListener(this);
jf.add(dividebuttons);
dividebuttons.setForeground(Color.white);
dividebuttons.setBackground(Color.black);
//7
sevenbuttons=new JButton("7");
sevenbuttons.setBounds(20,240,80,80);
sevenbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
sevenbuttons.addActionListener(this);
jf.add(sevenbuttons);
sevenbuttons.setForeground(Color.white);
sevenbuttons.setBackground(Color.black);
//8
eightbuttons=new JButton("8");
eightbuttons.setBounds(115,240,80,80);
eightbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
eightbuttons.addActionListener(this);
jf.add(eightbuttons);
eightbuttons.setForeground(Color.white);
eightbuttons.setBackground(Color.black);
//9
ninebuttons=new JButton("9");
ninebuttons.setBounds(210,240,80,80);
ninebuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
ninebuttons.addActionListener(this);
jf.add(ninebuttons);
ninebuttons.setForeground(Color.white);
ninebuttons.setBackground(Color.black);
//*
multiplebuttons=new JButton("*");
multiplebuttons.setBounds(305,240,80,80);
multiplebuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
multiplebuttons.addActionListener(this);
jf.add(multiplebuttons);
multiplebuttons.setForeground(Color.white);
multiplebuttons.setBackground(Color.black);
//4	
fourbuttons=new JButton("4");
fourbuttons.setBounds(20,330,80,80);
fourbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
fourbuttons.addActionListener(this);
jf.add(fourbuttons);
fourbuttons.setForeground(Color.white);
fourbuttons.setBackground(Color.black);
//5
fivebuttons=new JButton("5");
fivebuttons.setBounds(115,330,80,80);
fivebuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
fivebuttons.addActionListener(this);
jf.add(fivebuttons);
fivebuttons.setForeground(Color.white);
fivebuttons.setBackground(Color.black);
//6
sixbuttons=new JButton("6");
sixbuttons.setBounds(210,330,80,80);
sixbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
sixbuttons.addActionListener(this);
jf.add(sixbuttons);
sixbuttons.setForeground(Color.white);
sixbuttons.setBackground(Color.black);
//-	
substractionbuttons=new JButton("-");
substractionbuttons.setBounds(305,330,80,80);
substractionbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
substractionbuttons.addActionListener(this);
jf.add(substractionbuttons);
substractionbuttons.setForeground(Color.white);
substractionbuttons.setBackground(Color.black);

//1	
onebuttons=new JButton("1");
onebuttons.setBounds(20,420,80,80);
onebuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
jf.add(onebuttons);
onebuttons.addActionListener(this);
onebuttons.setForeground(Color.white);
onebuttons.setBackground(Color.black);
//2	
twobuttons=new JButton("2");
twobuttons.setBounds(115,420,80,80);
twobuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
twobuttons.addActionListener(this);
twobuttons.setForeground(Color.white);
twobuttons.setBackground(Color.black);
jf.add(twobuttons);
//3	
threebuttons=new JButton("3");
threebuttons.setBounds(210,420,80,80);
threebuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
threebuttons.addActionListener(this);
jf.add(threebuttons);
threebuttons.setForeground(Color.white);
threebuttons.setBackground(Color.black);
//+	
additionbuttons=new JButton("+");
additionbuttons.setBounds(305,420,80,80);
additionbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
additionbuttons.addActionListener(this);
additionbuttons.setForeground(Color.white);
additionbuttons.setBackground(Color.black);
jf.add(additionbuttons);
//00	
doublezerobuttons=new JButton("00");
doublezerobuttons.setBounds(20,510,80,80);
doublezerobuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
doublezerobuttons.addActionListener(this);
jf.add(doublezerobuttons);
doublezerobuttons.setForeground(Color.white);
doublezerobuttons.setBackground(Color.black);
//0	
zerobuttons=new JButton("0");
zerobuttons.setBounds(115,510,80,80);
zerobuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
zerobuttons.addActionListener(this);
jf.add(zerobuttons);
zerobuttons.setForeground(Color.white);
zerobuttons.setBackground(Color.black);
//.	
pointbuttons=new JButton(".");
pointbuttons.setBounds(210,510,80,80);
pointbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
pointbuttons.addActionListener(this);
pointbuttons.setForeground(Color.white);
pointbuttons.setBackground(Color.black);
jf.add(pointbuttons);
//=	
equalbuttons=new JButton("=");
equalbuttons.setBounds(305,510,80,80);
equalbuttons.setFont( new Font("SanSerif", Font.PLAIN,30));
equalbuttons.addActionListener(this);
jf.add(equalbuttons);
equalbuttons.setForeground(Color.white);
equalbuttons.setBackground(Color.orange);


}


public static void main(String[] args)
{
    new Calculator();
}



public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==zerobuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("0");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"0");
        }
    }
    else if(e.getSource()==onebuttons) {
        if(isOperatorClicked)
        {
            displayLabel.setText("1");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"1");
        }
            
        }
    else if(e.getSource()==twobuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("2");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"2");
        }
    }
    else if(e.getSource()==threebuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("3");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"3");
        }
    }
    else if(e.getSource()==fourbuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("4");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"4");
        }
    }
    else if(e.getSource()==fivebuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("5");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"5");
        }
    }
    if(e.getSource()==sixbuttons) {
        if(isOperatorClicked)
        {
            displayLabel.setText("6");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"6");
        }
    }
    else if(e.getSource()==sevenbuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("7");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"7");
        }
    }
    else if(e.getSource()==eightbuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("8");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"8");
        }
    }
    else if(e.getSource()==ninebuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("9");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"9");
        }
    }
    else if(e.getSource()==doublezerobuttons)
    {
        if(isOperatorClicked)
        {
            displayLabel.setText("00");
            isOperatorClicked=false;
        }
        else
        {
        displayLabel.setText(displayLabel.getText()+"00");
        }
    }
    else if(e.getSource()==pointbuttons)
    {
        displayLabel.setText(displayLabel.getText()+".");
    }
    else if(e.getSource()==ACbuttons)
    {
        displayLabel.setText("");
    }
    else if(e.getSource()==additionbuttons)
    {
        operator=additionbuttons.getText();
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
    }
    else if(e.getSource()==substractionbuttons)
    {
        operator=substractionbuttons.getText();
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
    }
    else if(e.getSource()==multiplebuttons)
    {
        operator=multiplebuttons.getText();
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
    }
    else if(e.getSource()==dividebuttons)
    {
        operator=dividebuttons.getText();
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
    }
    else if(e.getSource()==percentagebuttons)
    {
        operator=percentagebuttons.getText();
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
    }
    else if(e.getSource()==equalbuttons)
    {
                newValue=displayLabel.getText();
                float oldValueF=Float.parseFloat(oldValue);
                float newValueF=Float.parseFloat(newValue);
                if(operator=="+")
                 {
                 result=oldValueF+newValueF;
                }
                else if(operator=="-")
                {
                 result=oldValueF-newValueF;
                }
                else if(operator=="*")
                {
                    result=oldValueF*newValueF;
                }
                else if(operator=="/")
                {
                    result=oldValueF/newValueF;
                }
                else if(operator=="%")
                {
                    result=(oldValueF /newValueF)*100;
                }
                displayLabel.add(minilabel);
                displayLabel.setText(result+"");
    }


}
}