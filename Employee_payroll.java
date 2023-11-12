package employee_payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.ComponentOrientation;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Employee_payroll {

	private JFrame frame;
	private JTextField Name;
	private JTextField Salary;
	private JTable table;
	private JTextField Mon1;
	private JTextField Tue1;
	private JTextField Wed1;
	private JTextField Thur1;
	private JTextField Fri1;
	private JTextField Sat1;
	private JTextField Sun1;
	private JTextField Reghour;
	private JTextField Overtimehour;
	private JTextField Regamount;
	private JTextField Overtimeamount;
	private JTextField Netpay;
	private JTextField Mon2;
	private JTextField Tue2;
	private JTextField Wed2;
	private JTextField Thur2;
	private JTextField Fri2;
	private JTextField Sat2;
	private JTextField Sun2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_payroll window = new Employee_payroll();
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
	public Employee_payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBackground(new Color(0, 0, 255));
		frame.setTitle("Georgetown Cleaning Services - Employee Payroll");
		frame.setBounds(100, 100, 694, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 220));
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(20, 11, 646, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(52, 27, 110, 14);
		lblNewLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.add(lblNewLabel);
		
		Name = new JTextField();
		Name.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Name.setBounds(155, 24, 176, 20);
		panel.add(Name);
		Name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Hour Salary");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(356, 27, 102, 14);
		panel.add(lblNewLabel_1);
		
		Salary = new JTextField();
		Salary.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Salary.setHorizontalAlignment(SwingConstants.RIGHT);
		Salary.setBounds(481, 25, 86, 20);
		panel.add(Salary);
		Salary.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 105, 652, 144);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("First Week:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(10, 46, 69, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("Second Week:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(2, 100, 85, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("Monday");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(100, 21, 55, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Tuesday");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(165, 21, 59, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Wednesday");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(227, 21, 77, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Thursday");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(302, 21, 69, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Friday");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(381, 21, 61, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_10 = new JLabel("Saturday");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(452, 21, 77, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_2 = new JLabel("Sunday");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(527, 21, 69, 14);
		panel_1.add(lblNewLabel_2);
		
		Mon1 = new JTextField();
		Mon1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Mon1.setHorizontalAlignment(SwingConstants.RIGHT);
		Mon1.setBounds(100, 43, 55, 20);
		panel_1.add(Mon1);
		Mon1.setColumns(10);
		
		Tue1 = new JTextField();
		Tue1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Tue1.setHorizontalAlignment(SwingConstants.RIGHT);
		Tue1.setBounds(165, 44, 52, 20);
		panel_1.add(Tue1);
		Tue1.setColumns(10);
		
		Wed1 = new JTextField();
		Wed1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Wed1.setHorizontalAlignment(SwingConstants.RIGHT);
		Wed1.setBounds(237, 44, 55, 20);
		panel_1.add(Wed1);
		Wed1.setColumns(10);
		
		Thur1 = new JTextField();
		Thur1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Thur1.setHorizontalAlignment(SwingConstants.RIGHT);
		Thur1.setBounds(302, 44, 59, 20);
		panel_1.add(Thur1);
		Thur1.setColumns(10);
		
		Fri1 = new JTextField();
		Fri1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Fri1.setHorizontalAlignment(SwingConstants.RIGHT);
		Fri1.setBounds(379, 44, 58, 20);
		panel_1.add(Fri1);
		Fri1.setColumns(10);
		
		Sat1 = new JTextField();
		Sat1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Sat1.setHorizontalAlignment(SwingConstants.RIGHT);
		Sat1.setBounds(452, 44, 55, 20);
		panel_1.add(Sat1);
		Sat1.setColumns(10);
		
		Sun1 = new JTextField();
		Sun1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Sun1.setHorizontalAlignment(SwingConstants.RIGHT);
		Sun1.setBounds(527, 44, 55, 20);
		panel_1.add(Sun1);
		Sun1.setColumns(10);
		
		Mon2 = new JTextField();
		Mon2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Mon2.setHorizontalAlignment(SwingConstants.RIGHT);
		Mon2.setBounds(97, 98, 55, 20);
		panel_1.add(Mon2);
		Mon2.setColumns(10);
		
		Tue2 = new JTextField();
		Tue2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Tue2.setHorizontalAlignment(SwingConstants.RIGHT);
		Tue2.setBounds(165, 99, 52, 20);
		panel_1.add(Tue2);
		Tue2.setColumns(10);
		
		Wed2 = new JTextField();
		Wed2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Wed2.setHorizontalAlignment(SwingConstants.RIGHT);
		Wed2.setBounds(237, 99, 55, 20);
		panel_1.add(Wed2);
		Wed2.setColumns(10);
		
		Thur2 = new JTextField();
		Thur2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Thur2.setHorizontalAlignment(SwingConstants.RIGHT);
		Thur2.setBounds(302, 99, 59, 20);
		panel_1.add(Thur2);
		Thur2.setColumns(10);
		
		Fri2 = new JTextField();
		Fri2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Fri2.setHorizontalAlignment(SwingConstants.RIGHT);
		Fri2.setBounds(379, 99, 58, 20);
		panel_1.add(Fri2);
		Fri2.setColumns(10);
		
		Sat2 = new JTextField();
		Sat2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Sat2.setHorizontalAlignment(SwingConstants.RIGHT);
		Sat2.setBounds(452, 99, 55, 20);
		panel_1.add(Sat2);
		Sat2.setColumns(10);
		
		Sun2 = new JTextField();
		Sun2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Sun2.setHorizontalAlignment(SwingConstants.RIGHT);
		Sun2.setBounds(527, 99, 55, 20);
		panel_1.add(Sun2);
		Sun2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(20, 260, 656, 110);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(255, 255, 255));
		table.setBounds(364, 81, -276, -60);
		panel_2.add(table);
		
		JButton btnNewButton = new JButton("Process it");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				Name.getText();
				float salary=Float.valueOf(Salary.getText());
				float mon=Float.valueOf(Mon1.getText());
				float tue=Float.valueOf(Tue1.getText());
				float wed=Float.valueOf(Wed1.getText());
				float thur=Float.valueOf(Thur1.getText());
				float fri=Float.valueOf(Fri1.getText());
				float sat=Float.valueOf(Sat1.getText());
				float sun=Float.valueOf(Sun1.getText());
				float mon2=Float.valueOf(Mon2.getText());
				float tue2=Float.valueOf(Tue2.getText());
				float wed2=Float.valueOf(Wed2.getText());
				float thur2=Float.valueOf(Thur2.getText());
				float fri2=Float.valueOf(Fri2.getText());
				float sat2=Float.valueOf(Sat2.getText());
				float sun2=Float.valueOf(Sun2.getText());
				float arr1[]= {mon,tue,wed,thur,fri,sat,sun,mon2,tue2,wed2,thur2,fri2,sat2,sun2};
				float overtime,regular,over;
				overtime=0;
				regular=0;
				for(int i=0;i<14;i++)
				{
					if (arr1[i]>8)
					{
						over=arr1[i]-8;
						overtime=overtime+over;
						regular=regular+8;
					}
					else
					{
						regular=regular+arr1[i];
					}
					
				}
				
				float Weekovertime=overtime;
				float Weekregular=regular;
	
				Reghour.setText(String.valueOf(Weekregular));
				Overtimehour.setText(String.valueOf(Weekovertime));
			float regularamnt = Weekregular*salary;
			float overtimeamnt = Weekovertime*salary;	
			String formattedRegularAmount = String.format("%.2f", regularamnt);
			String formattedOvertimeAmount = String.format("%.2f", overtimeamnt);

			Regamount.setText(formattedRegularAmount);
			Overtimeamount.setText(formattedOvertimeAmount);
			float netpay= overtimeamnt+regularamnt;
			
			String formattednetpay = String.format("%.2f", netpay);
			Netpay.setText(String.valueOf(formattednetpay));
				
				
			}
		});
		btnNewButton.setBounds(30, 27, 89, 50);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("Regular");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(134, 45, 67, 14);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Overtime");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(134, 64, 67, 14);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Hours");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(221, 14, 67, 14);
		panel_2.add(lblNewLabel_13);
		
		Reghour = new JTextField();
		Reghour.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Reghour.setHorizontalAlignment(SwingConstants.RIGHT);
		Reghour.setBounds(211, 39, 86, 20);
		panel_2.add(Reghour);
		Reghour.setColumns(10);
		
		Overtimehour = new JTextField();
		Overtimehour.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Overtimehour.setHorizontalAlignment(SwingConstants.RIGHT);
		Overtimehour.setBounds(211, 62, 86, 20);
		panel_2.add(Overtimehour);
		Overtimehour.setColumns(10);
		
		Regamount = new JTextField();
		Regamount.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Regamount.setHorizontalAlignment(SwingConstants.RIGHT);
		Regamount.setBounds(307, 39, 86, 20);
		panel_2.add(Regamount);
		Regamount.setColumns(10);
		
		Overtimeamount = new JTextField();
		Overtimeamount.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Overtimeamount.setHorizontalAlignment(SwingConstants.RIGHT);
		Overtimeamount.setBounds(307, 62, 86, 20);
		panel_2.add(Overtimeamount);
		Overtimeamount.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Net Pay");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(403, 45, 46, 14);
		panel_2.add(lblNewLabel_14);
		
		Netpay = new JTextField();
		Netpay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Netpay.setHorizontalAlignment(SwingConstants.RIGHT);
		Netpay.setBounds(459, 43, 75, 20);
		panel_2.add(Netpay);
		Netpay.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Amount");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(321, 14, 72, 14);
		panel_2.add(lblNewLabel_15);
		
		JButton closebutton = new JButton("Close");
		closebutton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		closebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		closebutton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		closebutton.setBounds(544, 27, 89, 50);
		panel_2.add(closebutton);
	}
}