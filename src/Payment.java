/**
 * Created by Puja on 3/20/17.
 */
public enum Payment {
    CARD("Card", 1), CASH("Cash",2);

    private int id;
    private String type;

    Payment(String type,int id) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
