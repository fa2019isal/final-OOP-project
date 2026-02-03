public class Engine{
    private String type;
    private int horsePower;
    
    public Engine(){}
    
    public Engine(String type, int horsePower){
        this.type = type;
        this.horsePower = horsePower;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie type*/
    public String getType(){
        return this.type;
    }//end method getType

    /**SET Method Propertie type*/
    public void setType(String type){
        this.type = type;
    }//end method setType

    /**GET Method Propertie horsePower*/
    public int getHorsePower(){
        return this.horsePower;
    }//end method getHorsePower

    /**SET Method Propertie horsePower*/
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }//end method setHorsePower

//End GetterSetterExtension Source Code
    public void start(){
        System.out.println("Engine is startting.....");
    }
    
    public void stop(){
        System.out.println("Engine is stopping.....");
    }

    public String toString(){
        return "Engine = (type = "+type+",horsePower = "+horsePower+")";
    }






}//End class