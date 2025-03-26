public class MnM extends Candy{
    
    private boolean peanut;
    
    public MnM(int cal, boolean peanut){
        super("M&M",cal);
        this.peanut = peanut;
    }
    
    public boolean hasPeanut(){
        return peanut;
    }
    
    public void setPeanut(boolean p){
        peanut = p;
    }
    
    @Override
    public String toString(){
        String p = "";
        if(peanut){
            p += "has peanuts";
        }else{
            p += "doesn't have peanuts";
        }
        
        return  "This is an M&M that has "+super.getCal()+" calories and that "+ p;
    }
}
