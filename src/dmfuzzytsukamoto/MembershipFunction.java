/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dmfuzzytsukamoto;

/**
 *
 * @author Fiqih Amrullah
 */
public class MembershipFunction 
{

    public MembershipFunction()
    {
        
    }
    
    
    public double countMF(double x, Himpunan antecedent)
    {
        double mf = 0.0;
        if (antecedent.getFungsi()==0) {
          //  System.out.println("Linier Nurun");
            mf = linierTurun(x, antecedent.getBatasbawah(), antecedent.getBatasakhir());
        }else if (antecedent.getFungsi()==1) 
        {
            mf = segitiga(x, antecedent.getBatasbawah(), antecedent.getBatastengah(),antecedent.getBatasakhir());
        }else if (antecedent.getFungsi()==2) 
        {
            mf = linierNaik(x, antecedent.getBatasbawah(),  antecedent.getBatasakhir());
        }
        return mf;
    }
    
    public double getCrispLinierTurun(double md,double a,double b,double c) 
    {
        return  c - ((c-a) *md);
        
    }
    
    public double getCrispLinierNaik(double md,double a,double b,double c) 
    {
          
        return  a + ((c-a) *md);
        
    }
    
     public double getCrispSegitiga(double md,double a,double b,double c) 
    {
        double lt = getCrispLinierTurun(md, a, b, c);
        double ln = getCrispLinierNaik(md, a, b, c);
        return  Math.max(lt, ln);
        
    }
    
    private double linierTurun(double x,int a, int b)
    {
        double hasil = 0.0;   
        if (x <=a) 
        {
            hasil =1.0;
        }else if (x >a && x<b ) 
        {     
           
          hasil =((double)(b -x))/(b-a);
        //   System.out.println("masuk " + (hasil));
        }else if (x >= b)
        {
          hasil = 0;
        }
        return hasil;
    }
    
    
     private double segitiga(double x,int a, int b,int c)
    {
         double hasil = 0.0;
         if (x <=a || x>=c) 
         {
            hasil =0;
         }else if (x >a && x<=b )
         {
           hasil = ((double)(x-a))/(b-a);
         }else if (x > b && x<=c) 
         {
          hasil = ((double)(c-x))/(c-b) ;
         }
        return hasil;
    }
           
    
     private double linierNaik(double x,int a, int b)
     {
         double hasil = 0.0;
         if (x <=a) 
         {
          hasil =0;
        }else if (x >a && x<b ) 
        {
         hasil = ((double)(x-a))/(b-a);
         }else if (x >= b) 
         {
          hasil =1;
         }
         return hasil;
     }
     
     
}
