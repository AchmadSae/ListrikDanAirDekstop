
package dataTable.KaryawanNeeds;

import config.Connection_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerKaryawan {
        static private Connection conn = new Connection_db().Connect();
        //create objek array form modelpengecekan
    static ArrayList<ModelKaryawan> karyawanList;
        //create table model
    DefaultTableModel model;
    
    public ControllerKaryawan(){
        karyawanList = new ArrayList();
    }
    
            //function select data form database
    public static ArrayList<ModelKaryawan> CekAllKaryawan(){
        //query used in tables
        String qryTbPengecekan ="SELECT * FROM staf";
          try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(qryTbPengecekan);
            
           // reObject arrayList class ModelPengecekan
           ModelKaryawan cek;
            while (rs.next()){
                    cek = new ModelKaryawan(
                            rs.getString("id_staf"),
                            rs.getString("password"),
                            rs.getString("name"),
                             rs.getString("position"),
                            rs.getString("phone"),
                            rs.getString("email")
                         
                    );
                    karyawanList.add(cek);
            }
            
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get some Data Staf in Your Application ");
                 System.out.println(e);
        }
        return karyawanList;
    }
    
            //show data in table
    public DefaultTableModel showData(){
        String[] kolom = {"ID KARYAWAN","PASSWORD","NAMA","POSITION","TELEPONE","EMAIL"};
        Object[][] objData = new Object[karyawanList.size()][6];
        int i = 0;
        
        for(ModelKaryawan n : karyawanList){
            String[] arrData = {n.getId_staf(), n.getPassword(), n.getName(), n.getPosition(), n.getPhone(), n.getEmail()};
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
    public void insertKaryawan(String id_staf, String Pass, String Pos ,String name, String phone, String email) {

        String qry = "INSERT INTO staf (id_staf,password,name,position,phone,email) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1,id_staf);
            val.setString(2, Pass);
            val.setString(3, name);
            val.setString(4, Pos);
            val.setString(5, phone);
            val.setString(6, email);
            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Data Karyawan Succses");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request create record !");
             System.out.println(e);
        }
    }
    
            //update 
    public void updateKaryawan(String id_staf, String Pass, String Pos ,String name, String phone, String email) {
     
        String qry = "UPDATE staf SET  password=?, name=?, position=?, phone=?, email=? WHERE id_staf=? ";
             
         try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1,Pass);
            val.setString(2, name);
            val.setString(3, Pos);
            val.setString(4, phone);
            val.setString(5, email);
            val.setString(6, id_staf);
            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Data Unit : "+name+ "Succses");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request update !");
             System.out.println(e);
        }
    }
}
