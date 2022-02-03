package sql.demo.model;

import sql.demo.repository.BaseTable;

import java.math.BigDecimal;

public class Traider extends BaseModel {

    private String name;
    private int sfreqTick;
    private BigDecimal cash;
    private int traidingMethod;
    private int changeProbability;
    private String about;

    public Traider() {
    }

    public Traider(long id, String name, int sfreqTick, BigDecimal cash, int traidingMethod, int changeProbability, String about) {
        super(id);
        this.name = name;
        this.sfreqTick = sfreqTick;
        this.cash = cash;
        this.traidingMethod = traidingMethod;
        this.changeProbability = changeProbability;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSfreqTick() {
        return sfreqTick;
    }

    public void setSfreqTick(int sfreqTick) {
        this.sfreqTick = sfreqTick;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public int getTraidingMethod() {
        return traidingMethod;
    }

    public void setTraidingMethod(int traidingMethod) {
        this.traidingMethod = traidingMethod;
    }

    public int getChangeProbability() {
        return changeProbability;
    }

    public void setChangeProbability(int changeProbability) {
        this.changeProbability = changeProbability;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
