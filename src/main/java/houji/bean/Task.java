package houji.bean;



/**
 * Created by zipon on 2017/3/12.
 */
public class Task {

    private int taskId;

    //标题

    private String title;

    private String createTime;

    //负责人

    private String leader;

    //详情

    private String detail;

    //任务状态

    private String status;

    //coding负责人

    private String codingLeader;

    //coding价格

    private int codingPrice;

    //数据录入负责人

    private String dataEntryLeader;

    //数据录入价格

    private int dataEntryPrice;

    //查错价格（就是项目负责人）

    private int dataCheckPrice;

    //EPIData 录入程序价格

    private int EPIDataPrice;

    //出表程序价格

    private int outputPrice;

    //分析价格

    private int BVCPrice;

    //task价格

    private int price;
    //客户

    private String customer;


    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    //提成

    private int bonus;

    public Task() {
        super();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"taskId\":")
                .append(taskId);
        sb.append(",\"title\":\"")
                .append(title).append('\"');
        sb.append(",\"createTime\":\"")
                .append(createTime).append('\"');
        sb.append(",\"leader\":\"")
                .append(leader).append('\"');
        sb.append(",\"detail\":\"")
                .append(detail).append('\"');
        sb.append(",\"status\":\"")
                .append(status).append('\"');
        sb.append(",\"codingLeader\":\"")
                .append(codingLeader).append('\"');
        sb.append(",\"codingPrice\":")
                .append(codingPrice);
        sb.append(",\"dataEntryLeader\":\"")
                .append(dataEntryLeader).append('\"');
        sb.append(",\"dataEntryPrice\":")
                .append(dataEntryPrice);
        sb.append(",\"dataCheckPrice\":")
                .append(dataCheckPrice);
        sb.append(",\"EPIDataPrice\":")
                .append(EPIDataPrice);
        sb.append(",\"outputPrice\":")
                .append(outputPrice);
        sb.append(",\"BVCPrice\":")
                .append(BVCPrice);
        sb.append(",\"price\":")
                .append(price);
        sb.append(",\"bonus\":")
                .append(bonus);
        sb.append('}');
        return sb.toString();
    }
    
    public int getTaskId() {
        return taskId;
    }
    
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getCreateTime() {
        return createTime.replaceAll("\\.0", "");
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    
    public String getLeader() {
        return leader;
    }
    
    public void setLeader(String leader) {
        this.leader = leader;
    }
    
    public String getDetail() {
        return detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getCodingLeader() {
        return codingLeader;
    }
    
    public void setCodingLeader(String codingLeader) {
        this.codingLeader = codingLeader;
    }
    
    public int getCodingPrice() {
        return codingPrice;
    }
    
    public void setCodingPrice(int codingPrice) {
        this.codingPrice = codingPrice;
    }
    
    public String getDataEntryLeader() {
        return dataEntryLeader;
    }
    
    public void setDataEntryLeader(String dataEntryLeader) {
        this.dataEntryLeader = dataEntryLeader;
    }
    
    public int getDataEntryPrice() {
        return dataEntryPrice;
    }
    
    public void setDataEntryPrice(int dataEntryPrice) {
        this.dataEntryPrice = dataEntryPrice;
    }
    
    public int getDataCheckPrice() {
        return dataCheckPrice;
    }
    
    public void setDataCheckPrice(int dataCheckPrice) {
        this.dataCheckPrice = dataCheckPrice;
    }

    public int getEPIDataPrice() {
        return EPIDataPrice;
    }

    public void setEPIDataPrice(int EPIDataPrice) {
        this.EPIDataPrice = EPIDataPrice;
    }
    
    public int getOutputPrice() {
        return outputPrice;
    }
    
    public void setOutputPrice(int outputPrice) {
        this.outputPrice = outputPrice;
    }

    public int getBVCPrice() {
        return BVCPrice;
    }

    public void setBVCPrice(int BVCPrice) {
        this.BVCPrice = BVCPrice;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getBonus() {
        return bonus;
    }
    
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
