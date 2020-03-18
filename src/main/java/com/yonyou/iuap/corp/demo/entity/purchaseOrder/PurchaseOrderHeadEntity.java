package com.yonyou.iuap.corp.demo.entity.purchaseOrder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  采购订单表头
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderHeadEntity extends BaseEntity {
    private String org; //采购组织ID
    private String org_name; //采购组织名称
    private String bustype; //交易类型Id
    private String bustype_name; //交易类型名称
    private String vouchdate; //单据日期
    private String code; //订单编号
    private String vendor; //供货供应商ID
    private String vendor_name; // 	供货供应商名称
    private long operatorId; //采购员ID
    private long operator; //采购员ID
    private String operator_name; //采购员名称
    private String creator; //创建人名称
    private long creatorId; //创建人ID
    private String currency_moneyDigit; //币种金额精度
    private String currency_priceDigit; //币种单价精度
    private String natCurrency_moneyDigit; //本币金额精度
    private String natCurrency_priceDigit; // 	本币单价精度
    private String currency; //币种Id
    private String currency_code; // 	币种编码
    private String currency_name; //币种
    private String natCurrency; //本币
    private String natCurrency_code; //本币编码
    private String natCurrency_name; //本币名称
    private String exchRateType; //汇率类型ID
    private String exchRateType_name; //汇率类型名称
    private String exchRate; // 汇率
    private String taxRate; //税率
    private List<PurchaseOrderBodyEntity> purchaseOrders;
    private String _status; //操作状态
    private long invoiceVendor; // 	开票供应商id
    private String invoiceVendor_name; //开票供应商
    private long id; //ID
    private String pubts; //时间戳
    private float oriSum; // 	含税金额
    private float oriMoney; //无税金额
    private float natSum; //本币含税金额
    private float natMoney; // 	本币无税金额

    public float getOriSum() {
        return oriSum;
    }

    public void setOriSum(float oriSum) {
        this.oriSum = oriSum;
    }

    public float getOriMoney() {
        return oriMoney;
    }

    public void setOriMoney(float oriMoney) {
        this.oriMoney = oriMoney;
    }

    public float getNatSum() {
        return natSum;
    }

    public void setNatSum(float natSum) {
        this.natSum = natSum;
    }

    public float getNatMoney() {
        return natMoney;
    }

    public void setNatMoney(float natMoney) {
        this.natMoney = natMoney;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype;
    }

    public String getBustype_name() {
        return bustype_name;
    }

    public void setBustype_name(String bustype_name) {
        this.bustype_name = bustype_name;
    }

    public String getVouchdate() {
        return vouchdate;
    }

    public void setVouchdate(String vouchdate) {
        this.vouchdate = vouchdate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCurrency_moneyDigit() {
        return currency_moneyDigit;
    }

    public void setCurrency_moneyDigit(String currency_moneyDigit) {
        this.currency_moneyDigit = currency_moneyDigit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency_priceDigit() {
        return currency_priceDigit;
    }

    public void setCurrency_priceDigit(String currency_priceDigit) {
        this.currency_priceDigit = currency_priceDigit;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
    }

    public String getNatCurrency_moneyDigit() {
        return natCurrency_moneyDigit;
    }

    public void setNatCurrency_moneyDigit(String natCurrency_moneyDigit) {
        this.natCurrency_moneyDigit = natCurrency_moneyDigit;
    }

    public String getNatCurrency_priceDigit() {
        return natCurrency_priceDigit;
    }

    public void setNatCurrency_priceDigit(String natCurrency_priceDigit) {
        this.natCurrency_priceDigit = natCurrency_priceDigit;
    }

    public String getNatCurrency() {
        return natCurrency;
    }

    public void setNatCurrency(String natCurrency) {
        this.natCurrency = natCurrency;
    }

    public String getNatCurrency_code() {
        return natCurrency_code;
    }

    public void setNatCurrency_code(String natCurrency_code) {
        this.natCurrency_code = natCurrency_code;
    }

    public String getNatCurrency_name() {
        return natCurrency_name;
    }

    public void setNatCurrency_name(String natCurrency_name) {
        this.natCurrency_name = natCurrency_name;
    }

    public String getExchRateType() {
        return exchRateType;
    }

    public void setExchRateType(String exchRateType) {
        this.exchRateType = exchRateType;
    }

    public String getExchRateType_name() {
        return exchRateType_name;
    }

    public void setExchRateType_name(String exchRateType_name) {
        this.exchRateType_name = exchRateType_name;
    }

    public String getExchRate() {
        return exchRate;
    }

    public void setExchRate(String exchRate) {
        this.exchRate = exchRate;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public List<PurchaseOrderBodyEntity> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrderBodyEntity> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public long getInvoiceVendor() {
        return invoiceVendor;
    }

    public void setInvoiceVendor(long invoiceVendor) {
        this.invoiceVendor = invoiceVendor;
    }

    public String getInvoiceVendor_name() {
        return invoiceVendor_name;
    }

    public void setInvoiceVendor_name(String invoiceVendor_name) {
        this.invoiceVendor_name = invoiceVendor_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPubts() {
        return pubts;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public long getOperator() {
        return operator;
    }

    public void setOperator(long operator) {
        this.operator = operator;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }
}
