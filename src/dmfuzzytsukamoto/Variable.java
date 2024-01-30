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
public class Variable {
    private int idvar;
    private String nmvar;
    private int jenisvar;
    private List<Himpunan> listhimpunan;
    private String nilai;

    public Variable() {
        listhimpunan = new ArrayList<Himpunan>();
    }

    public void setIdVar(int idvar) 
    {
        this.idvar = idvar;
    }

    public void setNmVar(String nmvar)
    {
        this.nmvar = nmvar;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getNilai() {
        return nilai;
    }
    
    

    public void setJenisVar(int jenisvar) 
    {
        this.jenisvar = jenisvar;
    }

    public int getIdVar() {
        return idvar;
    }

    public String getNmVar() {
        return nmvar;
    }

    public int getJenisVar() {
        return jenisvar;
    }
    
    public void AddHimpunan (Himpunan himp)
    {
        listhimpunan.add(himp);
    }
    
    public Himpunan getHimpunan(int idx)
    {
        return listhimpunan.get(idx);
    }
    
    public int getTotalHimpunan()
    {
        return listhimpunan.size();
    }
    
    
    
    
    
}
