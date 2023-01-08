public class OpenInventoryTask implements Task{
    private Inventory inventory;

    public OpenInventoryTask(Inventory inventory){
        this.inventory = inventory;
    }

    public void execute(){
        this.inventory.open();
    }

    public void cancel(){
        this.inventory.close();
    }
}
