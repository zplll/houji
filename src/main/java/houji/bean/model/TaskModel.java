package houji.bean.model;

import java.util.Date;

public class TaskModel {
    private Integer taskId;

    private String title;

    private Date createTime;

    private String leader;

    private String customer;

    private String detail;

    private String status;

    private String codingLeader;

    private Integer codingPrice;

    private String dataEntryLeader;

    private Integer dataEntryPrice;

    private Integer dataCheckPrice;

    private Integer epiDataPrice;

    private Integer outputPrice;

    private Integer bvcPrice;

    private Integer price;

    private Integer bonus;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCodingLeader() {
        return codingLeader;
    }

    public void setCodingLeader(String codingLeader) {
        this.codingLeader = codingLeader == null ? null : codingLeader.trim();
    }

    public Integer getCodingPrice() {
        return codingPrice;
    }

    public void setCodingPrice(Integer codingPrice) {
        this.codingPrice = codingPrice;
    }

    public String getDataEntryLeader() {
        return dataEntryLeader;
    }

    public void setDataEntryLeader(String dataEntryLeader) {
        this.dataEntryLeader = dataEntryLeader == null ? null : dataEntryLeader.trim();
    }

    public Integer getDataEntryPrice() {
        return dataEntryPrice;
    }

    public void setDataEntryPrice(Integer dataEntryPrice) {
        this.dataEntryPrice = dataEntryPrice;
    }

    public Integer getDataCheckPrice() {
        return dataCheckPrice;
    }

    public void setDataCheckPrice(Integer dataCheckPrice) {
        this.dataCheckPrice = dataCheckPrice;
    }

    public Integer getEpiDataPrice() {
        return epiDataPrice;
    }

    public void setEpiDataPrice(Integer epiDataPrice) {
        this.epiDataPrice = epiDataPrice;
    }

    public Integer getOutputPrice() {
        return outputPrice;
    }

    public void setOutputPrice(Integer outputPrice) {
        this.outputPrice = outputPrice;
    }

    public Integer getBvcPrice() {
        return bvcPrice;
    }

    public void setBvcPrice(Integer bvcPrice) {
        this.bvcPrice = bvcPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
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
        sb.append(",\"customer\":\"")
                .append(customer).append('\"');
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
        sb.append(",\"epiDataPrice\":")
                .append(epiDataPrice);
        sb.append(",\"outputPrice\":")
                .append(outputPrice);
        sb.append(",\"bvcPrice\":")
                .append(bvcPrice);
        sb.append(",\"price\":")
                .append(price);
        sb.append(",\"bonus\":")
                .append(bonus);
        sb.append('}');
        return sb.toString();
    }
}