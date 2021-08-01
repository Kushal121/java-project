import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class INGNepal implements ActionListener
{
   private int vacancyNum, workingHour, wagesPerHour, sal;
   private String designation, jobType, staffName, joiningDate, qualification,
                 appointedBy, shift;
   private boolean joined, terminated;
   private JFrame mainframe;
   private JPanel mainpanel;
   private Font mainfont, font;
   private JLabel lblheader1, lblheader2, lblftl1, lblftl2, lblftl3, lblftl4, lblftl5, lblftl6, 
                  lblftl7, lblftl8, lblftl9, lblftl10, lblptl1, lblptl2, lblptl3, lblptl4, lblptl5, 
                  lblptl6, lblptl7, lblptl8, lblptl9, lblptl10, lblptl11, lblptTerminate1;
   private JTextField txtftt1, txtftt2, txtftt3, txtftt4, txtftt5, txtftt6, txtftt7, txtftt8, txtftt9, txtftt10,
                 txtptt1, txtptt2, txtptt3, txtptt4, txtptt5, txtptt6, txtptt7, txtptt8, txtptt9, txtptt10,
                 txtptt11, txtptTerminate2;
   private JButton btnftb1, btnftb2, btnptb1, btnptb2, btnptb3, db, cb;
   ArrayList<StaffHire> arrayL = new ArrayList<StaffHire>();
   public void staffHire1(){
       mainframe = new JFrame("INGNepal");
       mainframe.setBounds(500, 25, 1000, 850);
       mainframe.setResizable(false);
       mainpanel = new JPanel();
       mainpanel.setLayout(null);       
       
       //Full Time Staff Hire
       lblheader1 = new JLabel("Full Time Staff");
       lblheader1.setBounds(410, 0, 500, 100);
       mainfont = new Font("Arial",Font.BOLD, 22);
       lblheader1.setFont(mainfont);
       mainpanel.add(lblheader1);
       
       lblftl1 = new JLabel("Vacancy Number:");
       lblftl1.setBounds(20, 70, 107, 56);
       txtftt1 = new JTextField();
       txtftt1.setBounds(130, 80, 162, 31);
       mainpanel.add(lblftl1);
       mainpanel.add(txtftt1);
       
       lblftl2 = new JLabel("Designation:");
       lblftl2.setBounds(370, 70, 107, 56);
       txtftt2 = new JTextField();
       txtftt2.setBounds(450, 80, 162, 31);
       mainpanel.add(lblftl2);
       mainpanel.add(txtftt2);
       
       lblftl3 = new JLabel("Job Type:");
       lblftl3.setBounds(720, 70, 107, 56);
       txtftt3 = new JTextField();
       txtftt3.setBounds(790, 80, 162, 31);
       mainpanel.add(txtftt3);
       mainpanel.add(lblftl3);
       
       lblftl4 = new JLabel("sal:");
       lblftl4.setBounds(80, 120, 107, 56);
       txtftt4 = new JTextField();
       txtftt4.setBounds(130, 130, 162, 31);
       mainpanel.add(lblftl4);
       mainpanel.add(txtftt4);
       
       lblftl5 = new JLabel("Working Hours:");
       lblftl5.setBounds(350, 120, 107, 56);
       txtftt5 = new JTextField();
       txtftt5.setBounds(450, 130, 162, 31);
       mainpanel.add(lblftl5);
       mainpanel.add(txtftt5);
       
       btnftb1 = new JButton("Add Vacancy");
       btnftb1.setEnabled(true);
       btnftb1.setBounds(447, 184 , 121, 28);
       mainpanel.add(btnftb1);
       btnftb1.addActionListener(this);
       
       lblftl6 = new JLabel("Vacancy Number:");
       lblftl6.setBounds(20, 230, 107, 56);
       txtftt6 = new JTextField();
       txtftt6.setBounds(130, 240, 162, 31);
       mainpanel.add(lblftl6);
       mainpanel.add(txtftt6);
       
       lblftl7 = new JLabel("Staff Name:");
       lblftl7.setBounds(372, 230, 107, 56);
       txtftt7 = new JTextField();
       txtftt7.setBounds(450, 240, 162, 31);
       mainpanel.add(lblftl7);
       mainpanel.add(txtftt7);
       
       lblftl8 = new JLabel("Joining Date:");
       lblftl8.setBounds(703, 230, 107, 56);
       txtftt8 = new JTextField();
       txtftt8.setBounds(790, 240, 162, 31);
       mainpanel.add(lblftl8);
       mainpanel.add(txtftt8);
       
       lblftl9 = new JLabel("Qualification:");
       lblftl9.setBounds(45, 280, 107, 56);
       txtftt9 = new JTextField();
       txtftt9.setBounds(130, 290, 162, 31);
       mainpanel.add(txtftt9);
       mainpanel.add(lblftl9);
       
       lblftl10 = new JLabel("Appointed By:");
       lblftl10.setBounds(358, 280, 107, 56);
       txtftt10 = new JTextField();
       txtftt10.setBounds(450, 290, 162, 31);
       mainpanel.add(lblftl10);
       mainpanel.add(txtftt10);
       
       btnftb2 = new JButton("Appoint Full Time Staff");
       btnftb2.setEnabled(true);
       btnftb2.setBounds(431, 338, 163, 28);
       mainpanel.add(btnftb2);
       btnftb2.addActionListener(this);
       
       //Part Time Staff Hire
       lblheader2 = new JLabel("Part Time Staff");
       lblheader2.setBounds(410, 45, 1000, 700);
       font = new Font("Arial",Font.BOLD,22);
       lblheader2.setFont(font);
       mainpanel.add(lblheader2);
       
       lblptl1 = new JLabel("Vacancy Number:");
       lblptl1.setBounds(20, 410, 107, 56);
       txtptt1 = new JTextField();
       txtptt1.setBounds(130, 420, 162, 31);
       mainpanel.add(lblptl1);
       mainpanel.add(txtptt1);
       
       lblptl2 = new JLabel("Designation:");
       lblptl2.setBounds(370, 410, 107, 56);
       txtptt2 = new JTextField();
       txtptt2.setBounds(450, 420, 162, 31);
       mainpanel.add(lblptl2);
       mainpanel.add(txtptt2);
       
       lblptl3 = new JLabel("Job Type:");
       lblptl3.setBounds(720, 410, 107, 56);
       txtptt3 = new JTextField();
       txtptt3.setBounds(790, 420, 162, 31);
       mainpanel.add(lblptl3);
       mainpanel.add(txtptt3);
       
       lblptl4 = new JLabel("Working Hours:");
       lblptl4.setBounds(30, 460, 107, 56);
       txtptt4 = new JTextField();
       txtptt4.setBounds(130, 470, 162, 31);
       mainpanel.add(lblptl4);
       mainpanel.add(txtptt4);
       
       lblptl5 = new JLabel("Wages Per Hour:");
       lblptl5.setBounds(345, 460, 107, 56);
       txtptt5 = new JTextField();
       txtptt5.setBounds(450, 470, 162, 31);
       mainpanel.add(lblptl5);
       mainpanel.add(txtptt5);
       
       lblptl6 = new JLabel("Shift:");
       lblptl6.setBounds(750, 460, 107, 56);
       txtptt6 = new JTextField();
       txtptt6.setBounds(790, 470, 162, 31);
       mainpanel.add(lblptl6);
       mainpanel.add(txtptt6);
       
       btnptb1 = new JButton("Add Vacancy");
       btnptb1.setEnabled(true);
       btnptb1.setBounds(447, 510, 121, 28);
       mainpanel.add(btnptb1);
       btnptb1.addActionListener(this);
       
       lblptl7 = new JLabel("Vacancy Number:");
       lblptl7.setBounds(20, 560, 107, 56);
       txtptt7 = new JTextField();
       txtptt7.setBounds(130, 570, 162, 31);
       mainpanel.add(lblptl7);
       mainpanel.add(txtptt7);
       
       lblptl8 = new JLabel("Staff Name:");
       lblptl8.setBounds(370, 560, 107, 56);
       txtptt8 = new JTextField();
       txtptt8.setBounds(450, 570, 162, 31);
       mainpanel.add(lblptl8);
       mainpanel.add(txtptt8);
       
       lblptl9 = new JLabel("Joining Date:");
       lblptl9.setBounds(707, 560, 107, 56);
       txtptt9 = new JTextField();
       txtptt9.setBounds(790, 570, 162, 31);
       mainpanel.add(lblptl9);
       mainpanel.add(txtptt9);
       
       lblptl10 = new JLabel("Qualification:");
       lblptl10.setBounds(43, 610, 107, 56);
       txtptt10 = new JTextField();
       txtptt10.setBounds(130, 620, 162, 31);
       mainpanel.add(lblptl10);
       mainpanel.add(txtptt10);
       
       lblptl11 = new JLabel("Appointed By:");
       lblptl11.setBounds(357, 610, 107, 56);
       txtptt11 = new JTextField();
       txtptt11.setBounds(450, 620, 162, 31);
       mainpanel.add(lblptl11);
       mainpanel.add(txtptt11);
       
       btnptb2 = new JButton("Appoint Part Time Staff");
       btnptb2.setEnabled(true);
       btnptb2.setBounds(431, 660, 167, 28);
       mainpanel.add(btnptb2);
       btnptb2.addActionListener(this);
       
       lblptTerminate1 = new JLabel("Vacancy Number:");
       lblptTerminate1.setBounds(20, 687, 107, 56);
       txtptTerminate2 = new JTextField();
       txtptTerminate2.setBounds(130, 700, 162, 31);
       mainpanel.add(lblptTerminate1);
       mainpanel.add(txtptTerminate2);
       
       btnptb3 = new JButton("Terminate");
       btnptb3.setEnabled(true);
       btnptb3.setBounds(300, 703, 100, 28);
       mainpanel.add(btnptb3);
       btnptb3.addActionListener(this);
       
       db = new JButton("Display");
       db.setEnabled(true);
       db.setBounds(640, 715, 140, 60);
       mainpanel.add(db);
       db.addActionListener(this);
       
       cb = new JButton("Clear");
       cb.setEnabled(true);
       cb.setBounds(810, 715, 140, 60);
       mainpanel.add(cb);
       cb.addActionListener(this);
       
       mainframe.setVisible(true);       
       mainframe.add(mainpanel);
       mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent ae){
       //Add Vacancy Full Time
       if(ae.getSource() == btnftb1){
           try{
               vacancyNum = Integer.parseInt(txtftt1.getText());
               designation = txtftt2.getText();
               jobType = txtftt3.getText();
               sal = Integer.parseInt(txtftt4.getText());
               workingHour = Integer.parseInt(txtftt5.getText());
               boolean isDuplicateVacNum1 = false;
               for(StaffHire sh1:arrayL){
                    if(sh1.getvacancyNum() == vacancyNum){
                       isDuplicateVacNum1 = true;
                       break;
                    }
                }
               if(isDuplicateVacNum1 == false){
                    FullTimeStaffHire ft1 = new FullTimeStaffHire(vacancyNum, designation, jobType, sal, workingHour);
                    arrayL.add(ft1);
                    JOptionPane.showMessageDialog(mainframe,"Values Successfully Added");
                }
               else{
                    JOptionPane.showMessageDialog(mainframe,"The Vacancy Number that you have inserted is already on the list");
                }
            }
           catch(Exception e){
               JOptionPane.showMessageDialog(mainframe,"Invalid Entry");
            }
        }
        //Appoint Full Time
        if(ae.getSource() == btnftb2){
            vacancyNum = Integer.parseInt(txtftt6.getText());
            staffName = txtftt7.getText();
            joiningDate = txtftt8.getText();
           appointedBy = txtftt10.getText();
            qualification = txtftt9.getText();
            boolean isDuplicateVacNum2 = false;
            for(StaffHire sh2:arrayL){
                if(sh2 instanceof FullTimeStaffHire){
                    if(sh2.getvacancyNum() == vacancyNum){
                        FullTimeStaffHire ft2 = (FullTimeStaffHire) sh2;
                        System.out.println(ft2.getjoined());
                        if(ft2.getjoined() == false){
                            ft2.HireFullTimeStaff(staffName, joiningDate, qualification,appointedBy);
                            JOptionPane.showMessageDialog(mainframe,"Values Successfully Added");
                            break;
                        }                
                        else if(ft2.getjoined()==true){
                            JOptionPane.showMessageDialog(mainframe,"The Staff that you have entered has already been appointed");
                            break;
                        }                  
                    }                     
                }
                else{
                    JOptionPane.showMessageDialog(mainframe,"Invalid Entry");
                    break;
                }
            }
        }
        //Add Vacancy Part Time
        if(ae.getSource() == btnptb1){
            try{
                vacancyNum = Integer.parseInt(txtptt1.getText());
                designation = txtptt2.getText();
                jobType = txtptt3.getText();
                workingHour = Integer.parseInt(txtptt4.getText());
                wagesPerHour = Integer.parseInt(txtptt5.getText());
                shift = txtptt6.getText();
                boolean isDuplicateVacNum1 = false;
                for(StaffHire sh1:arrayL){
                    if(sh1.getvacancyNum() == vacancyNum){
                        isDuplicateVacNum1 = true;
                        break;
                    }
                }
                if(isDuplicateVacNum1 == false){
                    PartTimeStaffHire pt1 = new PartTimeStaffHire(vacancyNum, designation, jobType, workingHour, wagesPerHour, shift);
                    arrayL.add(pt1);
                    JOptionPane.showMessageDialog(mainframe,"Values Successfully Added");
                }
                else{
                    JOptionPane.showMessageDialog(mainframe,"The Vacancy Number that you have inserted is already on the list");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(mainframe,"Invalid Entry");
            }
        }
        //Appoint Part Time
        if(ae.getSource() == btnptb2){
            vacancyNum = Integer.parseInt(txtptt7.getText());
            staffName = txtptt8.getText();
            joiningDate = txtptt9.getText();
            qualification = txtptt10.getText();
           appointedBy = txtptt11.getText();
            boolean isDuplicateVacNum2 = false;
            for(StaffHire sh2:arrayL){
                if(sh2 instanceof PartTimeStaffHire){
                    if(sh2.getvacancyNum() == vacancyNum){
                        PartTimeStaffHire pt2 = (PartTimeStaffHire) sh2;
                        System.out.println(pt2.getjoined());
                        if(pt2.getjoined() == false){
                            pt2.HirePartTimeStaff(staffName, joiningDate, qualification,appointedBy);
                            JOptionPane.showMessageDialog(mainframe,"Values Successfully Added");
                            break;
                        }
                        else if(pt2.getjoined() == true){
                            JOptionPane.showMessageDialog(mainframe,"The Staff that you have entered has already been appointed");
                            break;
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(mainframe,"Invalid Entry");
                    break;
                }
            }
        }
            //Terminate Part Time
        if(ae.getSource() == btnptb3){
            vacancyNum = Integer.parseInt(txtptTerminate2.getText());
            for(StaffHire sh2:arrayL){
                if(sh2.getvacancyNum() == vacancyNum){
                    if(sh2 instanceof PartTimeStaffHire){
                        PartTimeStaffHire pt3 = (PartTimeStaffHire) sh2;
                        if(pt3.getterminated() == false){
                            pt3.terminateStaff();
                            JOptionPane.showMessageDialog(mainframe,"Termination Successfull");
                            break;
                        }
                        else if(pt3.getterminated() == true){
                            JOptionPane.showMessageDialog(mainframe,"This staff has already been terminated");
                            break;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(mainframe,"Invalid Entry");
                        break;
                    }
                }
            }
        }
        //Display Button
        if(ae.getSource() == db){
            for(StaffHire sh2:arrayL){
                if(sh2 instanceof FullTimeStaffHire){
                    FullTimeStaffHire dis = (FullTimeStaffHire) sh2;
                    dis.Display();
                }
                else if(sh2 instanceof PartTimeStaffHire){
                    PartTimeStaffHire dis = (PartTimeStaffHire) sh2;
                    dis.Display();
                }
            }
        }
        //Clear Button
        if(ae.getSource() == cb){
            txtftt1.setText("");
            txtftt2.setText("");
            txtftt3.setText("");
            txtftt4.setText("");
            txtftt5.setText("");
            txtftt6.setText("");
            txtftt7.setText("");
            txtftt8.setText("");
            txtftt9.setText("");
            txtftt10.setText("");
            txtptt1.setText("");
            txtptt2.setText("");
            txtptt3.setText("");
            txtptt4.setText("");
            txtptt5.setText("");
            txtptt6.setText("");
            txtptt7.setText("");
            txtptt8.setText("");
            txtptt9.setText("");
            txtptt10.setText("");
            txtptt11.setText("");
            txtptTerminate2.setText("");
        }
    }
    public static void main(String[]args){
        INGNepal a = new INGNepal();
        a.staffHire1();
    }
}
