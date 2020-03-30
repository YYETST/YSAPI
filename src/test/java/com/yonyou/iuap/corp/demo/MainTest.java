package com.yonyou.iuap.corp.demo;

import com.yonyou.iuap.corp.demo.api.V1.PurchaseOrderService;
import com.yonyou.iuap.corp.demo.api.V1.vendor.VendorClassService;
import com.yonyou.iuap.corp.demo.api.V1.vendor.VendorInfoService;
import com.yonyou.iuap.corp.demo.api.V1.product.ProclassService;
import com.yonyou.iuap.corp.demo.api.V1.product.ProductProService;
import com.yonyou.iuap.corp.demo.entity.Language;
import com.yonyou.iuap.corp.demo.entity.product.ProClassEntity;
import com.yonyou.iuap.corp.demo.entity.product.ProClassListEntity;
import com.yonyou.iuap.corp.demo.entity.product.ProClassSaveEntity;
import com.yonyou.iuap.corp.demo.entity.product.ProductBodyEntity;
import com.yonyou.iuap.corp.demo.entity.purchaseOrder.PurchaseOrderBodyEntity;
import com.yonyou.iuap.corp.demo.entity.purchaseOrder.PurchaseOrderHeadEntity;
import com.yonyou.iuap.corp.demo.entity.purchaseOrder.PurchaseOrderSaveCEntity;
import com.yonyou.iuap.corp.demo.entity.purchaseOrder.PurchaseOrderSavePEntity;
import com.yonyou.iuap.corp.demo.entity.vendor.VendorClassEntity;
import com.yonyou.iuap.corp.demo.entity.vendor.VendorInfoBodyEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des 走通采购订单的流程
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest {

    @Autowired
    ProclassService proclassService;  //物料分类
    @Autowired
    ProductProService productProService;  //物料档案
    @Autowired
    VendorInfoService vendorInfoService;  //供应商档案
    @Autowired
    VendorClassService vendorClassService;  //供应商分类
    @Autowired
    PurchaseOrderService purchaseOrderService;  //采购订单
    /**
     * 保存供应商   ----只同步一次就可以了
     */
    @Test
    public void init() throws Exception {
        //供应商分类保存----------------------------------------------------
        VendorClassEntity vendorClassEntity = new VendorClassEntity("自营","03");
        VendorClassEntity vendorClassResp = vendorClassService.save(vendorClassEntity);
        //供应商保存----------------------------------------------------
        VendorInfoBodyEntity body = new VendorInfoBodyEntity("03","河姆渡自营",vendorClassResp.getId());
        vendorInfoService.save(body);
        //保存物料分类----------------------------------------------------
        proclassService.save(new ProClassSaveEntity("一级","01"));
        proclassService.save(new ProClassSaveEntity("二级","02"));
        proclassService.save(new ProClassSaveEntity("三级","03"));
    }

    /**
     * 保存物料档案
     * @throws Exception
     */
    @Test
    public void savePro() throws Exception {

        //保存物料档案----------------------------------------------------
        ProductBodyEntity body = new ProductBodyEntity();
        //物料分类id ---可以理解为商品
        body.setManageClass(1641547087630592L);
        //物料编码
        body.setCode("1011");
        //物料名称
        body.setName("面包");
        //计量单位id   -----将计量档案同步到自己的服务器，填写数据的时候对应起来
        body.setUnit(1641554627268864L);
        //单价
        body.setDetailfMarketPrice(21.1F);
        ProductBodyEntity result = productProService.save(body);
        System.out.println(result);

    }

    /**
     * 保存采购订单
     */
    @Test
    public void savePurchaseOrder() throws Exception {
        PurchaseOrderSavePEntity order = new PurchaseOrderSavePEntity();
        //组织id
        order.setOrg("1640198360125696");
        //供应商id
        order.setInvoiceVendor(1641526656504064L);
        //操作人id
        order.setOperatorId(1641541568450816L);
        List<PurchaseOrderSaveCEntity> list = new ArrayList<PurchaseOrderSaveCEntity>();
        PurchaseOrderSaveCEntity orderCh = new PurchaseOrderSaveCEntity();
        //物料id
        orderCh.setProduct(1641556234555648L);
        //计量单位id
        orderCh.setUnit(1641549812257024L);
        //无税单价
        orderCh.setOriUnitPrice(100);
        //数量
        orderCh.setQty(2000);
        list.add(orderCh);
        order.setPurchaseOrders(list);
        PurchaseOrderHeadEntity result = purchaseOrderService.save(order);
        System.out.println(result);
    }

}
