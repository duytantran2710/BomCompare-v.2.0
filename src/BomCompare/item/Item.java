package BomCompare.item;


public class Item {
    private String uId, number, description, rev;
    private int level, qty;
    String [] refDes;

    public Item(int level, String number, String description, String rev, int qty, String[] refDes) {
        this.level = level;
        this.number = number;
        this.description = description;
        this.rev = rev;
        this.qty = qty;
        this.refDes = refDes;
    }
    
    
    
    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String[] getRefDes() {
        return refDes;
    }

    public void setRefDes(String[] refDes) {
        this.refDes = refDes;
    }
    
    
}
