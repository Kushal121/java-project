
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Kushal_Shrestha)
 * @version (10_Jan_2020)
 */
public class PartTimeStaffHire extends StaffHire
    {
        private int workingHour;
        private int wagesPerHour;
        private String staffName;
        private String joiningDate;
        private String qualification;
        private String appointedBy;
        private String shifts;
        private boolean joined;
        private boolean terminated;
    /*
     * A Constructure is created which accepts six parameters which are vacancyNum, designation, jobType, workingHour, wagesPerHour and shifts
     */
     public PartTimeStaffHire(int vacancyNum, String designation, String jobType, int workingHour, int wagesPerHour, String shifts)
     {
      super(vacancyNum, designation, jobType);
      this.workingHour=workingHour;
      this.wagesPerHour=wagesPerHour;
      this.shifts=shifts;
      this.staffName= "";
      this.joiningDate= "";
      this.qualification= "";
      this.appointedBy= "";
      this.joined=false;
      this.terminated=false;
    }
    /*
     * Calculating incomePerDay
     */
    public int incomePerDay(int incomePerDay){
        incomePerDay=(wagesPerHour*workingHour);
        return incomePerDay;
    }
    
     /*
      *get method is used to call workingHour of PartTimeStaff
      */
     public int getworkingHour(){
         return this.workingHour;
        }  

     /*
      *get method is used to call wagesPerHour of PartTimeStaff
      */
     public int getwagesPerHour(){
         return this.wagesPerHour;
        }

     /*
      *get method is used to call staffName of PartTimeStaff
      */
     public String getstaffName(){
         return this.staffName;
        }

/*
      *get method is used to call joiningDate of PartTimeStaff
      */
public String getjoiningDate(){
    return this.joiningDate;
}

/*
      *get method is used to call qualificationr of PartTimeStaff
      */
public String getqualification(){
    return this.qualification;
}

/*
      *get method is used to call appointedBy of PartTimeStaff
      */
public String getappointedBy(){
    return this.appointedBy;
}

/*
      *get method is used to call shifts of PartTimeStaff
      */
public String getshifts(){
    return this.shifts;
}

/*
      *get method is used to call joined of PartTimeStaff
      */
public boolean getjoined(){
    return this.joined;
}

/*
      *get method is used to call terminated of PartTimeStaff
      */
public boolean getterminated(){
    return this.terminated;
}

/*
 *  a method workingShifts is created
 */
public void setshifts(String newworkingShifts){
    if(joined)
    {
        System.out.println("Not possible to change workingshifs");
    }else
    {
        shifts=newworkingShifts;
    }
}
/*
 * a method HirepartTimeStaff is created whic accepts staffName, joiningDate, qualification and appointedBy
 */
public void HirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
    if(joined)
    {
        System.out.println("The name of the staff is :"+getstaffName());
        System.out.println("The date when the staff had joined is:"+getjoiningDate());
    }else
    {
        this.staffName=staffName;
        this.joiningDate=joiningDate;
        this.qualification=qualification;
        this.appointedBy=appointedBy;
        this.joined=true;
        this.terminated=false;
    }
}
/*
 * a method terminated is created
 */
public void terminateStaff(){
    if(terminated==true)
    {
        System.out.println("The staff is already terminated");
    }else
    {
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
        this.terminated=true;
    }
}
/*
 * a method Display is created to display the required attributes
 */
public void Display(){
    super.Display();
    if(joined)
    {
        System.out.println("The name of staff is: "+getstaffName());
        System.out.println("The wages per hour of the staff is: "+getwagesPerHour());
        System.out.println("The working hour of staff is: "+getworkingHour());
        System.out.println("The date when the staff joined  is: "+getjoiningDate());
        System.out.println("The qualification  of staff is: "+getqualification());
        System.out.println("The staff was appointed by :"+getappointedBy());
        System.out.println("The staff income per day is: "+incomePerDay(2550));
    }
}
}
        
      
    
        
    


