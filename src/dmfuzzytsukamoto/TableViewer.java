/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dmfuzzytsukamoto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author TOSHIBA
 */
public class TableViewer 
{
      public static DefaultTableModel ConvertVariableListToTableModel(List<Variable> listvar,String header[])
      {
       DefaultTableModel dtm=null;
       Object[][] data = new Object[listvar.size()][header.length];
       for(int i=0;i<listvar.size();i++)
       {
          data[i][0] = i+1;
          data[i][1] = listvar.get(i).getNmVar();
          data[i][2] = (listvar.get(i).getJenisVar()==0)?"Fuzzy":"Crisp";          
        
       }

       dtm = new DefaultTableModel(data, header);
       
       return dtm;
       
   }
      
      public static DefaultTableModel ConvertHimpunanListToTableModel(List<Himpunan> listhimp,String header[])
      {
       DefaultTableModel dtm=null;
       Object[][] data = new Object[listhimp.size()][header.length];
       for(int i=0;i<listhimp.size();i++)
       {
          data[i][0] = i+1;
          data[i][1] = listhimp.get(i).getNmhimp();
          data[i][2] = listhimp.get(i).getBatasbawah();        
          data[i][3] = listhimp.get(i).getBatastengah();
          data[i][4] = listhimp.get(i).getBatasakhir();
          data[i][5] = (listhimp.get(i).getFungsi()==0) ?"Linier Turun":(listhimp.get(i).getFungsi()==1?"Segitiga":"Linier Naik");          
        
       }

       dtm = new DefaultTableModel(data, header);
       
       return dtm;
       
   }
      
        public static DefaultTableModel ConvertAturanListToTableModel(List<Aturan> listaturan,String header[])
      {
       DefaultTableModel dtm=null;
       Object[][] data = new Object[listaturan.size()][header.length];
       for(int i=0;i<listaturan.size();i++)
       {
          data[i][0] = i+1;
          data[i][1] = listaturan.get(i).getNoAturan();
          int kep =  listaturan.get(i).getKeputusan();
          String strkep="";
          if (kep==0) 
          {
              strkep = "Sangat Rendah";
          }else if (kep==1) {
              strkep = "Rendah";
          }else if (kep==2) {
              strkep = "Sedang";
          }else if (kep==3) {
              strkep = "Tinggi";
          }else if (kep==4) {
              strkep = "Sangat Tinggi";
          }
          data[i][2] = strkep;
          
                  
        
       }

       dtm = new DefaultTableModel(data, header);
       
       return dtm;
       
   }
        
          public static DefaultTableModel ConvertDetailAturanListToTableModel(List<Himpunan> listantesedent,String header[])
      {
       DefaultTableModel dtm=null;
       Object[][] data = new Object[listantesedent.size()][header.length];
       for(int i=0;i<listantesedent.size();i++)
       {
          data[i][0] = i+1;
          data[i][1] = listantesedent.get(i).getVar().getNmVar();        
          data[i][2] = listantesedent.get(i).getNmhimp();  
                  
        
       }

       dtm = new DefaultTableModel(data, header);
       
       return dtm;
       
   }
}
