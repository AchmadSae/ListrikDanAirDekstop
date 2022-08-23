
package dataTable.PengecekanNeeds;


import ListrikDanAirApps.Pengecekan;
import config.Connection_db;
import dataTable.PengecekanNeeds.ConstTable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class tableData{
    //create new object class form, to get variable table
  
  static private Connection conn = new Connection_db().Connect();
      
  public static  ArrayList<ConstTable> ListPengecekan(){
        ArrayList<ConstTable> cekList = new ArrayList<>();
     
               //query used in tables
        String qryTbPengecekan ="SELECT ALL monthly.unit, monthly.date, monthly.id_staf, monthly.id_monthly, facility.name, data.current_number, data.amount "
             + "FROM ((data INNER JOIN monthly ON data.id_monthly = monthly.id_monthly)"
             + " INNER JOIN facility ON data.id_facility = facility.id_facility)";
          try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(qryTbPengecekan);
            
           // reObject arrayList class ConstTable
           ConstTable cek;
            while (rs.next()){
                    cek = new ConstTable(
                            rs.getString("unit"),
                            rs.getString("date"),
                            rs.getString("id_staf"),
                            rs.getString("id_monthly"),
                            rs.getString("name"),
                            rs.getString("current_number"),
                            rs.getString("amount")
                    );
                    cekList.add(cek);
            }
            
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get some Data in Your Application in Table Pengecekan");
        }
        return cekList;
        
  }

}


