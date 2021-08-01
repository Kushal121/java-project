
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (Kushal_Shrestha)
 * @version (10 Jan 2020)
 */
     public class FullTimeStaffHire extends StaffHire
    { 
               private int sal;
               private int workingHour;
               private String staffName;
               private String joiningDate;
               private String qualification;
               private String appointedBy;
               private boolean joined;
               /*
                *    Creating constructor which accepts five parameters and they are VacancyNumber, Designation, JobType, Salary and WorkingHour
                */
       
       public FullTimeStaffHire( int vacancyNum, String designation, String jobType, int sal, int workingHour){
           super(vacancyNum, designation, jobType); //inheriting VacancyNumber, Designation and JobType from parentclass StaffHire
           this.sal=sal;
           this.workingHour=workingHour;
           this.staffName="";
           this.joiningDate="";
           this.qualification="";
           this.appointedBy="";
           this.joined=false;
        }
        /*
         * get method is used to call salary of FullTimeStaff
         */
        public int getsal(){
            return sal;
        }
        /*
         * get method is used to call workingHour of FullTimeStaff
         */
        
        public int getworkingHour(){
            return workingHour;
        }
        /*
         * get method is used to call staffNameof FullTimeStaff
         */
        
        public String getstaffName(){
            return staffName;
        }
        /*
         * get method is used to call joiningDateof FullTimeStaff
         */
        public String getjoiningDate(){
            return joiningDate;
        }
        /*
         * get method is used to call qualification of FullTimeStaff
         */
        public String getqualification(){
            return qualification;
        }
     
        /*
         * get method is used to call appointedBy of FullTimeStaff
         */
        public String getappointedBy(){
            return appointedBy;
        }
        /*
         * get method is used to call joined of FullTimeStaff
         */
        public boolean getjoined(){
            return joined;
        }
        
        /*
         * Creating a method sal is created whic accepts parameter newSalary
         */
        public void setsal(int newSal){
            if(this.joined){
                System.out.println("It is not possible to change salary because the Staff has already joined");
              }
               else{
                   this.sal=newSal;
                }
            }
            /*
             * Creating setter for workingHour
             */
            public void setworkingHour(int newworkingHour)
            {
                this.workingHour=newworkingHour;
            }
            /*
             * Creating a method for hiring staff
             */
            public void HireFullTimeStaff( String staffName, String joiningDate, String qualification, String appointedBy){
                if(joined==false){
                    this.staffName=staffName;
                    this.joiningDate=joiningDate;
                    this.qualification=qualification;
                    this.appointedBy=appointedBy;
                    joined=true;
                    System.out.println(staffName + "will be joining on" + joiningDate);
                }
                else{
                    System.out.println(staffName + "has already been appointed at" + joiningDate);
                }
            }
            /*
             * Creating a method to display vacancyNum, designation, jobType, staffName, sal, workingHour, joiningDate, qualification and appointedBy
             */
            public void Display(){
                super.Display();
                if(joined==true){
                    System.out.println("Enter the Number of salary" +sal);
                    System.out.println("Enter the Number of working hour"+workingHour);
                    System.out.println("Enter the name of Staff name" +staffName);
                    System.out.println("Enter the JoiningDate" +joiningDate);
                    System.out.println("Enter the Qualification" +qualification);
                    System.out.println("Enter AppointedBy" +appointedBy);
                    System.out.println("Enter Joined" +joined);
                }
            }
            }
                    
               
            

 
 