package houji.bean;

/**
 * Created by zipon on 2017/3/12.
 */
public enum TaskStatusEnum {
    NEW("新建"),
    ONGOING("进行中"),
    FINISH("已完成"),
    PO("PO单"),
    CC("CC单"),
    INVOICE("已开发票"),
    PAID("已收款");
    private String status;
    TaskStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
