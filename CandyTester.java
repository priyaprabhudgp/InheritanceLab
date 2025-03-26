public class CandyTester {
    public static void main(String[] args) {
        
        Candy twix = new Candy("Twix",20);
        
        System.out.println(twix+"\n");
        
        Twizzler t = new Twizzler(20,true);
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getCal());
        System.out.println(t.hasStrawberry()+"\n");
        
        MnM m = new MnM(30,false);
        System.out.println(m);
        System.out.println(m.getName());
        System.out.println(m.getCal());
        System.out.println(m.hasPeanut());
        
        
        
        
    }
}
