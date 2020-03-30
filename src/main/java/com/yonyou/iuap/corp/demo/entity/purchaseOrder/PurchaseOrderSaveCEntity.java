package com.yonyou.iuap.corp.demo.entity.purchaseOrder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/30
 * @des 采购订单保存子表
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderSaveCEntity extends BaseEntity {
    private long id;  //ID
    private long mainid; //主表id
    private String inOrg;  //收货组织id
    private String org; //采购组织采购组织id
    private String demandOrg; //需求组织id
    private String inInvoiceOrg; //收票组织id
    private long product;  //物料id
    private long unit;  //主计量单位id
    private String purUOM; //采购单位id
    private long priceUOM; //计价单位id
    private float oriUnitPrice; //无税单价
    private float oriTaxUnitPrice; //含税单价
    private float natUnitPrice; //本币无税单价
    private float natTaxUnitPrice; // 本币含税单价
    private float oriMoney; //无税金额
    private float oriSum; //含税金额
    private float natMoney; //本币无税金额
    private float natSum; // 	本币含税金额
    private float oriTax; //税额
    private float natTax; //本币税额
    private int invExchRate; //采购换算率
    private float qty; //数量
    private float subQty; //采购数量
    private float priceQty; //计价数量
    private long invoiceVendor; //开票供应商id
    private int modifyStatus; //修改状态
    private int totalQuantity; //总数量
    private long vendor; // 	供货供应商
    private float natCurrency_moneyDigit; //本币金额精度
    private float natCurrency_priceDigit; //本币单价精度
    private float currency_moneyDigit; //币种金额精度
    private float unit_Precision; //主计量精度
    private float moneysum; //金额
    private String natCurrency; //本币id
    private String _status; //操作状态
    private int rowno; //行号

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMainid() {
        return mainid;
    }

    public void setMainid(long mainid) {
        this.mainid = mainid;
    }

    public String getInOrg() {
        return inOrg;
    }

    public void setInOrg(String inOrg) {
        this.inOrg = inOrg;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getDemandOrg() {
        return demandOrg;
    }

    public void setDemandOrg(String demandOrg) {
        this.demandOrg = demandOrg;
    }

    public String getInInvoiceOrg() {
        return inInvoiceOrg;
    }

    public void setInInvoiceOrg(String inInvoiceOrg) {
        this.inInvoiceOrg = inInvoiceOrg;
    }

    public long getProduct() {
        return product;
    }

    public void setProduct(long product) {
        this.product = product;
    }

    public long getUnit() {
        return unit;
    }

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public String getPurUOM() {
        return purUOM;
    }

    public void setPurUOM(String purUOM) {
        this.purUOM = purUOM;
    }

    public long getPriceUOM() {
        return priceUOM;
    }

    public void setPriceUOM(long priceUOM) {
        this.priceUOM = priceUOM;
    }

    public float getOriUnitPrice() {
        return oriUnitPrice;
    }

    public void setOriUnitPrice(float oriUnitPrice) {
        this.oriUnitPrice = oriUnitPrice;
    }

    public float getOriTaxUnitPrice() {
        return oriTaxUnitPrice;
    }

    public void setOriTaxUnitPrice(float oriTaxUnitPrice) {
        this.oriTaxUnitPrice = oriTaxUnitPrice;
    }

    public float getNatUnitPrice() {
        return natUnitPrice;
    }

    public void setNatUnitPrice(float natUnitPrice) {
        this.natUnitPrice = natUnitPrice;
    }

    public float getNatTaxUnitPrice() {
        return natTaxUnitPrice;
    }

    public void setNatTaxUnitPrice(float natTaxUnitPrice) {
        this.natTaxUnitPrice = natTaxUnitPrice;
    }

    public float getOriMoney() {
        return oriMoney;
    }

    public void setOriMoney(float oriMoney) {
        this.oriMoney = oriMoney;
    }

    public float getOriSum() {
        return oriSum;
    }

    public void setOriSum(float oriSum) {
        this.oriSum = oriSum;
    }

    public float getNatMoney() {
        return natMoney;
    }

    public void setNatMoney(float natMoney) {
        this.natMoney = natMoney;
    }

    public float getNatSum() {
        return natSum;
    }

    public void setNatSum(float natSum) {
        this.natSum = natSum;
    }

    public float getOriTax() {
        return oriTax;
    }

    public void setOriTax(float oriTax) {
        this.oriTax = oriTax;
    }

    public float getNatTax() {
        return natTax;
    }

    public void setNatTax(float natTax) {
        this.natTax = natTax;
    }

    public int getInvExchRate() {
        return invExchRate;
    }

    public void setInvExchRate(int invExchRate) {
        this.invExchRate = invExchRate;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public float getSubQty() {
        return subQty;
    }

    public void setSubQty(float subQty) {
        this.subQty = subQty;
    }

    public float getPriceQty() {
        return priceQty;
    }

    public void setPriceQty(float priceQty) {
        this.priceQty = priceQty;
    }

    public long getInvoiceVendor() {
        return invoiceVendor;
    }

    public void setInvoiceVendor(long invoiceVendor) {
        this.invoiceVendor = invoiceVendor;
    }

    public int getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(int modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public long getVendor() {
        return vendor;
    }

    public void setVendor(long vendor) {
        this.vendor = vendor;
    }

    public float getNatCurrency_moneyDigit() {
        return natCurrency_moneyDigit;
    }

    public void setNatCurrency_moneyDigit(float natCurrency_moneyDigit) {
        this.natCurrency_moneyDigit = natCurrency_moneyDigit;
    }

    public float getNatCurrency_priceDigit() {
        return natCurrency_priceDigit;
    }

    public void setNatCurrency_priceDigit(float natCurrency_priceDigit) {
        this.natCurrency_priceDigit = natCurrency_priceDigit;
    }

    public float getCurrency_moneyDigit() {
        return currency_moneyDigit;
    }

    public void setCurrency_moneyDigit(float currency_moneyDigit) {
        this.currency_moneyDigit = currency_moneyDigit;
    }

    public float getUnit_Precision() {
        return unit_Precision;
    }

    public void setUnit_Precision(float unit_Precision) {
        this.unit_Precision = unit_Precision;
    }

    public float getMoneysum() {
        return moneysum;
    }

    public void setMoneysum(float moneysum) {
        this.moneysum = moneysum;
    }

    public String getNatCurrency() {
        return natCurrency;
    }

    public void setNatCurrency(String natCurrency) {
        this.natCurrency = natCurrency;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public int getRowno() {
        return rowno;
    }

    public void setRowno(int rowno) {
        this.rowno = rowno;
    }
}
