/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Java Programming with Aldrin
 */
public class Item {

    private String item;
    private String qty;
    private String price;
    private String Rprice;
    private static Float lineTotal;
    private String disc;
    private String unit;
    private String itmNum;
    

    public Item(String itmNum, String item, String qty, String price, String Rprice,String disc,String unit) {
        this.item = item;
        this.qty = qty;
        this.price = price;
        this.Rprice = Rprice;
        this.disc=disc;
        this.unit=unit;
        this.itmNum=itmNum;
        
    }
    
    /**
     * @return the itmNum
     */
    public String getItmNum() {
        return itmNum;
    }

    /**
     * @param itmNum the itmNum to set
     */
    public void setItmum(String itmNum) {
        this.itmNum = itmNum;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }
    
    
    public String getDiscount() {
        return disc;
    }

    /**
     * @param disc the item to set
     */
    public void setDiscount(String disc) {
        this.disc = disc;
    }

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * @return the price
     */
    public String getgivenPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setgivenPrice(String price) {
        this.price = price;
    }
    
    public String getRealPrice() {
        return Rprice;
    }

    /**
     * @param Rprice the price to set
     */
    public void setRealPrice(String Rprice) {
        this.Rprice = Rprice;
    }
    
    public String getItemUnit() {
        return unit;
    }

    /**
     * @param Unit
     */
    public void setItemUnit(String Unit) {
        this.unit = unit;
    }

    /**
     * @return the lineTotal
     */
    public static Float getLineTotal() {
        return lineTotal;
    }

    /**
     * @param aLineTotal the lineTotal to set
     */
    public static void setLineTotal(Float aLineTotal) {
        lineTotal = aLineTotal;
    }
}
