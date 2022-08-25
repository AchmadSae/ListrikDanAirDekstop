package dataTable.PengecekanNeeds;


public class ModelPengecekan {
    private String unit, date, id_staf, id_monthly, name;
    private Integer  current_number, amount;
   // private Byte attcahment;
    
    public ModelPengecekan(String unit,String date, String id_staf, String id_monthly, String name,int current_number, int amount){
        this.unit = unit;
        this.date = date;
        this.id_staf = id_staf;
        this.id_monthly = id_monthly;
        this.name = name;
        this.current_number = current_number;
        this.amount = amount;
       // this.attcahment = attachment;
        
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId_staf() {
        return id_staf;
    }

    public void setId_staf(String id_staf) {
        this.id_staf = id_staf;
    }

    public String getId_monthly() {
        return id_monthly;
    }

    public void setId_monthly(String id_monthly) {
        this.id_monthly = id_monthly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrent_number() {
        return current_number;
    }

    public void setCurrent_number(Integer current_number) {
        this.current_number = current_number;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


   

    
}
