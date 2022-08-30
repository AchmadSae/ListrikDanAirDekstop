

package dataTable.InvoiceNeeds;

import config.Connection_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerInvoice {
      static private Connection conn = new Connection_db().Connect();
    //create objek array form modelpengecekan
    static ArrayList<ModelInvoice> invoiceList;
    //create table model
    DefaultTableModel model;
    //class for array list objek
    public ControllerInvoice() {
    invoiceList = new ArrayList();
    }
    
    
    //function select data form database
    public static ArrayList<ModelInvoice> CekAllInvoice(){
        //query used in tables
        String qryTbPengecekan ="SELECT invoice.id_invoice, invoice.date, invoice.id_staf, monthly.unit, monthly.id_monthly, invoice.total_cost FROM (monthly INNER JOIN invoice ON monthly.id_monthly = invoice.id_monthly) ";
          try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(qryTbPengecekan);
            
           // reObject arrayList class ModelPengecekan
           ModelInvoice cek;
            while (rs.next()){
                    cek = new ModelInvoice(
                            rs.getString("id_invoice"),
                            rs.getString("date"),
                            rs.getString("id_staf"),
                            rs.getString("unit"),
                            rs.getString("id_monthly"),
                            rs.getInt("total_cost")
                    );
                    invoiceList.add(cek);
            }
            
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get some Data in Your Application in Table Pengecekan"+e);
        }
        return invoiceList;
    }
    
       //show data in table
    public DefaultTableModel showDataInvoice(){
        String[] kolom = {"INVOICE","UNIT","ID_STAF","ID MONTHLY","TANGGAL","TOTAL BIAYA"};
        Object[][] objData = new Object[invoiceList.size()][6];
        int i = 0;
        
        for(ModelInvoice n : invoiceList){
            String[] arrData = {n.getId_invoice(),n.getUnit(), n.getId_staf(), n.getId_monthly(), n.getDate(), n.getTotal_cost().toString()};
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
    
    //insert invoice
         //insert progres cek
    public void insertProgres(String id_invoice, String username, String id_monthly, String date, Integer total) {

        String qry = "INSERT INTO invoice (id_invoice, id_staf, id_monthly, date, total_cost) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1,id_monthly);
            val.setString(2, username);
            val.setString(3, id_monthly);
            val.setString(4, date);
            val.setInt(5, total);

            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Invoice Succses");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request create record !"+e);
        }
    }
    
    //delet invoice form data report section
        //delted
    public void deleteInvoice(String id){
        String qry = "DELETE FROM invoice WHERE id_invoice ='"+id+"'";
        
            try{
                PreparedStatement stat = conn.prepareStatement(qry);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deleted is Succses !");
             }
                catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error in Deleted");
                System.out.println(e);
             }
    }
}
