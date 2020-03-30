package com.yonyou.iuap.corp.demo.api.V1;

import com.yonyou.iuap.corp.demo.entity.purchaseOrder.*;
import com.yonyou.iuap.corp.demo.utils.BaseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  采购订单
 */
@Component
public class PurchaseOrderService extends BaseApi{

    private static final Logger logger = LoggerFactory.getLogger(PurchaseOrderService.class);

    @Value("${api.purchaseorder.list}")
    private String list_uri;
    @Value("${api.purchaseorder.detail}")
    private String detail_uri;
    @Value("${api.purchaseorder.save}")
    private String save_uri;
    @Value("${api.purchaseorder.batchaudit}")
    private String batchaudit_uri;
    @Value("${api.purchaseorder.batchunaudit}")
    private String batchunaudit_uri;

    public PurchaseOrderListEntity list(Map<String,Object> params) throws Exception {
        PurchaseOrderListEntity data = requestPostPage2(list_uri,params,PurchaseOrderListEntity.class);
        return data;
    }


    public PurchaseOrderHeadEntity detail(Map<String,Object> params) throws Exception {
        PurchaseOrderHeadEntity result  =  doGet(detail_uri,params,PurchaseOrderHeadEntity.class);
        return result;
    }

    public PurchaseOrderHeadEntity save(PurchaseOrderSavePEntity purchaseOr) throws Exception {
        setSaveDefaultValue(purchaseOr);
        Map<String,Object> params = new HashMap<String,Object>();
        purchaseOr.set_status("Insert");
        params.put("data",purchaseOr);
        PurchaseOrderHeadEntity result = doPost(save_uri,params,PurchaseOrderHeadEntity.class);
        return result;
    }

    public void setSaveDefaultValue(PurchaseOrderSavePEntity order){
        order.setBustype("110000000000027");
        order.setBustype_name("普通采购");
        order.setVouchdate(BaseUtils.getCurrentData());
        order.setVendor(String.valueOf(order.getInvoiceVendor()));
        order.setOperator(order.getOperatorId());
        //币种金额精度
        order.setCurrency_moneyDigit("2");
        //币种Id
        order.setCurrency("G001ZM0000DEFAULTCURRENCT00000000001");
        //币种单价精度
        order.setCurrency_priceDigit("2");
        //币种编码
        order.setCurrency_code("CNY");
        //币种
        order.setCurrency_name("人民币");
        //本币金额精度
        order.setNatCurrency_moneyDigit("2");
        //本币单价精度
        order.setNatCurrency_priceDigit("6");
        //本币ID
        order.setNatCurrency("G001ZM0000DEFAULTCURRENCT00000000001");
        //本币编码
        order.setNatCurrency_code("CNY");
        //本币名称
        order.setNatCurrency_name("人民币");
        //汇率类型ID
        order.setExchRateType("94e57bbb31ea11eaa30e060cee0005d2");
        //汇率名称
        order.setExchRateType_name("基准汇率");
        //汇率
        order.setExchRate("1");

        List<PurchaseOrderSaveCEntity> list =  order.getPurchaseOrders();
        float totalMoney = 0;
        int j = 0;
        for(int i=0;i<list.size();i++){
            PurchaseOrderSaveCEntity orderCh = list.get(i);
            orderCh.setInOrg(order.getOrg());
            orderCh.setDemandOrg(order.getOrg());
            orderCh.setInInvoiceOrg(order.getOrg());
            orderCh.setOrg(order.getOrg());
            j = i+1;
            orderCh.setRowno(j);
            orderCh.set_status("Insert");
            orderCh.setPurUOM(String.valueOf(orderCh.getUnit()));
            orderCh.setPriceUOM(orderCh.getUnit());
            //主计量精度
            orderCh.setUnit_Precision(2);
            //含税单价
            orderCh.setOriTaxUnitPrice(orderCh.getOriUnitPrice());
            float thisMoneySum = orderCh.getOriUnitPrice()*orderCh.getQty();
            //无税金额
            orderCh.setOriMoney(thisMoneySum);
            //含税金额
            orderCh.setOriSum(thisMoneySum);
            //本币含税金额
            orderCh.setNatSum(thisMoneySum);
            //本币无税金额
            orderCh.setNatMoney(thisMoneySum);
            //采购数量
            orderCh.setSubQty(orderCh.getQty());
            //计价数量
            orderCh.setPriceQty(orderCh.getQty());
            //本币id
            orderCh.setNatCurrency("G001ZM0000DEFAULTCURRENCT00000000001");
            //税率
            //税额
            orderCh.setOriTax(0);
            //本币税额
            orderCh.setNatSum(0);
            //采购换算率
            orderCh.setInvExchRate(1);
            totalMoney+=thisMoneySum;
        }

        //无税金额
        order.setOriMoney(totalMoney);
        //本币无税金额
        order.setNatMoney(totalMoney);
        //含税金额
        order.setOriSum(totalMoney);
        //本币含税金额
        order.setNatSum(totalMoney);

    }
}
