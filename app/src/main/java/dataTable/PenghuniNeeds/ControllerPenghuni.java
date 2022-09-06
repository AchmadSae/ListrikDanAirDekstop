
package dataTable.PenghuniNeeds;

import config.Connection_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerPenghuni {
    static private Connection conn = new Connection_db().Connect();
        //create objek array form modelpengecekan
    static ArrayList<ModelPenghuni> penghuniList;
        //create table model
    DefaultTableModel model;
    
    public ControllerPenghuni(){
        penghuniList = new ArrayList();
    }
        //function select data form database
    public static ArrayList<ModelPenghuni> CekAllPenghuni(){
        //query used in tables
        String qryTbPengecekan ="SELECT * FROM penghuni";
          try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(qryTbPengecekan);
            
           // reObject arrayList class ModelPengecekan
           ModelPenghuni cek;
            while (rs.next()){
                    cek = new ModelPenghuni(
                            rs.getString("unit"),
                            rs.getString("name"),
                            rs.getString("phone"),
                            rs.getString("email"),
                            rs.getString("VNpayment")
                    );
                    penghuniList.add(cek);
            }
            
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get some Data in Your Application in Table Penghuni");
                 System.out.println(e);
        }
        return penghuniList;
    }
    
        //show data in table
    public DefaultTableModel showData(){
        String[] kolom = {"UNIT","NAMA","TELEPONE","EMAIL","VN PAYMENT"};
        Object[][] objData = new Object[penghuniList.size()][7];
        int i = 0;
        
        for(ModelPenghuni n : penghuniList){
            String[] arrData = {n.getUnit(), n.getName(), n.getPhone(), n.getEmail(), n.getVNpayment()};
            objData[i] = arrData;
            i++;
        }
        
        model = new DefaultTableModel(objData,kolom){
            //disable edit row table
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        return model;    
    }
    
         //insert
    public void insertPenghuni(String unit,String name, String phone, String email,String VNpayment) {

        String qry = "INSERT INTO penghuni (unit,name,phone,email,VNpayment) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1,unit);
            val.setString(2, name);
            val.setString(3, phone);
            val.setString(4, email);
            val.setString(5, VNpayment);
            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Data Penghuni Succses");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request create record !");
             System.out.println(e);
        }
    }
        //update 
    public void updatePenghuni(String unit,String name, String phone, String email,String VNpayment) {
     
        String qry = "UPDATE tb_cek SET name=?, phone=?, email=?, VNpayment=? WHERE unit=? ";
             
         try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1,name );
            val.setString(2, phone);
            val.setString(3, email);
            val.setString(4, VNpayment);
            val.setString(5, unit);
            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Data Unit : "+unit+ "Succses");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request update !");
             System.out.println(e);
        }
    }
    
    
}
