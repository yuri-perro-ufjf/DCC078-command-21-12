public class Inventory {
    private int size;
    private String status;

    public Inventory(int size){
        this.size = size;
    }

    public String getStatus(){
        return this.status;
    }

    public void open(){
        this.status = "Opened";
    }

    public void close(){
        this.status = "Closed";
    }
}
