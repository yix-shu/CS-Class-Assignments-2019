/*
Name: Yixing Xu
Date: January 10, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 
Create a ShoppingCart class that inherits all of the GroceryBill's methods to add mulitple items to the receipt
*/
public class ShoppingCart extends GroceryBill{
  private boolean discount;
  public ShoppingCart(Employee clerk){
    super(clerk);
  }
  public ShoppingCart(){
    super();
  }
  public boolean add(Item i, int numOfItem){
    ArrayList<Item> receipt = super.getList();
    for(int y = 0; y<receipt.size(); y++){
      if ((receipt.get(y)).equals(i)){
        receipt.remove(y);
      }
    }
    for (int x = 0; x <= numOfItem; x++){
      super.add(i);
    }
    return true;
  }
  public boolean setDiscount(boolean discount){
    return discount;  
  }
  public String toString() {
    return super.toString();
  }
  public double getTotal() {
    return super.getTotal();
  }
}