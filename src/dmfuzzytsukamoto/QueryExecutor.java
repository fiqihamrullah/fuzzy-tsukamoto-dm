/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dmfuzzytsukamoto;

import com.mysql.jdbc.Statement;
 
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TOSHIBA
 */
public  class QueryExecutor {
    private ConnectionAttribute kon;

    public QueryExecutor() {
               kon = new ConnectionAttribute("jdbc:mysql://localhost:3306/dmfuzzytsukamoto?autoReconnect=true&useSSL=false", "root", "");
               kon.bukaKoneksi();
    }

//    public abstract void LoadData(String filter);
    public void ExecuteCommand(String sql){
        Statement st = null;
        try{
        st =(Statement) kon.getConnection().createStatement();
        st.execute(sql);        
        }catch(SQLException ex){
            System.out.println("Execute Error : " +  ex.getMessage());
        }
    }
    
    public ResultSet ExecuteQuery(String sql){
        Statement st = null;
         ResultSet rs = null;
        try{
        st =(Statement) kon.getConnection().createStatement();
        st.execute(sql); 
           rs = st.getResultSet();
         
        }catch(SQLException ex){
            System.out.println("Execute Error : " +  ex.getMessage());
        }
          return rs;
    }


    
    public int GetRecordCount(ResultSet rs){
        int baris=0;
        try{
        while(rs.next()){
            baris++;
        }
        }catch(SQLException e){
            System.out.println("GetrecordCount : " + e.getMessage());
        }
        return baris;
    }



}
