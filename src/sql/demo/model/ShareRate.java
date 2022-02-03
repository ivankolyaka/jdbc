package sql.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ShareRate extends BaseModel{
    private LocalDateTime operDate;
    private long share_id;
    private BigDecimal rate;

    public ShareRate() {
    }

    public ShareRate(long id, LocalDateTime operDate, long share_id, BigDecimal rate) {
        super(id);
        this.operDate = operDate;
        this.share_id = share_id;
        this.rate = rate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public long getShare_id() {
        return share_id;
    }

    public void setShare_id(long share_id) {
        this.share_id = share_id;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
