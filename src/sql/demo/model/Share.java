package sql.demo.model;

import java.math.BigDecimal;

public class Share extends BaseModel {
    private String name;
    private BigDecimal startPrice;
    private int changeProbability;
    private int delta;

    public Share() {
    }

//    public Share(String name, BigDecimal startPrice, int changeProbability, int delta) {
//        this.name = name;
//        this.startPrice = startPrice;
//        this.changeProbability = changeProbability;
//        this.delta = delta;
//    }

    public Share(long id, String name, BigDecimal startPrice, int changeProbability, int delta) {
        super(id);
        this.name = name;
        this.startPrice = startPrice;
        this.changeProbability = changeProbability;
        this.delta = delta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public int getChangeProbability() {
        return changeProbability;
    }

    public void setChangeProbability(int changeProbability) {
        this.changeProbability = changeProbability;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
