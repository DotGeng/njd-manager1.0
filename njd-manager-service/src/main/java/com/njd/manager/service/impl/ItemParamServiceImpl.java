package com.njd.manager.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njd.common.pojo.TaotaoResult;
import com.njd.manager.service.ItemParamService;
import com.njd.mapper.TbItemParamItemMapper;
import com.njd.mapper.TbItemParamMapper;
import com.njd.pojo.TbItemParam;
import com.njd.pojo.TbItemParamExample;
import com.njd.pojo.TbItemParamExample.Criteria;



@Service
public class ItemParamServiceImpl implements ItemParamService {
	@Autowired
	private TbItemParamMapper itemParamMapper;
	@Autowired
	private TbItemParamItemMapper tbItemParamItemMapper;
	@Override
	public TaotaoResult getItemParamByCid(Long cid) {
		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		//大文本类型自动忽略
		//List<TbItemParam> list = itemParamMapper.selectByExample(example);
		//
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		if(list != null && list.size() > 0) {
			return TaotaoResult.ok(list.get(0));
		}
		return TaotaoResult.ok();
	}
	@Override
	public TaotaoResult insertItemParam(TbItemParam itemParam) {
		//补全pojo
		itemParam.setCreated(new Date());
		itemParam.setUpdated(new Date());
		itemParamMapper.insert(itemParam);
		return TaotaoResult.ok();
	}
	

}
