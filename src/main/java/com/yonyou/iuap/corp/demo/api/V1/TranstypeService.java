package com.yonyou.iuap.corp.demo.api.V1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.iuap.corp.demo.entity.transtype.TranstypeBodyEntity;
import com.yonyou.iuap.corp.demo.entity.transtype.TranstypeHeadEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  交易类型
 */
@Component
public class TranstypeService extends BaseApi{

    @Value("${api.transtype.list}")
    private String list_uri;
    @Value("${api.transtype.detail}")
    private String detail_uri;
    @Value("${api.transtype.save}")
    private String save_uri;

    /**
     * 获取交易类型列表
     * @param params
     * @return
     */
    public List<TranstypeHeadEntity> list(Map<String, Object> params) throws Exception {
        List<TranstypeHeadEntity> result = doPost(list_uri,params,new TypeReference<List<TranstypeHeadEntity>>(){});
        return result;
    }

    /**
     * 获取交易类型详情
     * @param params
     * @return
     */
    public TranstypeBodyEntity detail(Map<String, Object> params) throws Exception {
        TranstypeBodyEntity result = doGet(detail_uri,params,TranstypeBodyEntity.class);
        return result;
    }
}
