
package dataTable.PenghuniNeeds;


public class ModelPenghuni {
    String unit, name,phone,email,VNpayment;
    public ModelPenghuni(String unit,String name,String phone,String email,String VNpayment){
        this.unit =unit;
        this.name =name;
        this.phone = phone;
        this.email = email;
        this.VNpayment = VNpayment;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getVNpayment() {
        return VNpayment;
    }
}
