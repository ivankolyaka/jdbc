package sql.demo.model;

public class Action extends BaseModel{
    private int operation;
    private long traider_Id;
    private long share_rate_id;
    private long amount;

    public Action() {
    }

    public Action(long id, int operation, long traider_Id, long share_rate_id, long amount) {
        super(id);
        this.operation = operation;
        this.traider_Id = traider_Id;
        this.share_rate_id = share_rate_id;
        this.amount = amount;
    }
}
