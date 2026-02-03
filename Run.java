import java.util.Date;
public class Run{
    public static void main(String []args){
    Engine e1 = new Engine("V8",500);
    Car c1 = new Car("BMW",7000,"1995",220,e1);
    
    Manger m1 = new Manger("Ali",1995,"096630329",2000,0.1);
    System.out.println(m1);
    m1.cratePurchaseInvoice(c1, 5, 10000);
    System.out.println("عدد السيارات في المعرض = "+c1.getCarCount());
    e1.stop();
    
        
    Worker w1 = new Worker("Ahmed",2000,"092202000",1000);
    System.out.println(w1);
    w1.crateSalesInvoice(c1,1);
    System.out.println("عدد السيارات في المعرض = "+c1.getCarCount());
    e1.start();

    
      
      

    }
}