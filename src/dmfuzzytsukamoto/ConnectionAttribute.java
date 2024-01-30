/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dmfuzzytsukamoto;
import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Fiqih Amrullah
 */
public class ConnectionAttribute {
   private String url;
   private String usrname;
   private String pwd;
   private static Connection conn;
   
   public ConnectionAttribute(){
            

   }

    public ConnectionAttribute(String url, String usrname, String pwd) {
        this.url = url;
        this.usrname = usrname;
        this.pwd = pwd;
    }

    public void bukaKoneksi(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn  =(Connection) DriverManager.getConnection(url, usrname, pwd);
        }catch (ClassNotFoundException ex){

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Tidak Dapat Melakukan Koneksi!","Gagal Koneksi",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void tutupKoneksi(){
        try{
        conn.close();
        }catch(SQLException ex){

        }

    }

    public static Connection getConnection(){
        return conn;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPwd() {
        return pwd;
    }

    public String getUsrname() {
        return usrname;
    }

    public String getUrl() {
        return url;
    }



}
