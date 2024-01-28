/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dmfuzzytsukamoto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public class DataPasien 
{
    private List<Variable> listattribut;

    public DataPasien() 
    {
        listattribut = new  ArrayList<Variable>();
    }
    
    public void AddAtribute(Variable var)
    {
        listattribut.add(var);
    }
    
    public void setAttributeValue(int idx,String nilai)
    {
        listattribut.get(idx).setNilai(nilai);
    }
    
    public Variable getAttribute(int idvar) 
    {
        Variable vartemp=null;
        for(int i=0;i<listattribut.size();i++)
        {
           if (listattribut.get(i).getIdVar()==idvar)
           {
               vartemp = listattribut.get(i);
           }
        }
        return vartemp;
    }
    
    
    
}
