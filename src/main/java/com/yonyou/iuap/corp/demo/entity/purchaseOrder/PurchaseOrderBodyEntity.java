package com.yonyou.iuap.corp.demo.entity.purchaseOrder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

import java.io.Serializable;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  采购订单表体
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderBodyEntity extends BaseEntity{
    private long id;  //ID
    private long mainid; //主表id
    private String inOrg;  //收货组织id
    private String inOrg_name; //收货组织名称
    private String org; //采购组织采购组织id
    private String org_name; //采购组织名称
    private String demandOrg; //需求组织id
    private String demandOrg_name; //需求组织名称
    private String inInvoiceOrg; //收票组织id
    private String inInvoiceOrg_name; //收票组织名称
    private String product_cCode;  //物料编码
    private long product;  //物料id
    private String product_cName; //物料名称
    private String product_oUnitId; // 	零售单位id
    private long unit;  //主计量单位id
    private String unit_name; //主计量单位名称
    private String unit_code; //主计量单位编码
    private String purUOM; //采购单位id
    private String purUOM_Name; // 采购单位名称
    private String purUOM_Code; //采购单位编码
    private long priceUOM; //计价单位id
    private String priceUOM_Name; //计价单位名称
    private String priceUOM_Code; //计价单位编码
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
    private long bustype; // 	交易类型
    private String bustype_name; // 	交易类型名称
    private long invoiceVendor; //开票供应商id
    private int modifyStatus; //修改状态
    private int totalQuantity; //总数量
    private long vendor; // 	供货供应商
    private String vendor_name; // 	供货供应商名称
    private float natCurrency_moneyDigit; //本币金额精度
    private float natCurrency_priceDigit; //本币单价精度
    private float currency_moneyDigit; //币种金额精度
    private float unit_Precision; //主计量精度
    private float moneysum; //金额
    private String natCurrency; //本币id
    private String natCurrency_code; // 	本币编码
    private String natCurrency_name; //本币名称
    private String code; //订单编号
    private String currency; //币种id
    private String currency_code; //币种编码
    private String currency_name; //币种名称
    private String vouchdate; // 	单据日期
    private float totalInQty; //累计入库数量
    private String pubts; //时间戳
    private String creator; //创建人
    private String creatorId; //创建人id
    private long operator; //采购员
    private String  operator_name; //采购员名称
    private String _status; //操作状态
    private int rowno; //行号


    public String getInOrg() {
        return inOrg;
    }

    public void setInOrg(String inOrg) {
        this.inOrg = inOrg;
    }

    public String getInOrg_name() {
        return inOrg_name;
    }

    public void setInOrg_name(String inOrg_name) {
        this.inOrg_name = inOrg_name;
    }

    public String getDemandOrg() {
        return demandOrg;
    }

    public void setDemandOrg(String demandOrg) {
        this.demandOrg = demandOrg;
    }

    public String getDemandOrg_name() {
        return demandOrg_name;
    }

    public void setDemandOrg_name(String demandOrg_name) {
        this.demandOrg_name = demandOrg_name;
    }

    public String getInInvoiceOrg() {
        return inInvoiceOrg;
    }

    public void setInInvoiceOrg(String inInvoiceOrg) {
        this.inInvoiceOrg = inInvoiceOrg;
    }

    public String getInInvoiceOrg_name() {
        return inInvoiceOrg_name;
    }

    public void setInInvoiceOrg_name(String inInvoiceOrg_name) {
        this.inInvoiceOrg_name = inInvoiceOrg_name;
    }

    public String getProduct_cCode() {
        return product_cCode;
    }

    public void setProduct_cCode(String product_cCode) {
        this.product_cCode = product_cCode;
    }


    public String getProduct_cName() {
        return product_cName;
    }

    public void setProduct_cName(String product_cName) {
        this.product_cName = product_cName;
    }

    public String getProduct_oUnitId() {
        return product_oUnitId;
    }

    public void setProduct_oUnitId(String product_oUnitId) {
        this.product_oUnitId = product_oUnitId;
    }


    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getUnit_code() {
        return unit_code;
    }

    public void setUnit_code(String unit_code) {
        this.unit_code = unit_code;
    }


    public String getPurUOM_Name() {
        return purUOM_Name;
    }

    public void setPurUOM_Name(String purUOM_Name) {
        this.purUOM_Name = purUOM_Name;
    }

    public String getPurUOM_Code() {
        return purUOM_Code;
    }

    public void setPurUOM_Code(String purUOM_Code) {
        this.purUOM_Code = purUOM_Code;
    }

    public String getPriceUOM_Name() {
        return priceUOM_Name;
    }

    public void setPriceUOM_Name(String priceUOM_Name) {
        this.priceUOM_Name = priceUOM_Name;
    }

    public String getPriceUOM_Code() {
        return priceUOM_Code;
    }

    public void setPriceUOM_Code(String priceUOM_Code) {
        this.priceUOM_Code = priceUOM_Code;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getBustype() {
        return bustype;
    }

    public void setBustype(long bustype) {
        this.bustype = bustype;
    }

    public String getBustype_name() {
        return bustype_name;
    }

    public void setBustype_name(String bustype_name) {
        this.bustype_name = bustype_name;
    }

    public int getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(int modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
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

    public String getNatCurrency_code() {
        return natCurrency_code;
    }

    public void setNatCurrency_code(String natCurrency_code) {
        this.natCurrency_code = natCurrency_code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getVouchdate() {
        return vouchdate;
    }

    public void setVouchdate(String vouchdate) {
        this.vouchdate = vouchdate;
    }

    public float getTotalInQty() {
        return totalInQty;
    }

    public void setTotalInQty(float totalInQty) {
        this.totalInQty = totalInQty;
    }

    public String getPubts() {
        return pubts;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public long getInvoiceVendor() {
        return invoiceVendor;
    }

    public void setInvoiceVendor(long invoiceVendor) {
        this.invoiceVendor = invoiceVendor;
    }

    public long getVendor() {
        return vendor;
    }

    public void setVendor(long vendor) {
        this.vendor = vendor;
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

    public int getInvExchRate() {
        return invExchRate;
    }

    public void setInvExchRate(int invExchRate) {
        this.invExchRate = invExchRate;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getNatCurrency_name() {
        return natCurrency_name;
    }

    public void setNatCurrency_name(String natCurrency_name) {
        this.natCurrency_name = natCurrency_name;
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
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

    public void setNatCurrency(String natCurrency) {
        this.natCurrency = natCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getMainid() {
        return mainid;
    }

    public void setMainid(long mainid) {
        this.mainid = mainid;
    }

    public String getNatCurrency() {
        return natCurrency;
    }

    @Override
    public String toString() {
        return "PurchaseOrderEntity{" +
                "id=" + id +
                ", inOrg='" + inOrg + '\'' +
                ", inOrg_name='" + inOrg_name + '\'' +
                ", org='" + org + '\'' +
                ", org_name='" + org_name + '\'' +
                ", demandOrg='" + demandOrg + '\'' +
                ", demandOrg_name='" + demandOrg_name + '\'' +
                ", inInvoiceOrg='" + inInvoiceOrg + '\'' +
                ", inInvoiceOrg_name='" + inInvoiceOrg_name + '\'' +
                ", product_cCode='" + product_cCode + '\'' +
                ", product=" + product +
                ", product_cName='" + product_cName + '\'' +
                ", product_oUnitId='" + product_oUnitId + '\'' +
                ", unit=" + unit +
                ", unit_name='" + unit_name + '\'' +
                ", unit_code='" + unit_code + '\'' +
                ", purUOM='" + purUOM + '\'' +
                ", purUOM_Name='" + purUOM_Name + '\'' +
                ", purUOM_Code='" + purUOM_Code + '\'' +
                ", priceUOM=" + priceUOM +
                ", priceUOM_Name='" + priceUOM_Name + '\'' +
                ", priceUOM_Code='" + priceUOM_Code + '\'' +
                ", oriUnitPrice=" + oriUnitPrice +
                ", oriTaxUnitPrice=" + oriTaxUnitPrice +
                ", natUnitPrice=" + natUnitPrice +
                ", natTaxUnitPrice=" + natTaxUnitPrice +
                ", oriMoney=" + oriMoney +
                ", oriSum=" + oriSum +
                ", natMoney=" + natMoney +
                ", natSum=" + natSum +
                ", oriTax=" + oriTax +
                ", natTax=" + natTax +
                ", invExchRate=" + invExchRate +
                ", qty=" + qty +
                ", subQty=" + subQty +
                ", priceQty=" + priceQty +
                ", bustype=" + bustype +
                ", bustype_name='" + bustype_name + '\'' +
                ", invoiceVendor=" + invoiceVendor +
                ", modifyStatus=" + modifyStatus +
                ", totalQuantity='" + totalQuantity + '\'' +
                ", vendor=" + vendor +
                ", vendor_name='" + vendor_name + '\'' +
                ", natCurrency_moneyDigit=" + natCurrency_moneyDigit +
                ", natCurrency_priceDigit=" + natCurrency_priceDigit +
                ", currency_moneyDigit=" + currency_moneyDigit +
                ", unit_Precision=" + unit_Precision +
                ", moneysum=" + moneysum +
                ", natCurrency_code='" + natCurrency_code + '\'' +
                ", code='" + code + '\'' +
                ", currency_code='" + currency_code + '\'' +
                ", vouchdate='" + vouchdate + '\'' +
                ", totalInQty=" + totalInQty +
                ", currency='" + currency + '\'' +
                ", pubts='" + pubts + '\'' +
                ", creator='" + creator + '\'' +
                ", creatorId='" + creatorId + '\'' +
                ", _status='" + _status + '\'' +
                ", rowno=" + rowno +
                '}';
    }
}
