
package dataTable.FasilityNeeds;

import config.Connection_db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerFacility {
          static private Connection conn = new Connection_db().Connect();
    //create objek array form modelpengecekan
    static ArrayList<ModelFacility> facList;
    //create table model
    DefaultTableModel model;
    //class for array list objek
    public ControllerFacility() {
    facList = new ArrayList();
    }
    
    
        //function select data form database
    public static ArrayList<ModelFacility> CekAllFacility(){
        //query used in tables
        String qryTbPengecekan ="SELECT * FROM facility";
          try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(qryTbPengecekan);
            
           // reObject arrayList class ModelPengecekan
           ModelFacility cek;
            while (rs.next()){
                    cek = new ModelFacility(
                            rs.getString("id_facility"),
                            rs.getString("name"),
                            rs.getString("default_cost")
                    );
                    facList.add(cek);
            }
            
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get some Data in Your Application in Table Pengecekan"+e);
        }
        return facList;
    }
}
