import java.awt.EventQueue;
import java.awt.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Box;

public class RESUMEBUILDER extends JFrame
{
	JFrame frame;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t16;
    TextArea  t14,t15,t17,t18;
    Label title,title1,title2,ttle3,title4,FirstName,MiddleName,LastName,Gender,DateofBirth,Contact,EmailId,Address,Qualification,
    		Institute,Branch,Cgpa,Semester,School,Percentage,WET,IP,Objectives,Skills,Acheivements;
    Button b;
    FileWriter FileWriter;
	//Launch the application.
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					RESUMEBUILDER window = new RESUMEBUILDER();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	//Create the application.
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public RESUMEBUILDER() 
	{
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 218, 185));
		frame.setBounds(100, 100, 1012, 815);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbltitle = new JLabel("RESUME BUILDER");
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setBounds(202, 11, 625, 40);
		lbltitle.setForeground(new Color(0, 0, 0));
		lbltitle.setBackground(new Color(153, 0, 102));
		lbltitle.setFont(new Font("Arial Black", Font.BOLD, 30));
		frame.getContentPane().add(lbltitle);
		
		//Personal Details
		JLabel lbltitle1 = new JLabel("PERSONAL DETAILS :");
		lbltitle1.setBounds(30, 58, 215, 24);
		lbltitle1.setFont(new Font("Arial Black", Font.BOLD, 18));
		frame.getContentPane().add(lbltitle1);
		
		JLabel lblFirstName = new JLabel("First Name    :");
		lblFirstName.setLabelFor(t1);
		lblFirstName.setBounds(46, 93, 103, 14);
		lblFirstName.setFont(new Font("Arial", Font.PLAIN, 15));
		frame.getContentPane().add(lblFirstName);
		
		t1 = new JTextField();
		t1.setBounds(159, 93, 181, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblMiddleName = new JLabel("Middle Name :");
		lblMiddleName.setLabelFor(t2);
		lblMiddleName.setBounds(357, 95, 103, 14);
		lblMiddleName.setFont(new Font("Arial", Font.PLAIN, 15));
		frame.getContentPane().add(lblMiddleName);
		
		t2 = new JTextField();
		t2.setBounds(465, 93, 181, 20);
		t2.setColumns(10);
		frame.getContentPane().add(t2);
		
		JLabel lblLastName = new JLabel("Last Name    :");
		lblLastName.setBounds(671, 95, 103, 14);
		lblLastName.setFont(new Font("Arial", Font.PLAIN, 15));
		frame.getContentPane().add(lblLastName);
		
		t3 = new JTextField();
		lblLastName.setLabelFor(t3);
		t3.setBounds(773, 93, 181, 20);
		t3.setColumns(10);
		frame.getContentPane().add(t3);
		
		JLabel lblGender = new JLabel("Gender          :");
		lblGender.setBounds(142, 124, 103, 14);
		lblGender.setFont(new Font("Arial", Font.PLAIN, 15));
		frame.getContentPane().add(lblGender);
		
		JComboBox cb1 = new JComboBox();
		lblGender.setLabelFor(cb1);
		cb1.setBounds(255, 121, 205, 22);
		cb1.setEditable(true);
		cb1.setFont(new Font("Arial", Font.PLAIN, 12));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"---Select from Dropdown Menu---", "Male", "Female", "Others"}));
		frame.getContentPane().add(cb1);
		
		JLabel lblDateOfBirth = new JLabel("DOB(dd/mm/yy) :");
		lblDateOfBirth.setBounds(521, 124, 103, 24);
		lblDateOfBirth.setVerticalAlignment(SwingConstants.TOP);
		lblDateOfBirth.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(lblDateOfBirth);
		
		t4 = new JTextField();
		lblDateOfBirth.setLabelFor(t4);
		t4.setBounds(634, 124, 181, 20);
		t4.setColumns(10);
		frame.getContentPane().add(t4);
		
		JLabel lblAddress = new JLabel("Address         :");
		lblAddress.setBounds(46, 161, 103, 14);
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 15));
		frame.getContentPane().add(lblAddress);
		
		t5 = new JTextField();
		lblAddress.setLabelFor(t5);
		t5.setBounds(159, 159, 800, 20);
		t5.setColumns(10);
		frame.getContentPane().add(t5);
		
		JLabel lblEmailId = new JLabel("Email ID         :");
		lblEmailId.setFont(new Font("Arial", Font.PLAIN, 15));
		lblEmailId.setBounds(46, 192, 103, 14);
		frame.getContentPane().add(lblEmailId);
		
		t6 = new JTextField();
		lblEmailId.setLabelFor(t6);
		t6.setColumns(10);
		t6.setBounds(159, 190, 334, 20);
		frame.getContentPane().add(t6);
		
		JLabel lblContact = new JLabel("Contact           :");
		lblContact.setFont(new Font("Arial", Font.PLAIN, 15));
		lblContact.setBounds(521, 192, 103, 14);
		frame.getContentPane().add(lblContact);
		
		t7 = new JTextField();
		lblContact.setLabelFor(t7);
		t7.setColumns(10);
		t7.setBounds(634, 190, 181, 20);
		frame.getContentPane().add(t7);
		
		//Education
		JLabel lbltitle2 = new JLabel("EDUCATION  :");
		lbltitle2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lbltitle2.setBounds(30, 218, 215, 24);
		frame.getContentPane().add(lbltitle2);
		
		JLabel lblQualification = new JLabel("Qualification    :");
		lblQualification.setFont(new Font("Arial", Font.PLAIN, 15));
		lblQualification.setBounds(46, 253, 103, 14);
		frame.getContentPane().add(lblQualification);
		
		JComboBox cb2 = new JComboBox();
		lblQualification.setLabelFor(cb2);
		cb2.setEditable(true);
		cb2.setModel(new DefaultComboBoxModel(new String[] {"---Select from Dropdown Menu---", "Undergraduate", "Postgarduate"}));
		cb2.setFont(new Font("Arial", Font.PLAIN, 12));
		cb2.setBounds(159, 253, 205, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblInstitute = new JLabel("Institute Name  :");
		lblInstitute.setFont(new Font("Arial", Font.PLAIN, 15));
		lblInstitute.setBounds(429, 253, 115, 14);
		frame.getContentPane().add(lblInstitute);
		
		t8 = new JTextField();
		lblInstitute.setLabelFor(t8);
		t8.setColumns(10);
		t8.setBounds(545, 251, 409, 20);
		frame.getContentPane().add(t8);
		
		JLabel lblBranch = new JLabel("Branch            :");
		lblBranch.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBranch.setBounds(46, 288, 103, 14);
		frame.getContentPane().add(lblBranch);
		
		t9 = new JTextField();
		lblBranch.setLabelFor(t9);
		t9.setColumns(10);
		t9.setBounds(159, 286, 205, 20);
		frame.getContentPane().add(t9);
		
		JLabel lblCgpa = new JLabel("CGPA           :");
		lblCgpa.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCgpa.setBounds(439, 288, 103, 14);
		frame.getContentPane().add(lblCgpa);
		
		t10 = new JTextField();
		lblCgpa.setLabelFor(t10);
		t10.setColumns(10);
		t10.setBounds(545, 286, 92, 20);
		frame.getContentPane().add(t10);
		
		JLabel lblSemester = new JLabel("Semester       :");
		lblSemester.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSemester.setBounds(750, 288, 103, 14);
		frame.getContentPane().add(lblSemester);
		
		t11 = new JTextField();
		lblSemester.setLabelFor(t11);
		t11.setColumns(10);
		t11.setBounds(862, 286, 92, 20);
		frame.getContentPane().add(t11);
		
		JLabel lblSchool = new JLabel("School Name  :");
		lblSchool.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSchool.setBounds(44, 319, 115, 14);
		frame.getContentPane().add(lblSchool);
		
		t12 = new JTextField();
		lblSchool.setLabelFor(t12);
		t12.setColumns(10);
		t12.setBounds(159, 317, 403, 20);
		frame.getContentPane().add(t12);
		
		JLabel lblPercentage = new JLabel("Percentage      :");
		lblPercentage.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPercentage.setBounds(634, 319, 103, 14);
		frame.getContentPane().add(lblPercentage);
		
		t13 = new JTextField();
		lblPercentage.setLabelFor(t13);
		t13.setColumns(10);
		t13.setBounds(750, 317, 92, 20);
		frame.getContentPane().add(t13);
		
		//Work Experience
		JLabel lbltitle3 = new JLabel("WORK EXPERIENCE  :");
		lbltitle3.setFont(new Font("Arial Black", Font.BOLD, 18));
		lbltitle3.setBounds(30, 358, 215, 24);
		frame.getContentPane().add(lbltitle3);
		
		JLabel lblWET = new JLabel("Work Experience & Trainings :");
		lblWET.setLabelFor(t14);
		lblWET.setToolTipText("");
		lblWET.setFont(new Font("Arial", Font.PLAIN, 15));
		lblWET.setBounds(46, 393, 209, 32);
		frame.getContentPane().add(lblWET);
		
		TextArea t14 = new TextArea();
		t14.setSelectionEnd(10);
		t14.setRows(10);
		t14.setBounds(49, 425, 444, 73);
		frame.getContentPane().add(t14);
		
		JLabel lblIP = new JLabel("Internships/Projects :");
		lblIP.setLabelFor(t15);
		lblIP.setToolTipText("");
		lblIP.setFont(new Font("Arial", Font.PLAIN, 15));
		lblIP.setBounds(521, 393, 209, 32);
		frame.getContentPane().add(lblIP);
		
		TextArea t15 = new TextArea();
		t15.setSelectionEnd(10);
		t15.setRows(10);
		t15.setBounds(521, 425, 433, 73);
		frame.getContentPane().add(t15);
		
		JLabel lblObjectives = new JLabel("Career Objective :");
		lblObjectives.setFont(new Font("Arial", Font.PLAIN, 15));
		lblObjectives.setBounds(46, 516, 129, 14);
		frame.getContentPane().add(lblObjectives);
		
		t16 = new JTextField();
		lblObjectives.setLabelFor(t16);
		t16.setColumns(10);
		t16.setBounds(51, 544, 908, 20);
		frame.getContentPane().add(t16);
		
		JLabel lblSkills = new JLabel("Skills               :");
		lblSkills.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSkills.setBounds(49, 587, 103, 14);
		frame.getContentPane().add(lblSkills);
	
		TextArea t17 = new TextArea();
		lblSkills.setLabelFor(t17);
		t17.setSelectionEnd(10);
		t17.setRows(10);
		t17.setBounds(49, 605, 444, 64);
		frame.getContentPane().add(t17);
		
		JLabel lblAchievements = new JLabel("Achievements  :");
		lblAchievements.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAchievements.setBounds(521, 587, 115, 14);
		frame.getContentPane().add(lblAchievements);
		
		TextArea t18 = new TextArea();
		lblAchievements.setLabelFor(t18);
		t18.setSelectionEnd(10);
		t18.setRows(10);
		t18.setBounds(521, 607, 444, 59);
		frame.getContentPane().add(t18);
		
		Button b = new Button("Submit");
		b.setFont(new Font("Arial Black", Font.BOLD, 15));
		b.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getActionCommand() == b.getActionCommand() )
				{
					try
					{
						FileWriter = new FileWriter("D:/RESUMEBUILDER.txt");
						FileWriter.write("\n \t-----------------------------------RESUME------------------------------------");
						FileWriter.write("\n \t 1. PERSONAL INFORMATION");
						JLabel lblFirstName = new JLabel("\nFirst Name:");
						FileWriter.write(lblFirstName.getText() + "  :  " +t1.getText() + "\n");
						JLabel lblMiddleName = new JLabel("Middle Name:");
						FileWriter.write(lblMiddleName.getText() + "  :  " +t2.getText() + "\n");
						JLabel lblLastName = new JLabel("Last Name:");
						FileWriter.write(lblLastName.getText() + "  :  " +t3.getText() + "\n");
						JLabel lblGender = new JLabel("Gender:");
						FileWriter.write(lblGender.getText() + "  :  " + (String)cb1.getSelectedItem() + "\n");
						JLabel lblDateofBirth = new JLabel("Date of Birth:");
						FileWriter.write(lblDateofBirth.getText() + "  :  " +t4.getText() + "\n");
						JLabel lblAddress = new JLabel("Address:");
						FileWriter.write(lblAddress.getText() + "  :  " +t5.getText() + "\n");
						JLabel lblEmailId = new JLabel("Email ID:");
						FileWriter.write(lblEmailId.getText() + "  :  " +t6.getText() + "\n");
						JLabel lblContact = new JLabel("Contact:");
						FileWriter.write(lblContact.getText() + "  :  " +t7.getText() + "\n");
						FileWriter.write("\n \t 2. EDUCATION");
						JLabel lblQualification = new JLabel("\nQualification:");
						FileWriter.write(lblQualification.getText() + "  :  " +(String)cb2.getSelectedItem() + "\n");
						JLabel lblInstitute = new JLabel("Institute Name:");
						FileWriter.write(lblInstitute.getText() + "  :  " +t8.getText() + "\n");
						JLabel lblBranch = new JLabel("Branch:");
						FileWriter.write(lblBranch.getText() + "  :  " +t9.getText() + "\n");
						JLabel lblCgpa = new JLabel("CGPA:");
						FileWriter.write(lblCgpa.getText() + "  :  " +t10.getText() + "\n");
						JLabel lblSemester = new JLabel("Semester:");
						FileWriter.write(lblSemester.getText() + "  :  " +t11.getText() + "\n");
						JLabel lblSchool = new JLabel("School Name:");
						FileWriter.write(lblSchool.getText() + "  :  " +t12.getText() + "\n");
						JLabel lblPercentage = new JLabel("Percentage:");
						FileWriter.write(lblPercentage.getText() + "  :  " +t13.getText() + "\n");
						FileWriter.write("\n \t 3. WORK EXPERIENCE");
						JLabel lblWET = new JLabel("\nWork Experience & Training:");
						FileWriter.write(lblWET.getText() + "  :  \n" +t14.getText() + "\n");
						JLabel lblIP = new JLabel("\nInternships & Projects:");
						FileWriter.write(lblIP.getText() + "  :  \n" +t15.getText() + "\n");
						JLabel lblObjectives = new JLabel("\nCareer Objectives:");
						FileWriter.write(lblObjectives.getText() + "  :  " +t16.getText() + "\n");
						JLabel lblSkills = new JLabel("\nSkills:");
						FileWriter.write(lblSkills.getText() + "  :  \n" +t17.getText() + "\n");
						JLabel lblAcheivements = new JLabel("\nAcheivements:");
						FileWriter.write(lblAcheivements.getText() + "  :  \n" +t18.getText() + "\n");
						
						FileWriter.close();
						JOptionPane.showMessageDialog(null,"Details entered successfully!");
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,e1+"");
					}
				}
				
			}
		});
		b.setActionCommand("Details entered successfully!");
		b.setBounds(465, 704, 70, 22);
		frame.getContentPane().add(b);
	}
}
