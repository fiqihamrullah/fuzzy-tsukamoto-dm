/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dmfuzzytsukamoto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public class DataProcessor {
    QueryExecutor qe;

    public DataProcessor() 
    {
        
    }
    
    public List<Variable> loadListVariable()
    {
        List<Variable > listvariable = new ArrayList<Variable>();
        String sql = "select * from variable";
        QueryExecutor qe = new QueryExecutor();
        ResultSet rs = qe.ExecuteQuery(sql);
        listvariable.clear();
        try
        {
         while (rs.next()) 
         {
               Variable var = new Variable();
               var.setIdVar(rs.getInt("id_var"));
               var.setNmVar(rs.getString("nm_var"));
               var.setJenisVar(rs.getInt("jenis_var"));
               listvariable.add(var);
         }
         }catch(SQLException ex) 
         {
            System.out.println("Error : " + ex.getMessage());
         }
        return listvariable;
    }
    
      public List<Himpunan> loadListHimpunan(int idvar)
    {
        List<Himpunan > listhimp = new ArrayList<Himpunan>();
        String sql = "select * from himpunan where id_var=" + idvar;
        QueryExecutor qe = new QueryExecutor();
        ResultSet rs = qe.ExecuteQuery(sql);
        listhimp.clear();
        try
        {
         while (rs.next()) 
         {
               Himpunan himp = new Himpunan();
               himp.setIdHimp(rs.getInt("id_himp"));
               himp.getVar().setIdVar(rs.getInt("id_var"));
               himp.setNmhimp(rs.getString("nama_himp"));
               himp.setBatasbawah(rs.getInt("batasbawah"));
               himp.setBatastengah(rs.getInt("batastengah"));
               himp.setBatasakhir(rs.getInt("batasakhir"));
               himp.setFungsi(rs.getInt("fungsi"));
               listhimp.add(himp);
         }
         }catch(SQLException ex) 
         {
            System.out.println("Error : " + ex.getMessage());
         }
        return listhimp;
    }
      
       public List<Aturan> loadListAturan()
    {
        List<Aturan > listaturan = new ArrayList<Aturan>();
        String sql = "select * from aturan";
        QueryExecutor qe = new QueryExecutor();
        ResultSet rs = qe.ExecuteQuery(sql);
        listaturan.clear();
        try
        {
         while (rs.next()) 
         {
               Aturan aturan =  new Aturan();
               aturan.setNoAturan(rs.getString("no_aturan"));
               aturan.setKep(rs.getInt("keputusan"));
               listaturan.add(aturan);
         }
         }catch(SQLException ex) 
         {
            System.out.println("Error : " + ex.getMessage());
         }
        return listaturan;
    }
       
    public List<Himpunan> loadDetailListAturan(String noaturan)
    {
        List<Himpunan > listhimpunan = new ArrayList<Himpunan>();
        String sql = "select * from detailaturan a, variable b , himpunan c where b.id_var=a.id_var and c.id_himp = a.id_himp and a.no_aturan='" + noaturan + "'";
        QueryExecutor qe = new QueryExecutor();
        ResultSet rs = qe.ExecuteQuery(sql);
        listhimpunan.clear();
        try
        {
         while (rs.next()) 
         {
             Himpunan himp = new Himpunan();
             himp.setIdHimp(rs.getInt("id_himp"));
             himp.getVar().setIdVar(rs.getInt("id_var"));
             himp.getVar().setNmVar(rs.getString("nm_var"));
             himp.setNmhimp(rs.getString("nama_himp"));
             listhimpunan.add(himp);
              
         }
         }catch(SQLException ex) 
         {
            System.out.println("Error : " + ex.getMessage());
         }
        return listhimpunan;
    }
    
     public List<Aturan> loadRuleBase()
    {
        List<Aturan > listaturan = new ArrayList<Aturan>();
        String sql = "select * from aturan";
        QueryExecutor qe = new QueryExecutor();
        ResultSet rs = qe.ExecuteQuery(sql);
         try
        {
        while (rs.next()) 
         {
             Aturan aturan = new Aturan();
             aturan.setNoAturan(rs.getString("no_aturan"));
             aturan.setKep(rs.getInt("keputusan"));
             
             sql = "select * from detailaturan a, variable b , himpunan c where b.id_var=a.id_var and c.id_himp = a.id_himp and a.no_aturan='" + aturan.getNoAturan() + "'";            
             ResultSet rshimp = qe.ExecuteQuery(sql);
             while (rshimp.next())
             {
                     Himpunan antecedent = new Himpunan();
                     antecedent.setIdHimp(rshimp.getInt("id_himp"));
                     antecedent.getVar().setIdVar(rshimp.getInt("id_var"));
                     antecedent.getVar().setNmVar(rshimp.getString("nm_var"));
                     antecedent.getVar().setJenisVar(rshimp.getInt("jenis_var"));
                     antecedent.setNmhimp(rshimp.getString("nama_himp"));
                     antecedent.setBatasbawah(rshimp.getInt("batasbawah"));
                     antecedent.setBatastengah(rshimp.getInt("batastengah"));
                     antecedent.setBatasakhir(rshimp.getInt("batasakhir"));
                     antecedent.setFungsi(rshimp.getInt("fungsi"));
                     aturan.addPremise(antecedent);
             }
             listaturan.add(aturan);
                     
        
        
         }
        }catch(SQLException ex) 
         {
            System.out.println("Error : " + ex.getMessage() + " "  + sql);
         }
         
        return listaturan;
    }
    
    public void SimpanVariable(Variable var)
    {
        String sql = "insert into variable (nm_var,jenis_var) values('" + var.getNmVar() + "','" + var.getJenisVar() + "')";
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
    
     public void PerbaikiVariable(Variable var)
    {
        String sql = "update variable set nm_var='" + var.getNmVar() + "', jenis_var='" + var.getJenisVar() + "' where id_var=" + var.getIdVar();
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
     
      public void HapusVariable(Variable var)
    {
        String sql = "delete from variable where id_var=" + var.getIdVar();
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
      
   public void SimpanHimpunan(Himpunan himp)
    {
        String sql = "insert into himpunan(id_var,nama_himp,batasbawah,batastengah,batasakhir,fungsi) values(" + himp.getVar().getIdVar() + ",";
              sql += "'" + himp.getNmhimp()  + "',";
              sql += "'" + himp.getBatasbawah()  + "',";
              sql += "'" + himp.getBatastengah() + "',";
              sql += "'" + himp.getBatasakhir() + "',";
              sql += "'" + himp.getFungsi() + "')";
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
   
    public void PerbaikiHimpunan(Himpunan himp)
    {
         String sql = "update himpunan set nama_himp='" + himp.getNmhimp() + "',";
              sql +="batasbawah='" + himp.getBatasbawah()  + "',";
              sql += "batastengah='" + himp.getBatastengah() + "',";
              sql += "batasakhir='" +  himp.getBatasakhir() + "',";
              sql += "fungsi='" + himp.getFungsi() + "' where id_himp=" + himp.getIdHimp();
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
    
     public void HapusHimpunan(Himpunan himp)
    {
        String sql = "delete from himpunan where id_himp=" + himp.getIdHimp();
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
     
     public void SimpanAturan(Aturan aturan)
    {
        String sql = "insert into aturan(no_aturan,keputusan) values('" + aturan.getNoAturan() + "','" + aturan.getKeputusan() + "')";
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
     
     
     public void HapusAturan(Aturan aturan)
    {
        String sql = "delete from aturan where no_aturan='" + aturan.getNoAturan() + "'";
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
   
   
    public void SimpanAntecedent(Aturan aturan,Himpunan himp)
    {
        String sql = "insert into detailaturan(no_aturan,id_var,id_himp) values('" + aturan.getNoAturan() + "','" + himp.getVar().getIdVar() + "','"  + himp.getIdHimp() + "')" ;
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
    
    
    public void HapusAntecedent(int idvar,int idhimp,String noaturan)
    {
        String sql = "delete from detailaturan where id_var=" + idvar + "  and id_himp=" + idhimp + " and no_aturan='" + noaturan + "'";
        qe = new QueryExecutor();
        qe.ExecuteCommand(sql);
    }
    
    
    
}
