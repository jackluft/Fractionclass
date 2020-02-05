

public class Fraction
{
    //numerator
    private int num;
    //denominator
    private int dom;
   public Fraction(){
       
       this.num = 1;
       this.dom = 4;
       
       
       
    }
    
    public Fraction(int num, int dom){
        if(num <0 && dom < 0){
            num = num*-1;
            dom = dom*-1;
        }
        this.num = num;
        if(dom == 0){
            
            System.out.println("Can't use 0 in denominator");
            this.dom = 1;
            
            
        }else{
            this.dom = dom;
            
            
        }
        

        
        
    }
    
    public Fraction(String full){
        //format from String 2/3
        int mid = full.indexOf('/');
        String n1 = full.substring(0,mid);
        String d1 = full.substring(mid+1);
        this.num = Integer.parseInt(n1);
        int dom = Integer.parseInt(d1);
        
        if(dom == 0){
            System.out.println("Can't use 0 in denominator");
            
        }else{
            this.dom = dom;
            
        }
        
    }
    
    public String toString(){
        
        double n2 = (double) this.num;
        double d2 = (double) this.dom;
        
        return num+"/"+dom+" ="+n2/d2;
        
        
    }
    
    public static String multipy(Fraction f1, Fraction f2){
        int n1 = f1.getNum();
        int d1 = f1.getDom();
        
        int n2 = f2.getNum();
        int d2 = f2.getDom();
        
        int n3 = n1*n2;
        int d3 = d1*d2;
        
        return n3+"/"+d3;
        
        
        
    }
    
    public static String Add(Fraction f1, Fraction f2){
        int n1 = f1.getNum();
        int d1 = f1.getDom();
        
        int n2 = f2.getNum();
        int d2 = f2.getDom();
        
        n1 = n1*d2;
        d1 = d1*d2;
        
        n2 = n2*d1;
        d2 = d2*d1;
        
        int n3 = n1+n2;
        
        Fraction f3 = new Fraction(n3,d2);
        System.out.println(n3+"/"+d2);
        f3.reduce();
        
        
        
        return f3.getNum()+"/"+f3.getDom();
        
    }
    
    public static String Divid(Fraction f1, Fraction f2){
        
        int n1 = f1.getDom();
        int d1 = f1.getNum();
        
        int n2 = f2.getNum();
        int d2 = f2.getDom();
        
        int n3 = n1*n2;
        int d3 = d1*d2;
        
        Fraction f = new Fraction(n3,d3);
        f.reduce();
        
        
        
        return f.getNum()+"/"+f.getDom();
    }
    
    public int getNum(){
        
        return this.num;
        
        
    }
    public int getDom(){
        
        
        return this.dom;
    }
    
    public void reduce(){
        int gcd = gcd(this.num,this.dom);
        
        this.num = this.num/ gcd;
        this.dom = this.dom/gcd;
                
                
          
        
        
        
    }
    
    
     public int gcd(int a, int b) {
        //calculates and returns the GCF between two numbers

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
        {
            return 1;
        }

        while (a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    
    
}
