/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceitem;

/**
 *
 * @author 18660
 */
public class InvoiceItem {

    
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public InvoiceItem(){}
    public InvoiceItem(String id , String desc, int qty, double uprice){
        this.desc = desc;
        this.id = id;
        this.qty = qty;
        this.unitPrice = uprice;
    }
    
    public String getID(){
        return this.id;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getQty(){
        return this.qty;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    
    public void setQty(int q){
        this.qty = q;
    }
    public void setUnitPrice(double up){
        this.unitPrice = up;
    }
    public double getTotal(){
        double Total = this.qty * this.unitPrice;
        return Total;
    }
    public String toString(){
        String str = "InvoiceItem[id="+this.id+",qty="+this.qty+",unitPrice="+this.unitPrice+"]";
        return str;
    }
    
    
}
