/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dmfuzzytsukamoto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Fiqih Amrullah
 */
public class Login {
String ID;
static String status;
    public Login() {
        super();
    }
 public String getID(){
     return ID;
 }
   public boolean CheckUser( String username,String pwd) {
       boolean ada=false;
      // DMPengguna pdm  = new DMPengguna();
      // pdm.LoadData(" `username`='" + username + "' and `password`='" + pwd + "'");
      // if (pdm.getListPengguna().size()>0) {
        //   ada =true;
           
         //  status=pdm.getListPengguna().get(0).getStatus();
      // }
       if (username.equals("fiqih") && pwd.equals("123"))
       {
           ada =true;
       }
       return ada;
    }

   public static String getStatus(){
       return status;
   }






}
