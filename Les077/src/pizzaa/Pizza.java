package pizzaa;

public class Pizza {

    private String title;
    private Integer price;
    private Character size;

    public Pizza() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        if(price > 0){
            this.price = price;
        }
    }

    public Character getSize() {
        return size;
    }

    public void setSize(Character size) {
        this.size = size;
    }
}
