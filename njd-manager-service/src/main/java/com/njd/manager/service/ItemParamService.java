package com.njd.manager.service;

import com.njd.common.pojo.TaotaoResult;
import com.njd.pojo.TbItemParam;

public interface ItemParamService {
	public TaotaoResult getItemParamByCid(Long cid);
	public TaotaoResult insertItemParam(TbItemParam itemParam);
	
}
