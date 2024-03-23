package just;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 714);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setBackground(new Color(128, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(74, 0, 278, 44);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBackground(new Color(128, 255, 0));
		textField.setBounds(10, 49, 410, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(10, 136, 72, 74);
		frame.getContentPane().add(btnNewButton);

		JButton btnx = new JButton("1/x");
		btnx.setForeground(new Color(0, 128, 255));
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnx.setBounds(10, 213, 72, 74);
		frame.getContentPane().add(btnx);

		JButton btnX_1 = new JButton("X^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnX_1.setBounds(10, 366, 72, 74);
		frame.getContentPane().add(btnX_1);

		JButton btnX = new JButton("X^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnX.setBounds(10, 443, 72, 74);
		frame.getContentPane().add(btnX);

		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while (a != 0) {
					fact = fact * a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText() + fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnN.setBounds(10, 521, 72, 74);
		frame.getContentPane().add(btnN);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlusMinus.setBounds(10, 596, 72, 74);
		frame.getContentPane().add(btnPlusMinus);

		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnNewButton_1_1.setBounds(89, 213, 72, 74);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnEx = new JButton("e^x");
		btnEx.setForeground(new Color(0, 128, 255));
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEx.setBounds(89, 136, 72, 74);
		frame.getContentPane().add(btnEx);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn7.setBounds(89, 366, 72, 74);
		frame.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn4.setBounds(89, 443, 72, 74);
		frame.getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn1.setBounds(89, 521, 72, 74);
		frame.getContentPane().add(btn1);

		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnSin.setBounds(171, 136, 72, 74);
		frame.getContentPane().add(btnSin);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn8.setBounds(171, 366, 72, 74);
		frame.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn5.setBounds(171, 443, 72, 74);
		frame.getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn2.setBounds(171, 521, 72, 74);
		frame.getContentPane().add(btn2);

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(0, 128, 255));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn0.setBounds(92, 596, 151, 74);
		frame.getContentPane().add(btn0);

		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBackspace.setBounds(253, 289, 72, 74);
		frame.getContentPane().add(btnBackspace);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn9.setBounds(253, 366, 72, 74);
		frame.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn6.setBounds(253, 443, 72, 74);
		frame.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn3.setBounds(253, 521, 72, 74);
		frame.getContentPane().add(btn3);

		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnDot.setBounds(253, 596, 72, 74);
		frame.getContentPane().add(btnDot);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "X^Y") {
					double resultt = 1;
					for (int i = 0; i < second; i++) {
						resultt = first * resultt;
					}
					answer = String.format("%.2f", resultt);
					textField.setText(answer);

				}

			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEqual.setBounds(335, 596, 72, 74);
		frame.getContentPane().add(btnEqual);

		JButton btnDivide = new JButton("/");
		btnDivide.setForeground(new Color(255, 0, 0));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDivide.setBounds(335, 521, 72, 74);
		frame.getContentPane().add(btnDivide);

		JButton btnMultiply = new JButton("*");
		btnMultiply.setForeground(new Color(255, 0, 0));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMultiply.setBounds(335, 443, 72, 74);
		frame.getContentPane().add(btnMultiply);

		JButton btnSubstract = new JButton("-");
		btnSubstract.setForeground(new Color(255, 0, 0));
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSubstract.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSubstract.setBounds(335, 366, 72, 74);
		frame.getContentPane().add(btnSubstract);

		JButton btnAdditon = new JButton("+");
		btnAdditon.setForeground(new Color(255, 0, 0));
		btnAdditon.setBackground(new Color(255, 255, 255));
		btnAdditon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdditon.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnAdditon.setBounds(335, 289, 72, 74);
		frame.getContentPane().add(btnAdditon);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(171, 289, 72, 74);
		frame.getContentPane().add(btnClear);

		JButton btnPerecnt = new JButton("%");
		btnPerecnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPerecnt.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnPerecnt.setBounds(89, 289, 72, 74);
		frame.getContentPane().add(btnPerecnt);

		JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnXy.setBounds(10, 289, 72, 74);
		frame.getContentPane().add(btnXy);

		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnCos.setBounds(253, 136, 72, 74);
		frame.getContentPane().add(btnCos);

		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnTan.setBounds(335, 136, 72, 74);
		frame.getContentPane().add(btnTan);

		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnSinh.setBounds(171, 213, 72, 74);
		frame.getContentPane().add(btnSinh);

		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.ITALIC, 18));
		btnCosh.setBounds(253, 213, 72, 74);
		frame.getContentPane().add(btnCosh);

		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.ITALIC, 17));
		btnTanh.setBounds(335, 213, 72, 74);
		frame.getContentPane().add(btnTanh);
	}
}
