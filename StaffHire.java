
/**
 * Write a description of class StaffHire here.
 *
 * @author (Kushal_Shrestha)
 * @version (10_Jan_2020)
 */
public class StaffHire
{
    private int vacancyNum;
    private String designation;
    private String jobType;
    /*
     *A constructor StaffHire is created which was three parameters which are VacancyNumber, Designation and jobType
     */
    public StaffHire(int vacancyNum, String designation, String jobType){
    this.vacancyNum=vacancyNum;
    this.designation=designation;
    this.jobType=jobType;
    }
    /*
     *Accessor methods for all the attributes of StaffHire class 
     */
    
    /*
     *get method is called to get number of vacancy of staff
     */
    
 
    public int getvacancyNum(){
        return vacancyNum;
    }
    /*
     *get method is called to get designation
     */
    public String getdesignation(){
        return designation;
    }
    /*
     *get method is called to get type of job
     */
    public String getjobType(){
        return jobType;
    }
    /*
     *set method is called to get number of vacancy of staff
     */
    public void setvacancyNum(int vacancyNum){
        this.vacancyNum=vacancyNum;
    }
    /*
     *set method is called to get designation
     */
    public void setdesignation(String designation){
        this.designation=designation;
    }
    /*
     *set method is called to gettype of job
     */
    public void setjobType(String jobType){
        this.jobType=jobType;
    }
    /*
     * A method display is created whic display VacancyNumber, Designation and JobType
     */
    public void Display(){
        System.out.println("Enter the Num of vacancy available "+this.getvacancyNum());
        System.out.println("Enter your designation "+this.getdesignation());
        System.out.println("Enter the JobType "+this.getjobType());
    }
}
  