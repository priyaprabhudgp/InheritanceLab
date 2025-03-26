public class Candy {
    
    private String name;
    private int cal;
    
    public Candy(String name, int cal){
        this.name = name;
        this.cal = cal;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getCal(){
        return cal;
    }
    
    public void setCal(int cal){
        this.cal = cal;
    }
    
    @Override
    public String toString(){
        return name + " is a candy that has "+cal+" calories.";
    }
   
}
