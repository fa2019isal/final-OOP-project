public class Product{
    private String name;
    private double price;
    
    
    public Product(){}
    
    public Product(String name,double price){
        this.name=name;
        this.price=price;
        
}

//Start GetterSetterExtension Source Code

    /**GET Method Propertie name*/
    public String getName(){
        return this.name;
    }//end method getName

    /**SET Method Propertie name*/
    public void setName(String name){
        this.name = name;
    }//end method setName

    /**GET Method Propertie price*/
    public double getPrice(){
        return this.price;
    }//end method getPrice

    /**SET Method Propertie price*/
    public void setPrice(double price){
        if (price>=0)
        this.price = price;
    }//end method setPrice
    
    public String toString(){
        return "Product info = (name = "+name+" , price  ="+price+")"; 
    }
    

}
