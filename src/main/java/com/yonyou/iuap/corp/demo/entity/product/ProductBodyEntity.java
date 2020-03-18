package com.yonyou.iuap.corp.demo.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;


/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料表体数据
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductBodyEntity extends BaseEntity {
    private long manageClass; //物料分类ID
    private String manageClass_Code; //物料分类编码
    private String manageClass_Name;  //物料分类名称
    private long productApplyRangeId; //productApplyRangeIdid
    private long id; //主键
    private long productClass; //商品分类ID
    private String productClass_Name; //商品分类名称
    private String productClass_Code; //商品分类编码
    private int rangeType; //物料分配范围类型
    private int realProductAttribute; //物料类型
    private long orgId; //组织ID
    private String orgCode;//组织编码
    private String orgName; //组织名称
    private long unit;  //主计量单位ID
    private String unit_Name; //主计量单位
    private String pubts; //时间
    private String orgId_Name; //管理组织名称
    private String createDate; //创建日期
    private String creator; //创建人
    private String creatorId; //创建人id
    private String createTime; //创建时间
    private long productApplyRange_orgId; //使用组织id
    private String productApplyRange_orgId_Name; //使用组织名称
    private boolean enableAssistUnit; //启用辅计量
    private int unitUseType; //设置规则  1:使用物料模板。2：使用物料自己
    private String name;  //物料名称
    private String code;  //物料编码
    private String detailshortName; //物料简称
    private String detailmnemonicCode; //助记码
    private int realProductAttributeType; //实物物料属性
    private boolean isApplied; //是否被分配者使用
    @JsonProperty("detail!stopstatus")
    private boolean detailstopstatus; //是否启用
    @JsonProperty("detail!purchaseUnit")
    private long detailpurchaseUnit; //采购单位ID
    @JsonProperty("detail!purchasePriceUnit")
    private long detailpurchasePriceUnit; //采购计价单位ID
    @JsonProperty("detail!stockUnit")
    private long detailstockUnit; //库存单位ID
    @JsonProperty("detail!produceUnit")
    private long detailproduceUnit; //
    @JsonProperty("detail!batchPriceUnit")
    private long detailbatchPriceUnit; //批发计价单位ID
    @JsonProperty("detail!batchUnit")
    private long detailbatchUnit; //批发销售单位ID
    @JsonProperty("detail!onlineUnit")
    private long detailonlineUnit; //线上零售单位ID
    @JsonProperty("detail!offlineUnit")
    private long detailofflineUnit; //线下零售单位ID
    @JsonProperty("detail!requireUnit")
    private long detailrequireUnit;
    @JsonProperty("detail!iStatus")
    private boolean detailiStatus; //是否上架
    @JsonProperty("detail!businessAttribute")
    private String detailbusinessAttribute; //业务属性
    private String _status;  //什么操作 Insert / Update
    @JsonProperty("detail!isDisplayPrice")
    private boolean detailisDisplayPrice; //线上显示价格
    @JsonProperty("detail!isBatchManage")
    private boolean detailisBatchManage; //是否批次管理
    @JsonProperty("detail!valueManageType")
    private int detailvalueManageType; //价格管理模式
    @JsonProperty("detail!saleStyle")
    private int detailsaleStyle; //销售方式 1：现金购买，2：积分兑换
    @JsonProperty("detail!enableDeposit")
    private boolean detailenableDeposit; //启用定金业务
    @JsonProperty("detail!isRecommend")
    private boolean detailisRecommend; //是否推荐物料
    @JsonProperty("detail!displayName")
    private String detaildisplayName; //显示名称
    @JsonProperty("detail!fSalePrice")
    private float  detailfSalePrice; //线上零售价
    @JsonProperty("detail!fMarketPrice")
    private float  detailfMarketPrice; //市场价
    @JsonProperty("detail!saleChannel")
    private String detailsaleChannel; //销售渠道
    @JsonProperty("detail!iUOrderStatus")
    private boolean detailiUOrderStatus; //订货上架
    @JsonProperty("detail!canSale")
    private boolean detailcanSale; //是否可售
    @JsonProperty("detail!isExpiryDateManage")
    private boolean detailisExpiryDateManage;  //是否有有效期
    @JsonProperty("detail!expireDateNo")
    private int detailexpireDateNo; //保质期
    @JsonProperty("detail!expireDateUnit")
    private String detailexpireDateUnit; //保质期单位
    @JsonProperty("detail!isSerialNoManage")
    private boolean detailisSerialNoManage; //是否序列号管理


    @JsonProperty("detail!planDefaultAttribute")
    private String  detailplanDefaultAttribute;
    @JsonProperty("detail!planMethod")
    private int  detailplanMethod;
    @JsonProperty("detail!keySubPart")
    private boolean  detailkeySubPart;
    @JsonProperty("detail!supplyDemandPolicy")
    private int  detailsupplyDemandPolicy;
    @JsonProperty("detail!batchPolicy")
    private int  detailbatchPolicy;
    @JsonProperty("detail!supplyType")
    private int  detailsupplyType;
    @JsonProperty("detail!checkByCost")
    private boolean   detailcheckByCost; //按费用核算
    @JsonProperty("detail!checkByBatch")
    private boolean   detailcheckByBatch; //按批次核算
    @JsonProperty("detail!isCheckFree")
    private String    detailisCheckFree;  //按规格核算
    @JsonProperty("detail!enableSubscribe")
    private boolean    detailenableSubscribe;  //启用预订业务
    @JsonProperty("detail!depositDealPayType")
    private int    detaildepositDealPayType;  //定金设置方式
    @JsonProperty("detail!enablemodifyDeposit")
    private boolean    detailenablemodifyDeposit;  //订单改价时可修改定金
    @JsonProperty("detail!depositPayType")
    private int     detaildepositPayType;  //支付尾款方式
    @JsonProperty("time!id")
    private long     timeid; //ID
    @JsonProperty("time!productId")
    private long     timeproductId; //物料ID
    @JsonProperty("time!productApplyRangeId")
    private long     timeproductApplyRangeId; //物料分配范围ID
    @JsonProperty("time!iControlTime")
    private boolean  timeiControlTime; //线上付尾款规则
    @JsonProperty("time!ControlTimeType")
    private int    timeControlTimeType; //线上付尾款控制方式
    @JsonProperty("detail!serviceDurationUnit")
    private int    detailserviceDurationUnit;
    @JsonProperty("detail!canOrder")
    private boolean   detailcanOrder; //可预约
    @JsonProperty("detail!onlyOrder")
    private boolean   detailonlyOrder; //仅预约
    @JsonProperty("detail!orderAdvanceTime")
    private int   detailorderAdvanceTime; //预约提前期
    @JsonProperty("detail!iEnableCyclePurchase")
    private boolean   detailiEnableCyclePurchase; //启用周期购
    @JsonProperty("detail!isAllArea")
    private boolean   detailisAllArea; //适用所有区域
    @JsonProperty("detail!iEnableEcontract")
    private boolean   detailiEnableEcontract; //启用合同管理
    @JsonProperty("detail!allowStorePurchase")
    private boolean   detailallowStorePurchase; //允许门店自采
    @JsonProperty("detail!isSaleInOfflineStore")
    private boolean   detailisSaleInOfflineStore; //允许门店销售
    @JsonProperty("detail!isPriceChangeAllowed")
    private boolean   detailisPriceChangeAllowed; //允许开单改价
    @JsonProperty("detail!isOfflineStoreOrder")
    private boolean   detailisOfflineStoreOrder; //允许门店要货
    @JsonProperty("detail!isOfflineStoreReturn")
    private boolean   detailisOfflineStoreReturn;  //允许门店退货
    @JsonProperty("detail!retailPriceDimension")
    private int       detailretailPriceDimension; //零售价取价维度
    @JsonProperty("detail!isProcess")
    private boolean   detailisProcess; //加工
    @JsonProperty("detail!processType")
    private int      detailprocessType; //加工方式
    @JsonProperty("detail!isMaterial")
    private boolean    detailisMaterial; //材料
    @JsonProperty("detail!isWeight")
    private boolean    detailisWeight; //是否称重
    @JsonProperty("define!productId")
    private long     defineproductId; //物料ID

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductClass() {
        return productClass;
    }

    public void setProductClass(long productClass) {
        this.productClass = productClass;
    }

    public int getRangeType() {
        return rangeType;
    }

    public void setRangeType(int rangeType) {
        this.rangeType = rangeType;
    }

    public int getRealProductAttribute() {
        return realProductAttribute;
    }

    public void setRealProductAttribute(int realProductAttribute) {
        this.realProductAttribute = realProductAttribute;
    }

    public String getUnit_Name() {
        return unit_Name;
    }

    public void setUnit_Name(String unit_Name) {
        this.unit_Name = unit_Name;
    }

    public String getPubts() {
        return pubts;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public String getOrgId_Name() {
        return orgId_Name;
    }

    public void setOrgId_Name(String orgId_Name) {
        this.orgId_Name = orgId_Name;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getProductApplyRange_orgId_Name() {
        return productApplyRange_orgId_Name;
    }

    public void setProductApplyRange_orgId_Name(String productApplyRange_orgId_Name) {
        this.productApplyRange_orgId_Name = productApplyRange_orgId_Name;
    }

    public boolean isEnableAssistUnit() {
        return enableAssistUnit;
    }

    public void setEnableAssistUnit(boolean enableAssistUnit) {
        this.enableAssistUnit = enableAssistUnit;
    }

    public int getUnitUseType() {
        return unitUseType;
    }

    public void setUnitUseType(int unitUseType) {
        this.unitUseType = unitUseType;
    }

    public long getUnit() {
        return unit;
    }

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getRealProductAttributeType() {
        return realProductAttributeType;
    }

    public void setRealProductAttributeType(int realProductAttributeType) {
        this.realProductAttributeType = realProductAttributeType;
    }

    public String getProductClass_Name() {
        return productClass_Name;
    }

    public void setProductClass_Name(String productClass_Name) {
        this.productClass_Name = productClass_Name;
    }

    public long getManageClass() {
        return manageClass;
    }

    public void setManageClass(long manageClass) {
        this.manageClass = manageClass;
    }

    public boolean isApplied() {
        return isApplied;
    }

    public void setApplied(boolean applied) {
        isApplied = applied;
    }

    public long getProductApplyRange_orgId() {
        return productApplyRange_orgId;
    }

    public void setProductApplyRange_orgId(long productApplyRange_orgId) {
        this.productApplyRange_orgId = productApplyRange_orgId;
    }

    public String getManageClass_Code() {
        return manageClass_Code;
    }

    public void setManageClass_Code(String manageClass_Code) {
        this.manageClass_Code = manageClass_Code;
    }

    public String getManageClass_Name() {
        return manageClass_Name;
    }

    public void setManageClass_Name(String manageClass_Name) {
        this.manageClass_Name = manageClass_Name;
    }

    public String getProductClass_Code() {
        return productClass_Code;
    }

    public void setProductClass_Code(String productClass_Code) {
        this.productClass_Code = productClass_Code;
    }

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public boolean isDetailstopstatus() {
        return detailstopstatus;
    }

    public void setDetailstopstatus(boolean detailstopstatus) {
        this.detailstopstatus = detailstopstatus;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public long getDetailpurchaseUnit() {
        return detailpurchaseUnit;
    }

    public void setDetailpurchaseUnit(long detailpurchaseUnit) {
        this.detailpurchaseUnit = detailpurchaseUnit;
    }

    public long getDetailpurchasePriceUnit() {
        return detailpurchasePriceUnit;
    }

    public void setDetailpurchasePriceUnit(long detailpurchasePriceUnit) {
        this.detailpurchasePriceUnit = detailpurchasePriceUnit;
    }

    public long getDetailstockUnit() {
        return detailstockUnit;
    }

    public void setDetailstockUnit(long detailstockUnit) {
        this.detailstockUnit = detailstockUnit;
    }

    public long getDetailbatchPriceUnit() {
        return detailbatchPriceUnit;
    }

    public void setDetailbatchPriceUnit(long detailbatchPriceUnit) {
        this.detailbatchPriceUnit = detailbatchPriceUnit;
    }

    public long getDetailbatchUnit() {
        return detailbatchUnit;
    }

    public void setDetailbatchUnit(long detailbatchUnit) {
        this.detailbatchUnit = detailbatchUnit;
    }

    public long getDetailonlineUnit() {
        return detailonlineUnit;
    }

    public void setDetailonlineUnit(long detailonlineUnit) {
        this.detailonlineUnit = detailonlineUnit;
    }

    public long getDetailofflineUnit() {
        return detailofflineUnit;
    }

    public void setDetailofflineUnit(long detailofflineUnit) {
        this.detailofflineUnit = detailofflineUnit;
    }

    public String getDetailshortName() {
        return detailshortName;
    }

    public void setDetailshortName(String detailshortName) {
        this.detailshortName = detailshortName;
    }

    public String getDetailmnemonicCode() {
        return detailmnemonicCode;
    }

    public void setDetailmnemonicCode(String detailmnemonicCode) {
        this.detailmnemonicCode = detailmnemonicCode;
    }

    public boolean isDetailiStatus() {
        return detailiStatus;
    }

    public void setDetailiStatus(boolean detailiStatus) {
        this.detailiStatus = detailiStatus;
    }

    public String getDetailbusinessAttribute() {
        return detailbusinessAttribute;
    }

    public void setDetailbusinessAttribute(String detailbusinessAttribute) {
        this.detailbusinessAttribute = detailbusinessAttribute;
    }

    public boolean isDetailisDisplayPrice() {
        return detailisDisplayPrice;
    }

    public void setDetailisDisplayPrice(boolean detailisDisplayPrice) {
        this.detailisDisplayPrice = detailisDisplayPrice;
    }

    public boolean isDetailisBatchManage() {
        return detailisBatchManage;
    }

    public void setDetailisBatchManage(boolean detailisBatchManage) {
        this.detailisBatchManage = detailisBatchManage;
    }

    public int getDetailvalueManageType() {
        return detailvalueManageType;
    }

    public void setDetailvalueManageType(int detailvalueManageType) {
        this.detailvalueManageType = detailvalueManageType;
    }

    public int getDetailsaleStyle() {
        return detailsaleStyle;
    }

    public void setDetailsaleStyle(int detailsaleStyle) {
        this.detailsaleStyle = detailsaleStyle;
    }

    public boolean isDetailenableDeposit() {
        return detailenableDeposit;
    }

    public void setDetailenableDeposit(boolean detailenableDeposit) {
        this.detailenableDeposit = detailenableDeposit;
    }

    public boolean isDetailisRecommend() {
        return detailisRecommend;
    }

    public void setDetailisRecommend(boolean detailisRecommend) {
        this.detailisRecommend = detailisRecommend;
    }

    public String getDetaildisplayName() {
        return detaildisplayName;
    }

    public void setDetaildisplayName(String detaildisplayName) {
        this.detaildisplayName = detaildisplayName;
    }

    public float getDetailfSalePrice() {
        return detailfSalePrice;
    }

    public void setDetailfSalePrice(float detailfSalePrice) {
        this.detailfSalePrice = detailfSalePrice;
    }

    public float getDetailfMarketPrice() {
        return detailfMarketPrice;
    }

    public void setDetailfMarketPrice(float detailfMarketPrice) {
        this.detailfMarketPrice = detailfMarketPrice;
    }

    public long getProductApplyRangeId() {
        return productApplyRangeId;
    }

    public void setProductApplyRangeId(long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public String getDetailsaleChannel() {
        return detailsaleChannel;
    }

    public void setDetailsaleChannel(String detailsaleChannel) {
        this.detailsaleChannel = detailsaleChannel;
    }

    public boolean isDetailiUOrderStatus() {
        return detailiUOrderStatus;
    }

    public void setDetailiUOrderStatus(boolean detailiUOrderStatus) {
        this.detailiUOrderStatus = detailiUOrderStatus;
    }

    public boolean isDetailcanSale() {
        return detailcanSale;
    }

    public void setDetailcanSale(boolean detailcanSale) {
        this.detailcanSale = detailcanSale;
    }

    public boolean isDetailisExpiryDateManage() {
        return detailisExpiryDateManage;
    }

    public void setDetailisExpiryDateManage(boolean detailisExpiryDateManage) {
        this.detailisExpiryDateManage = detailisExpiryDateManage;
    }

    public int getDetailexpireDateNo() {
        return detailexpireDateNo;
    }

    public void setDetailexpireDateNo(int detailexpireDateNo) {
        this.detailexpireDateNo = detailexpireDateNo;
    }

    public String getDetailexpireDateUnit() {
        return detailexpireDateUnit;
    }

    public void setDetailexpireDateUnit(String detailexpireDateUnit) {
        this.detailexpireDateUnit = detailexpireDateUnit;
    }

    public boolean isDetailisSerialNoManage() {
        return detailisSerialNoManage;
    }

    public void setDetailisSerialNoManage(boolean detailisSerialNoManage) {
        this.detailisSerialNoManage = detailisSerialNoManage;
    }

    public String getDetailplanDefaultAttribute() {
        return detailplanDefaultAttribute;
    }

    public void setDetailplanDefaultAttribute(String detailplanDefaultAttribute) {
        this.detailplanDefaultAttribute = detailplanDefaultAttribute;
    }

    public int getDetailplanMethod() {
        return detailplanMethod;
    }

    public void setDetailplanMethod(int detailplanMethod) {
        this.detailplanMethod = detailplanMethod;
    }

    public boolean isDetailkeySubPart() {
        return detailkeySubPart;
    }

    public void setDetailkeySubPart(boolean detailkeySubPart) {
        this.detailkeySubPart = detailkeySubPart;
    }

    public int getDetailsupplyDemandPolicy() {
        return detailsupplyDemandPolicy;
    }

    public void setDetailsupplyDemandPolicy(int detailsupplyDemandPolicy) {
        this.detailsupplyDemandPolicy = detailsupplyDemandPolicy;
    }

    public int getDetailbatchPolicy() {
        return detailbatchPolicy;
    }

    public void setDetailbatchPolicy(int detailbatchPolicy) {
        this.detailbatchPolicy = detailbatchPolicy;
    }

    public int getDetailsupplyType() {
        return detailsupplyType;
    }

    public void setDetailsupplyType(int detailsupplyType) {
        this.detailsupplyType = detailsupplyType;
    }

    public boolean isDetailcheckByCost() {
        return detailcheckByCost;
    }

    public void setDetailcheckByCost(boolean detailcheckByCost) {
        this.detailcheckByCost = detailcheckByCost;
    }

    public boolean isDetailcheckByBatch() {
        return detailcheckByBatch;
    }

    public void setDetailcheckByBatch(boolean detailcheckByBatch) {
        this.detailcheckByBatch = detailcheckByBatch;
    }

    public String getDetailisCheckFree() {
        return detailisCheckFree;
    }

    public void setDetailisCheckFree(String detailisCheckFree) {
        this.detailisCheckFree = detailisCheckFree;
    }

    public boolean isDetailenableSubscribe() {
        return detailenableSubscribe;
    }

    public void setDetailenableSubscribe(boolean detailenableSubscribe) {
        this.detailenableSubscribe = detailenableSubscribe;
    }

    public int getDetaildepositDealPayType() {
        return detaildepositDealPayType;
    }

    public void setDetaildepositDealPayType(int detaildepositDealPayType) {
        this.detaildepositDealPayType = detaildepositDealPayType;
    }

    public boolean isDetailenablemodifyDeposit() {
        return detailenablemodifyDeposit;
    }

    public void setDetailenablemodifyDeposit(boolean detailenablemodifyDeposit) {
        this.detailenablemodifyDeposit = detailenablemodifyDeposit;
    }

    public int getDetaildepositPayType() {
        return detaildepositPayType;
    }

    public void setDetaildepositPayType(int detaildepositPayType) {
        this.detaildepositPayType = detaildepositPayType;
    }

    public long getTimeid() {
        return timeid;
    }

    public void setTimeid(long timeid) {
        this.timeid = timeid;
    }

    public long getTimeproductId() {
        return timeproductId;
    }

    public void setTimeproductId(long timeproductId) {
        this.timeproductId = timeproductId;
    }

    public long getTimeproductApplyRangeId() {
        return timeproductApplyRangeId;
    }

    public void setTimeproductApplyRangeId(long timeproductApplyRangeId) {
        this.timeproductApplyRangeId = timeproductApplyRangeId;
    }

    public boolean isTimeiControlTime() {
        return timeiControlTime;
    }

    public void setTimeiControlTime(boolean timeiControlTime) {
        this.timeiControlTime = timeiControlTime;
    }

    public int getTimeControlTimeType() {
        return timeControlTimeType;
    }

    public void setTimeControlTimeType(int timeControlTimeType) {
        this.timeControlTimeType = timeControlTimeType;
    }

    public int getDetailserviceDurationUnit() {
        return detailserviceDurationUnit;
    }

    public void setDetailserviceDurationUnit(int detailserviceDurationUnit) {
        this.detailserviceDurationUnit = detailserviceDurationUnit;
    }

    public boolean isDetailcanOrder() {
        return detailcanOrder;
    }

    public void setDetailcanOrder(boolean detailcanOrder) {
        this.detailcanOrder = detailcanOrder;
    }

    public boolean isDetailonlyOrder() {
        return detailonlyOrder;
    }

    public void setDetailonlyOrder(boolean detailonlyOrder) {
        this.detailonlyOrder = detailonlyOrder;
    }

    public int getDetailorderAdvanceTime() {
        return detailorderAdvanceTime;
    }

    public void setDetailorderAdvanceTime(int detailorderAdvanceTime) {
        this.detailorderAdvanceTime = detailorderAdvanceTime;
    }

    public boolean isDetailiEnableCyclePurchase() {
        return detailiEnableCyclePurchase;
    }

    public void setDetailiEnableCyclePurchase(boolean detailiEnableCyclePurchase) {
        this.detailiEnableCyclePurchase = detailiEnableCyclePurchase;
    }

    public boolean isDetailisAllArea() {
        return detailisAllArea;
    }

    public void setDetailisAllArea(boolean detailisAllArea) {
        this.detailisAllArea = detailisAllArea;
    }

    public boolean isDetailiEnableEcontract() {
        return detailiEnableEcontract;
    }

    public void setDetailiEnableEcontract(boolean detailiEnableEcontract) {
        this.detailiEnableEcontract = detailiEnableEcontract;
    }

    public boolean isDetailallowStorePurchase() {
        return detailallowStorePurchase;
    }

    public void setDetailallowStorePurchase(boolean detailallowStorePurchase) {
        this.detailallowStorePurchase = detailallowStorePurchase;
    }

    public boolean isDetailisSaleInOfflineStore() {
        return detailisSaleInOfflineStore;
    }

    public void setDetailisSaleInOfflineStore(boolean detailisSaleInOfflineStore) {
        this.detailisSaleInOfflineStore = detailisSaleInOfflineStore;
    }

    public boolean isDetailisPriceChangeAllowed() {
        return detailisPriceChangeAllowed;
    }

    public void setDetailisPriceChangeAllowed(boolean detailisPriceChangeAllowed) {
        this.detailisPriceChangeAllowed = detailisPriceChangeAllowed;
    }

    public boolean isDetailisOfflineStoreOrder() {
        return detailisOfflineStoreOrder;
    }

    public void setDetailisOfflineStoreOrder(boolean detailisOfflineStoreOrder) {
        this.detailisOfflineStoreOrder = detailisOfflineStoreOrder;
    }

    public boolean isDetailisOfflineStoreReturn() {
        return detailisOfflineStoreReturn;
    }

    public void setDetailisOfflineStoreReturn(boolean detailisOfflineStoreReturn) {
        this.detailisOfflineStoreReturn = detailisOfflineStoreReturn;
    }

    public int getDetailretailPriceDimension() {
        return detailretailPriceDimension;
    }

    public void setDetailretailPriceDimension(int detailretailPriceDimension) {
        this.detailretailPriceDimension = detailretailPriceDimension;
    }

    public boolean isDetailisProcess() {
        return detailisProcess;
    }

    public void setDetailisProcess(boolean detailisProcess) {
        this.detailisProcess = detailisProcess;
    }

    public int getDetailprocessType() {
        return detailprocessType;
    }

    public void setDetailprocessType(int detailprocessType) {
        this.detailprocessType = detailprocessType;
    }

    public boolean isDetailisMaterial() {
        return detailisMaterial;
    }

    public void setDetailisMaterial(boolean detailisMaterial) {
        this.detailisMaterial = detailisMaterial;
    }

    public boolean isDetailisWeight() {
        return detailisWeight;
    }

    public void setDetailisWeight(boolean detailisWeight) {
        this.detailisWeight = detailisWeight;
    }

    public long getDefineproductId() {
        return defineproductId;
    }

    public void setDefineproductId(long defineproductId) {
        this.defineproductId = defineproductId;
    }

    public long getDetailproduceUnit() {
        return detailproduceUnit;
    }

    public void setDetailproduceUnit(long detailproduceUnit) {
        this.detailproduceUnit = detailproduceUnit;
    }

    public long getDetailrequireUnit() {
        return detailrequireUnit;
    }

    public void setDetailrequireUnit(long detailrequireUnit) {
        this.detailrequireUnit = detailrequireUnit;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
}
