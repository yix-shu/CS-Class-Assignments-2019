/*
Name: Yixing Xu
Date: January 7, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 
To write the DiscountBill class and extend from the GroceryBill to calculate discounts based on whether the customer is preferred or not (boolean). This will require the use of the superclass's getTotal(), getDiscount(), add(i), and getClerk() methods, which will be inherited as a result of "extends".

The program calculates the total discount, percent discount, and the number of discount items. It also records the names of the items onto a receipt, which is an ArrayList.
*/
public class DiscountBill extends GroceryBill{
    private boolean preferred;
    private double totalDiscount;
    private int discountItems;
    private ArrayList<Item> receipt;
    
    public DiscountBill(Employee clerk, boolean preferred){
        super(clerk);
        this.preferred = preferred;
        this.totalDiscount = totalDiscount;
        this.discountItems = discountItems;
        this.receipt = new ArrayList<Item>();
    }
    public int getDiscountCount(){
        return discountItems;
    }
    public double getDiscountAmount(){
        
        return totalDiscount;
    }
    public void add(Item i) {
        super.add(i);
        receipt.add(i);
        if ((preferred == true)&&(i.getDiscount()>0)){
            totalDiscount += i.getDiscount();
            discountItems += 1;
        }
	}
    
    public double getDiscountPercent(){
        
        return totalDiscount/super.getTotal()*100;
    }
    public double getTotal(){
        return super.getTotal()-totalDiscount;
    }
    public Employee getClerk(){
        return super.clerk;
    }
}