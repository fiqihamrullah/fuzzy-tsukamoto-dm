/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dmfuzzytsukamoto;

/**
 *
 * @author Fiqih Amrullah
 */
public class UIViewer 
{
   FormMain frmMain;

   public UIViewer(FormMain frmMain) 
   {
     this.frmMain = frmMain;
   }
      
   public void showFormVariable()
   {
       FormVariable formVariable = new FormVariable(frmMain, true);
       formVariable.setVisible(true);
   }
   
   public void showFormHimpunan()
   {
       FormHimpunan formHimpunan = new FormHimpunan(frmMain, true);
       formHimpunan.setVisible(true);
   }
   
   public void showFormAturan()
   {
       FormAturan formAturan = new FormAturan(frmMain, true);
       formAturan.setVisible(true);
   }
   
   public void showFormDiagnosa()
   {
       FormDiagnosa formDiagnosa = new FormDiagnosa(frmMain, true);
       formDiagnosa.setVisible(true);
   }
   
   
}
