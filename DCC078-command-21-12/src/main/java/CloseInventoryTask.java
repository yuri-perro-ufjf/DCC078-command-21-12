public class CloseInventoryTask implements Task{
    private Inventory inventory;

    public CloseInventoryTask(Inventory inventory){
        this.inventory = inventory;
    }

    public void execute(){
        this.inventory.close();
    }

    public void cancel(){
        this.inventory.open();
    }
}
