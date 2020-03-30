package com.yonyou.iuap.corp.demo.api.V1.product;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.product.ProductBodyEntity;
import com.yonyou.iuap.corp.demo.entity.product.ProductHeadEntity;
import com.yonyou.iuap.corp.demo.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料
 */
@Component
public class ProductProService extends BaseApi {

    @Value("${api.product.list}")
    private String list_uri;
    @Value("${api.product.detail}")
    private String detail_uri;
    @Value("${api.product.save}")
    private String save_uri;

    /**
     * 获取物料列表
     * @param params
     * @return
     */
    public ProductHeadEntity list(Map<String, Object> params) throws Exception {
        ProductHeadEntity result =  requestPostPage2(list_uri,params,ProductHeadEntity.class);
        return result;
    }

    /**
     * 获取物料详情
     * @param params
     * @return
     */
    public ProductBodyEntity detail(Map<String, Object> params) throws Exception {
        ProductBodyEntity result = doGet(detail_uri,params,ProductBodyEntity.class);
        return result;
    }

    /**
     * 物料保存
     */
    public ProductBodyEntity save(ProductBodyEntity product) throws Exception {
        setSaveDefaultValue(product);
        Map<String,Object> params = new HashMap<String,Object>();
        product.set_status("Insert");
        params.put("data",product);
        ProductBodyEntity result = doPost(save_uri,params,ProductBodyEntity.class);
        return result;
    }

    /**
     * 设置保存的默认值
     * @param body
     */
    private void setSaveDefaultValue(ProductBodyEntity body){
        body.setRealProductAttribute(1);
        body.setUnitUseType(2);
        body.setDetailbatchPriceUnit(body.getUnit());
        body.setDetailbatchUnit(body.getUnit());
        body.setDetailofflineUnit(body.getUnit());
        body.setDetailonlineUnit(body.getUnit());
        body.setDetailpurchasePriceUnit(body.getUnit());
        body.setDetailpurchaseUnit(body.getUnit());
        body.setDetailstockUnit(body.getUnit());
        body.setDetailproduceUnit(body.getUnit());
        body.setDetailrequireUnit(body.getUnit());
        body.setDetailiStatus(false);
        body.setDetailstopstatus(false);
        body.setDetailbusinessAttribute("1");
        body.setDetailisDisplayPrice(true);
        body.setDetailisBatchManage(false);
        body.setDetailvalueManageType(0);
        body.setDetailsaleStyle(1);
        body.setDetailenableDeposit(false);
        body.setDetailisRecommend(false);
        body.setDetailfSalePrice(body.getDetailfMarketPrice());
        //666666表示企业级账号
        body.setOrgId(666666);
        body.setProductApplyRange_orgId(666666);
        body.setPubts(BaseUtils.getCurrentData());
        //物料名称简称
        body.setDetailshortName(body.getName());
        //助记码
        body.setDetailmnemonicCode(body.getName());
        body.setDetaildisplayName(body.getName());
    }



}
