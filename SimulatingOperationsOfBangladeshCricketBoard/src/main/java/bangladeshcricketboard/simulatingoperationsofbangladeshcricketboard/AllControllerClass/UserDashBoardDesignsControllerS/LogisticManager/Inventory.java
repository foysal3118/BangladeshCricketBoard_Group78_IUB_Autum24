package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

public class Inventory {

    private String itemName;
    private int quantity;
    private String addDate;
    private String description;

    public Inventory(String itemName, int quantity, String addDate, String description) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.addDate = addDate;
        this.description = description;
    }

    public String getItemName() {
        return itemName;
    }

   public int getQuantity() {
        return quantity;
    }

    public String getAddDate() {
        return addDate;
    }

    public String getDescription() {
        return description;
    }
}
