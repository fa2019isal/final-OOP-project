public class Car extends Product{
    private String model;
    private int MaxSpeed;
    private static int carCount=0;
    private Engine engine;
    
    public Car(){}
    
    public Car(String name,double price,String model,int MaxSpeed , Engine engine){
        super(name,price);
        this.model=model;
        this.MaxSpeed=MaxSpeed;
        this.engine = engine;
        carCount++;
    }
    

//Start GetterSetterExtension Source Code

    /**GET Method Propertie model*/
    public String getModel(){
        return this.model;
    }//end method getModel
    
    public int getMaxSpeed(){
        return this.MaxSpeed;
    }//end method getMaxSpeed
    
    public int getCarCount(){
        return this.carCount;
    }//end method getCarCount

    /**SET Method Propertie model*/
    public void setModel(String model){
        this.model = model;
    }//end method setModel

    /**SET Method Propertie MaxSpeed*/
    public void setMaxSpeed(int MaxSpeed){
        this.MaxSpeed = MaxSpeed;
    }//end method setMaxSpeed

    /**SET Method Propertie carCount*/
    public void setCarCount(int carCount){
        this.carCount = carCount;
    }//end method setCarCount
    
     public String toString(){
        return super.toString()+"\n"+
        "Car info = (model = "+model+", MaxSpeed = " +MaxSpeed+" ,carCount ="+carCount+" ,\n"+engine+")";
    }

//End GetterSetterExtension Source Code



//Start GetterSetterExtension Source Code

    /**SET Method Propertie engine*/
    public void setEngine(Engine engine){
        this.engine = engine;
    }//end method setEngine

//End GetterSetterExtension Source Code



//Start GetterSetterExtension Source Code

    /**GET Method Propertie engine*/
    public Engine getEngine(){
        return this.engine;
    }//end method getEngine

//End GetterSetterExtension Source Code


}//End class