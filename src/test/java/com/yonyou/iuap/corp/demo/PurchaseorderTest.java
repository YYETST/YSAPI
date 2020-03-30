package com.yonyou.iuap.corp.demo;

import com.yonyou.iuap.corp.demo.api.V1.PurchaseOrderService;
import com.yonyou.iuap.corp.demo.entity.purchaseOrder.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  采购订单测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchaseorderTest {

    @Autowired
    PurchaseOrderService purchaseOrderService;

    /**
     * 获取采购订单列表
     */
    @Test
    public void getPurchaseorderList() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        PurchaseOrderListEntity result = purchaseOrderService.list(params);
        List<PurchaseOrderBodyEntity> entity = result.getRecordList();
        System.out.println(entity.toString());
    }


    /**
     * 获取采购订单详情
     */
    @Test
    public void getPurchaseorderDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("id","1641557917372672");
        PurchaseOrderHeadEntity result = purchaseOrderService.detail(params);
        System.out.println(result.toString());
    }

    //列表返回的结果
    /*[PurchaseOrderEntity{
            inOrg='1640198360125696',
                    inOrg_name='河姆渡集成测试',
                    org='1640198360125696',
                    org_name='河姆渡集成测试',
                    demandOrg='1640198360125696',
                    demandOrg_name='河姆渡集成测试',
                    inInvoiceOrg='1640198360125696',
                    inInvoiceOrg_name='河姆渡集成测试',
                    product_cCode='010001',
                    product=1641556234555648,
                    product_cName='火腿',
                    product_oUnitId='null',
                    unit=1641549812257024,
                    unit_name='包',
                    unit_code='null',
                    purUOM='null',
                    purUOM_Name='null',
                    purUOM_Code='null',
                    priceUOM=1641549812257024,
                    priceUOM_Name='包',
                    priceUOM_Code='01',
                    oriUnitPrice=12.0,
                    oriTaxUnitPrice=13.56,
                    natUnitPrice=0.0,
                    natTaxUnitPrice=0.0,
                    oriMoney=0.0, oriSum=0.0, natMoney=0.0, natSum=0.0, oriTax=0.0, natTax=0.0,
                    qty=1000.0, subQty=0.0, priceQty=0.0,
                    bustype=110000000000027,
                    bustype_name='普通采购',
                    invoiceVendor='1641526656504064',
                    modifyStatus=0, totalQuantity='1000.0', listTaxRate=13,
                    vendor='1641526656504064',
                    vendor_name='双汇火腿',
                    natCurrency_moneyDigit=2.0, natCurrency_priceDigit=6.0,
                    currency_moneyDigit=2.0, unit_Precision=2.0,
                    moneysum=13560.0, natCurrency_code='CNY',
                    code='CGDD0001', currency_code='CNY', v
        ouchdate='2020-03-05 00:00:00', totalInQty=0.0,
                listOriMoney=12000.0,
                currency='G001ZM0000DEFAULTCURRENCT00000000001',
                pubts='2020-03-05 15:19:04', creator='倪帅臣',
                creatorId='null'}]*/

    @Test
    public void purchaseorderSave() throws Exception {
        PurchaseOrderSavePEntity order = new PurchaseOrderSavePEntity();
        order.setOrg("1640198360125696");
        order.setInvoiceVendor(1641526656504064L);
        order.setOperatorId(1641541568450816L);
        List<PurchaseOrderSaveCEntity> list = new ArrayList<PurchaseOrderSaveCEntity>();
        PurchaseOrderSaveCEntity orderCh = new PurchaseOrderSaveCEntity();
        orderCh.setInOrg("1640198360125696");
        orderCh.setDemandOrg("1640198360125696");
        orderCh.setInInvoiceOrg("1640198360125696");
        orderCh.setRowno(1);
        orderCh.set_status("Insert");
        orderCh.setProduct(1641556234555648L);
        orderCh.setUnit(1641549812257024L);
        orderCh.setPurUOM("1641549812257024");
        orderCh.setPriceUOM(1641549812257024L);
        //主计量精度
        orderCh.setUnit_Precision(2);
        //无税单价
        orderCh.setOriUnitPrice(200);
        //含税单价
        orderCh.setOriTaxUnitPrice(206);
        //无税金额
        orderCh.setOriMoney(400000);
        //含税金额
        orderCh.setOriSum(412000);
        //本币含税金额
        orderCh.setNatSum(400000);
        //本币无税金额
        orderCh.setNatMoney(412000);
        //数量
        orderCh.setQty(2000);
        //采购数量
        orderCh.setSubQty(2000);
        //计价数量
        orderCh.setPriceQty(2000);
        //税率
        //税额
        orderCh.setOriTax(12000);
        //本币税额
        orderCh.setNatSum(12000);
        //采购换算率
        orderCh.setInvExchRate(1);
        list.add(orderCh);
        order.setPurchaseOrders(list);
        PurchaseOrderHeadEntity result = purchaseOrderService.save(order);
        System.out.println(result);
    }
}
