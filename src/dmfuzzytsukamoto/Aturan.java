/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dmfuzzytsukamoto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fiqih Amrullah
 */
public class Aturan
{
    public static int DM_RESIKO_RENDAH=0;
    public static int DM_RESIKO_SEDANG=1;
    public static int DM_RESIKO_TINGGI=2;
    private String noaturan;
    private int kep;
    
    private List<Himpunan> premises;

    public Aturan() 
    {
        premises = new ArrayList<Himpunan>();
    }

    public Aturan(String noaturan, int kep) 
    {
        this.noaturan = noaturan;
        this.kep = kep;
    }

    public void setNoAturan(String noaturan) {
        this.noaturan = noaturan;
    }

    public void setKep(int kep) {
        this.kep = kep;
    }

    public int getKeputusan() {
        return kep;
    }

    public String getNoAturan() {
        return noaturan;
    }
    
    
    public void addPremise(Himpunan antecedent){
        premises.add(antecedent);
    }
    
    public int getTotalPremises()
    {
        return premises.size();
    }
    
    public Himpunan getPremise(int idx) {
        return premises.get(idx);
    }
    
    
    
}
