/*  
    Abstraction :
    To Implementation Abstraction we use Interface & Abstract class.


    Abstract is a Practice in OOP that help us Expose Relavant Functionalities and Hide the Unnecessary Ones.
 * 
 */
interface HOD{
    void defineClassSchedule();
    void prepareTeamReport();
    void allowLeave();
}

interface Professor{
    void takeClasses();
    void markAttendence();
    void setExamPaper();
}

public class Abstraction implements HOD,Professor{
    public static void main(String[] args) {
        HOD hodObject = new Abstraction();
        Professor pObj = new Abstraction();
    }
    @Override
    public void takeClasses(){
        
    }
    @Override
    public void allowLeave() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void defineClassSchedule() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void prepareTeamReport() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void markAttendence() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setExamPaper() {
        // TODO Auto-generated method stub
        
    }
}
