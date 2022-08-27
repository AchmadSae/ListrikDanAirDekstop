
package dataTable.InvoiceNeeds;

public class ModelInvoice {
    String id_invoice, id_staf, date, unit, id_monthly;
    Integer total_cost;
    
    
    public ModelInvoice(String id_invoice,String date, String id_staf, String unit, String id_monthly, int total_cost){
        this.id_invoice = id_invoice;
        this.id_staf = id_staf;
        this.date =date;
        this.unit = unit;
        this.total_cost = total_cost;
        this.id_monthly = id_monthly;
    }

    public String getId_invoice() {
        return id_invoice;
    }

    public String getId_staf() {
        return id_staf;
    }

    public String getDate() {
        return date;
    }

    public String getUnit() {
        return unit;
    }

    public String getId_monthly() {
        return id_monthly;
    }

    public Integer getTotal_cost() {
        return total_cost;
    }



 
}
