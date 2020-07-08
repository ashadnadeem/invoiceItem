
import invoiceitem.InvoiceItem;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18660
 */

public class DemoInvoice {
    public static void main(String[] args) {
        // TODO code application logic here
        InvoiceItem i1 = new InvoiceItem("123","DairyMilk",25,10);
        System.out.print(i1.toString());
    }
    
}
