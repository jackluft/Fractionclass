

public class Fraction2
{
    private int n;
    private int d;
    public Fraction2(){
        
        this.n = 1;
        this.d = 4;
        
        
    }
    public Fraction2(int n, int d){
        this.n = n;
        if(d == 0){
            System.out.println("Can't use zero for dimoniator");
            this.d = 1;
        }else{
            this.d = d; 
            
            
        }
        
        
    }
    
    public void Add(Fraction2 f1){
        
        int n1 = f1.getN();
        int d1 = f1.getD();
        
        this.n = this.d*n1;
        this.d = this.d*d1;
        
        
        
    }
    public int getN(){
        return this.n;
        
        
    }
    public int getD(){
        
        
        return this.d;
        
    }
    public String toString(){
        
        return this.n+"/"+this.d;
        
        
    }
}
