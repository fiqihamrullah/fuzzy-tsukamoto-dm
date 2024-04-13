/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dmfuzzytsukamoto;

import java.util.List;

/**
 *
 * @author Fiqih Amrullah
 */
public class FuzzyTsukamoto 
{
    double defuzz;
    
    private double min(double mb[])
    {
        double n=1;
        
        for(int i=0;i<mb.length;i++)
        {
            if (n > mb[i]) 
            {
                n = mb[i];
            }
        }
        return n;
        
    }
    
    public void processFuzzy(DataPasien dp) 
    {
        DataProcessor datpsr = new DataProcessor();
        List<Aturan> rulebases = datpsr.loadRuleBase();
        double sumalpha=0.0;
        for(int i=0;i<rulebases.size();i++)
        {
            MembershipFunction mfunc= new MembershipFunction();
            Aturan rule = rulebases.get(i);
            System.out.println("No Aturan : " + rule.getNoAturan());
            double mb[] = new double[rule.getTotalPremises()];
            int idxmb=0;
            for(int j=0;j<rule.getTotalPremises();j++)
            {                
                int idvar = rule.getPremise(j).getVar().getIdVar();
                Variable attrpasien = dp.getAttribute(idvar);
                if (attrpasien.getJenisVar()==0) 
                {
                    double nilai = Double.parseDouble(attrpasien.getNilai());
                    mb[idxmb] = mfunc.countMF(nilai, rule.getPremise(j));                   
                }else 
                {
                    if (attrpasien.getNilai().equals(rule.getPremise(j).getNmhimp()))
                    {
                        mb[idxmb]=1;
                    }else{
                        mb[idxmb]=0;
                    }
                }
                 System.out.println("mf :" + mb[idxmb]);
                idxmb++;
            }
            double alphapredikat = min(mb);
            System.out.println("Alpha Predicate :" + alphapredikat);
            sumalpha += alphapredikat; 
            double z=0;
            
            if (rule.getKeputusan()==0) 
            {
              z = mfunc.getCrispLinierTurun(alphapredikat, 0, 0, 0.2);    
            }else if (rule.getKeputusan()==1) 
            {
              z = mfunc.getCrispSegitiga(alphapredikat, 0.1, 0.3, 0.4);    
            }else if (rule.getKeputusan()==2) 
            {
              z = mfunc.getCrispSegitiga(alphapredikat, 0.3, 0.5, 0.6);    
            }else if (rule.getKeputusan()==3) 
            {
              z = mfunc.getCrispSegitiga(alphapredikat, 0.5, 0.7, 0.8);    
            }else if (rule.getKeputusan()==4) 
            {
              z = mfunc.getCrispLinierNaik(alphapredikat, 0.7, 0.9, 1);    
            }
            System.out.println(alphapredikat);
            defuzz += z*alphapredikat;
            
        }
        defuzz /= sumalpha;
    }
    
    public double getDefuzz() 
    {
        return defuzz;
        
    }
}
