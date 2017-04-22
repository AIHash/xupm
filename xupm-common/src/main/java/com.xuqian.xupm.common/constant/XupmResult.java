package com.xuqian.xupm.common.constant;

import com.xuqian.admin.common.base.BaseResult;

/**
 * Created by xuq on 2017/4/22.
 */
public class XupmResult extends BaseResult {

    public XupmResult(XupmResultConstant upmsResultConstant, Object data) {
        super(upmsResultConstant.getCode(),upmsResultConstant.getMessage(),data);
    }
}
