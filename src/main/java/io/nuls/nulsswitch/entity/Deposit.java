package io.nuls.nulsswitch.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户交易委托表：包括当前委托、历史委托
 * </p>
 *
 * @author Edward123
 * @since 2019-07-15
 */
@TableName("tx_deposit")
public class Deposit implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("deposit_id")
    private String depositId;
    private String address;
    /**
     * 交易类型：1-买入、2-卖出
     */
    @TableField("tx_type")
    private Integer txType;
    /**
     * 原token
     */
    @TableField("from_token_id")
    private Integer fromTokenId;
    /**
     * 目标token
     */
    @TableField("to_token_id")
    private Integer toTokenId;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 挂单总数量
     */
    @TableField("total_num")
    private Integer totalNum;
    /**
     * 已完成交易数量
     */
    @TableField("tx_num")
    private Integer txNum;
    /**
     * 挂单总金额
     */
    @TableField("total_amount")
    private BigDecimal totalAmount;
    /**
     * 状态：0-未交易、1-部分交易、2-完成交易、9-撤销
     */
    private Integer status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;


    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTxType() {
        return txType;
    }

    public void setTxType(Integer txType) {
        this.txType = txType;
    }

    public Integer getFromTokenId() {
        return fromTokenId;
    }

    public void setFromTokenId(Integer fromTokenId) {
        this.fromTokenId = fromTokenId;
    }

    public Integer getToTokenId() {
        return toTokenId;
    }

    public void setToTokenId(Integer toTokenId) {
        this.toTokenId = toTokenId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTxNum() {
        return txNum;
    }

    public void setTxNum(Integer txNum) {
        this.txNum = txNum;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Deposit{" +
        ", depositId=" + depositId +
        ", address=" + address +
        ", txType=" + txType +
        ", fromTokenId=" + fromTokenId +
        ", toTokenId=" + toTokenId +
        ", price=" + price +
        ", totalNum=" + totalNum +
        ", txNum=" + txNum +
        ", totalAmount=" + totalAmount +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
