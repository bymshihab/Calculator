import javax.swing.*; import java.awt.*; public class calculator {


public static class Calculator extends JFrame {


JLabel view = new JLabel("View"); JLabel edit = new JLabel("Edit"); JLabel help = new JLabel("Help");

JTextField textField = new JTextField(); JButton buttonZero = new JButton("0"); JButton buttonOne = new JButton("1"); JButton buttonTwo = new JButton("2"); JButton buttonThree = new JButton("3"); JButton buttonFour = new JButton("4"); JButton buttonFive = new JButton("5"); JButton buttonSix = new JButton("6"); JButton buttonSeven = new JButton("7"); JButton buttonEight = new JButton("8"); JButton buttonNine = new JButton("9"); JButton buttonDot = new JButton("."); JButton buttonEClear = new JButton("EC"); JButton buttonClear = new JButton("C"); JButton buttonDelete = new JButton("DEL"); JButton buttonEqual = new JButton("="); JButton buttonMul = new JButton("x"); JButton buttonDiv = new JButton("\u00F7"); JButton buttonPlus = new JButton("+"); JButton buttonMinus = new JButton("-");
JButton buttonSquare = new JButton("x\u00B2"); JButton buttonReciprocal = new JButton("1/x"); JButton buttonSqrt = new JButton("\u221A"); JButton plusMinus =new JButton("\u00B1"); JButton percentSing = new JButton("\u0025");

Calculator() { createGui(); addComponents();
}
public void createGui() {

//Setting properties of JFrame(Window)
// frame = new JFrame(); setTitle("Calculator"); setSize(305, 500); getContentPane().setLayout(null); setResizable(false); setLocationRelativeTo(null); setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void addComponents() {
 
view.setBounds(10,10,40,20); view.setFont(new Font("Arial", Font.BOLD, 12)); add(view);

edit.setBounds(43,10,40,20);
edit.setFont(new Font("Arial", Font.BOLD, 12)); add(edit);

help.setBounds(70,10,40,20);
help.setFont(new Font("Arial", Font.BOLD, 12)); add(help);


textField.setBounds(10, 40, 270, 40); textField.setFont(new Font("Arial", Font.BOLD, 20)); textField.setBackground(new Color(200, 228, 220)); textField.setEditable(false); textField.setHorizontalAlignment(SwingConstants.RIGHT); add(textField);
// button 0
buttonZero.setBounds(80, 410, 60, 40); buttonZero.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonZero);
// button 1
buttonOne.setBounds(10, 350, 60, 40); buttonOne.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonOne);
//button 2
buttonTwo.setBounds(80, 350, 60, 40); buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonTwo);
// button 3
buttonThree.setBounds(150, 350, 60, 40); buttonThree.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonThree);
// button 4
buttonFour.setBounds(10, 290, 60, 40); buttonFour.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonFour);
//button 5
buttonFive.setBounds(80, 290, 60, 40); buttonFive.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonFive);
//button 6
buttonSix.setBounds(150, 290, 60, 40); buttonSix.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonSix);
//button 7
buttonSeven.setBounds(10, 230, 60, 40); buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonSeven);
//button 8
 
buttonEight.setBounds(80, 230, 60, 40); buttonEight.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonEight);
//button 9
buttonNine.setBounds(150, 230, 60, 40); buttonNine.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonNine);
//dot button
buttonDot.setBounds(150, 410, 60, 40); buttonDot.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonDot);
//button plusMinus
plusMinus.setBounds(10, 410, 60, 40); plusMinus.setFont(new Font("Arial", Font.BOLD, 20));

add(plusMinus);
//button equal
buttonEqual.setBounds(220, 410, 60, 40); buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonEqual);
//button /
buttonDiv.setBounds(220, 170, 60, 40); buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonDiv);
// button percentSing
percentSing.setBounds(10, 110, 60, 40); percentSing.setFont(new Font("Arial", Font.BOLD, 18));

add(percentSing);
// button square root
buttonSqrt.setBounds(80, 110, 60, 40); buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));

add(buttonSqrt);
//button *
buttonMul.setBounds(220, 230, 60, 40); buttonMul.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonMul);
// button -
buttonMinus.setBounds(220, 290, 60, 40); buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonMinus);
// button +
buttonPlus.setBounds(220, 350, 60, 40); buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonPlus);
//button square
buttonSquare.setBounds(150, 110, 60, 40); buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));

add(buttonSquare);
//reciprocal button
buttonReciprocal.setBounds(220, 110, 60, 40);
 
buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));

add(buttonReciprocal);
// delete button
buttonDelete.setBounds(150, 170, 60, 40); buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));

add(buttonDelete);
//EC button
buttonEClear.setBounds(10, 170, 60, 40); buttonEClear.setFont(new Font("Arial", Font.BOLD, 12));

add(buttonEClear);
//clear button
buttonClear.setBounds(80, 170, 60, 40); buttonClear.setFont(new Font("Arial", Font.BOLD, 12));

add(buttonClear);

}
public static void main(String[] args) { new Calculator();
}
}
}
