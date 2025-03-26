public class Twizzler extends Candy{
    
    private boolean strawberry;
    
    public Twizzler(int cal, boolean strawberry){
        super("Twizzler",cal);
        this.strawberry = strawberry;
    }
    
    public boolean hasStrawberry(){
        return strawberry;
    }
    
    public void setStrawberry(boolean s){
        strawberry = s;
    }
    
    @Override
    public String toString(){
        String s = "";
        if(hasStrawberry()){
            s += "strawberry-flavored.";
        } else{
            s+= "not stawberry-flavored.";
        }
        
        return  "This Twizzler has "+super.getCal()+" calories, and is "+s;
    }
}
