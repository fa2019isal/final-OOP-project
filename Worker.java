import java.time.Year;
import java.util.Date;
public class Worker extends Person implements SalesInvoice {
    private double salary;
    private static int counter = 0;
    private String id;
    
    public Worker(){}
    
    public Worker(String name ,int birthYear ,String phoneNum ,double salary){
        super(name, birthYear, phoneNum); 
        this.salary = salary ;
        counter++;
        id = "0000"+counter; 
    }
 
    public void culAge(int birthYear){
        int currentYear = Year.now().getValue(); 
        int a = currentYear - birthYear;
        if(a < 15 || a > 60)System.out.println("العمر  "+a+" سنة غير مناسب  لهذه الوظيفة ");
        else setAge(a);
    }
    
    public void crateSalesInvoice(Car c, int count){
        if(c.getCarCount() >= count) {
            Date d1 = new Date();
            c.setCarCount(c.getCarCount() - count);
            System.out.println("_____________________________________________________________");
            System.out.println("                                 فاتورة مبيعات              ");
            System.out.println("Date:\n "+ d1);
            System.out.println("prodect name: "+c.getName()+"    quantatiy : "+count+"   price = "+count * c.getPrice() );
            System.out.println("_____________________________________________________________");
        }
        else System.out.println("عدد السيارات غير كافي");
    }
    
    public String toString(){
        return super.toString()+"\n"+
        "Worker information (salary = "+salary+", counetr = "+counter+", id = "+id+" )";
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie salary*/
    public double getSalary(){
        return this.salary;
    }//end method getSalary

    /**SET Method Propertie salary*/
    public void setSalary(double salary){
        this.salary = salary;
    }//end method setSalary

    /**GET Method Propertie counter*/
    public int getCounter(){
        return this.counter;
    }//end method getCounter

    /**SET Method Propertie counter*/
    public void setCounter(int counter){
        this.counter = counter;
    }//end method setCounter

    /**GET Method Propertie id*/
    public String getId(){
        return this.id;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(String id){
        this.id = id;
    }//end method setId

//End GetterSetterExtension Source Code


}//End class