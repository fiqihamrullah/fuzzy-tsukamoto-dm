/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dmfuzzytsukamoto;

/**
 *
 * @author TOSHIBA
 */
public class Himpunan 
{
    private Variable var;
    private int idhimp;
    private String nmhimp;
    private int batasbawah,batastengah,batasakhir;
    private int fungsi;

    public Himpunan()
    {
        var = new Variable();
    }

    public void setIdHimp(int idhimp) 
    {
        this.idhimp = idhimp;
    }

    public int getIdHimp() 
    {
        return idhimp;
    }
    

    public void setBatasakhir(int batasakhir) {
        this.batasakhir = batasakhir;
    }

    public void setBatasbawah(int batasbawah) {
        this.batasbawah = batasbawah;
    }

    public void setBatastengah(int batastengah) {
        this.batastengah = batastengah;
    }

    public void setFungsi(int fungsi) {
        this.fungsi = fungsi;
    }

    public int getBatasakhir() {
        return batasakhir;
    }

    public int getBatasbawah() {
        return batasbawah;
    }

    public int getBatastengah() {
        return batastengah;
    }

    public int getFungsi() {
        return fungsi;
    }

    public void setNmhimp(String nmhimp) {
        this.nmhimp = nmhimp;
    }

    public String getNmhimp() {
        return nmhimp;
    }

    public Variable getVar() {
        return var;
    }

    public void setVar(Variable var) {
        this.var = var;
    }

    
    
            
    
}
