import java.time.Year;
import java.util.Date;
public class Manger extends Worker implements PurchaseInvoice{
    private double rate;
    
    
    public Manger(){
        rate = 0.0;
    }
    
    public Manger(String name, int birthYear, String phoneNum, double salary, double rate){
        super(name, birthYear, phoneNum, salary);
        setRate(rate);
    }
    
    public void setRate(double r){
        rate = r;
        double s = getSalary();
        setSalary(s + s * rate);
    }
    
    public double getRate(){
        return rate;
    }
    
    public void culAge(int birthYear){
        int currentYear = Year.now().getValue();  
        int ag = currentYear - birthYear;
        if(ag < 30 || ag > 60)System.out.println("العمر  "+ag+" سنة غير مناسب  لهذه الوظيفة ");
        else setAge(ag);
    }
        
    public void cratePurchaseInvoice(Car c, int count , double price){
        Date d2 = new Date();
        c.setPrice(price);
        c.setCarCount(c.getCarCount() + count);
        System.out.println("_____________________________________________________________");
        System.out.println("                                 فاتورة مشتريات              ");
        System.out.println("Date:\n "+ d2);
        System.out.println("prodect name: "+c.getName()+"    quantatiy : "+count+  " price = "+count * c.getPrice() );
        System.out.println("_____________________________________________________________");
    }
    
    
    public String toString(){
        return super.toString() +
        "\nManeger info( rate = "+rate+" )";
    }
    
    
}