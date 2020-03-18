package com.yonyou.iuap.corp.demo.api.V1;

import com.yonyou.iuap.corp.demo.entity.purchaseOrder.PurchaseOrderListEntity;
import com.yonyou.iuap.corp.demo.entity.purchaseOrder.PurchaseOrderHeadEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
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

    public PurchaseOrderHeadEntity save(PurchaseOrderHeadEntity purchaseOr) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        purchaseOr.set_status("Insert");
        params.put("data",purchaseOr);
        PurchaseOrderHeadEntity result = doPost(save_uri,params,PurchaseOrderHeadEntity.class);
        return result;
    }
}
