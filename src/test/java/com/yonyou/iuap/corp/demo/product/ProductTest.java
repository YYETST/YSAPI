package com.yonyou.iuap.corp.demo.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yonyou.iuap.corp.demo.api.V1.product.ProductProService;
import com.yonyou.iuap.corp.demo.entity.product.ProductBodyEntity;
import com.yonyou.iuap.corp.demo.entity.product.ProductHeadEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {

    @Autowired
    ProductProService productProService;

    /**
     * 获取物料列表
     */
    @Test
    public void getProductList() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        ProductHeadEntity result = productProService.list(params);
        System.out.println(result.toString());
    }


    /**
     * 获取物料详情
     */
    @Test
    public void getProductDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("id","1641556234555648");
        params.put("productApplyRangeId","1641556234768640");
        ProductBodyEntity result = productProService.detail(params);
        System.out.println(result.toString());
    }


    @Test
    public void save() throws Exception {
        ProductBodyEntity body = new ProductBodyEntity();
        body.setManageClass(1641547087630592L);
        body.setOrgId(666666);
        body.setProductApplyRange_orgId(666666);
        body.setCode("1009");
        body.setName("MBBB");
        body.setDetailshortName("MBBB");
        body.setDetailmnemonicCode("MB");
        body.setRealProductAttribute(1);
        body.setUnitUseType(2);
        body.setUnit(1641554627268864L);
        body.setDetailbatchPriceUnit(1641554627268864L);
        body.setDetailbatchUnit(1641554627268864L);
        body.setDetailofflineUnit(1641554627268864L);
        body.setDetailonlineUnit(1641554627268864L);
        body.setDetailpurchasePriceUnit(1641554627268864L);
        body.setDetailpurchaseUnit(1641554627268864L);
        body.setDetailstockUnit(1641554627268864L);
        body.setDetailproduceUnit(1641554627268864L);
        body.setDetailrequireUnit(1641554627268864L);
        body.setDetailiStatus(false);
        body.setDetailstopstatus(false);
        body.setDetailbusinessAttribute("1");
        body.setCreator("倪帅臣");
        body.setCreatorId("1641541568450816");
        body.setDetailisDisplayPrice(true);
        body.setDetailisBatchManage(false);
        body.setDetailvalueManageType(0);
        body.setDetailsaleStyle(1);
        body.setDetailenableDeposit(false);
        body.setDetailisRecommend(false);
        body.setDetaildisplayName("MBBB");
        body.setDetailfSalePrice(21.1F);
        body.setDetailfMarketPrice(21.1F);
        body.setPubts("2020-03-11 15:32:10");

        /*body.setRealProductAttributeType(1);
        body.setDetailsaleChannel("1,2,3");
        body.setDetailiUOrderStatus(false);
        body.setDetailcanSale(true);
        body.setDetailisExpiryDateManage(false);
        body.setDetailisSerialNoManage(false);
        body.setDetailplanDefaultAttribute("0");
        body.setDetailplanMethod(0);
        body.setDetailkeySubPart(false);
        body.setDetailsupplyDemandPolicy(0);
        body.setDetailbatchPolicy(0);
        body.setDetailsupplyType(0);
        body.setDetailcheckByCost(false);
        body.setDetailcheckByBatch(false);
        body.setDetailisCheckFree("0");
        body.setDetailenableSubscribe(false);
        body.setDetaildepositDealPayType(0);
        body.setDetailenablemodifyDeposit(false);
        body.setDetaildepositPayType(0);*/

        /*"detail!serviceDurationUnit": 1,
                "detail!canOrder": false,
                "detail!onlyOrder": false,
                "detail!orderAdvanceTime": 0,
                "detail!iEnableCyclePurchase": false,
                "detail!isAllArea": false,
                "detail!iEnableEcontract": false,
                "detail!isRecommend": false,
                "detail!allowStorePurchase": true,
                "detail!isSaleInOfflineStore": false,
                "detail!isPriceChangeAllowed": false,
                "detail!isOfflineStoreOrder": false,
                "detail!isOfflineStoreReturn": true,
                "detail!retailPriceDimension": 1,
                "detail!isProcess": false,
                "detail!processType": 0,
                "detail!isMaterial": false,
                "detail!isWeight": false,
                "define!productId": 1623168294916352,
                "productBarCodes": [],
        "productspecitems": [],
        "_status": "Update",
                "productApplyRangeId": 1623168295866734,
                "isCreator": true,
                "isApplied": true*/
        ProductBodyEntity result = productProService.save(body);
        System.out.println(result);
    }
}
