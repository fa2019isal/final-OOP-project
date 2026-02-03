import java.time.Year;
public abstract class Person{
    private String name;
    private int birthYear;
    private String phoneNum;
    private int age;

    
    public Person(){}
    
    public Person(String name, int birthYear, String phoneNum){
        this.name = name;
        this.birthYear = birthYear;
        this.phoneNum = phoneNum;
        culAge(birthYear);
    }
    
    public void setBirthYear(int b){
        if(birthYear > 1900 ){
        birthYear = b;
        culAge(birthYear);
        }
        else System.out.println("قيمة غير صالحة للعمر");
        
    }
    
    public abstract void culAge(int birthYear);
    
    public String toString(){
        return "personal information: (name = "+name+", birthYear = "+birthYear+", age = "+age+", phoneNum = "+phoneNum+")";
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

    /**GET Method Propertie birthYear*/
    public int getBirthYear(){
        return this.birthYear;
    }//end method getBirthYear

    /**GET Method Propertie phoneNum*/
    public String getPhoneNum(){
        return this.phoneNum;
    }//end method getPhoneNum

    /**SET Method Propertie phoneNum*/
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }//end method setPhoneNum

    /**GET Method Propertie age*/
    public int getAge(){
        return age;
    }//end method getAge

    /**SET Method Propertie age*/
    public void setAge(int age){
        this.age = age;
    }//end method setAge

    

//End GetterSetterExtension Source Code


}//End class