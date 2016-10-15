package com.njd.manager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njd.common.pojo.EUTreeNode;
import com.njd.manager.service.ItemCatService;
import com.njd.mapper.TbItemCatMapper;
import com.njd.pojo.TbItemCat;
import com.njd.pojo.TbItemCatExample;
import com.njd.pojo.TbItemCatExample.Criteria;


@Service
public class ItemCatServiceImpl implements ItemCatService{

	@Autowired
	private TbItemCatMapper tbItemCatMapper;
	@Override
	public List<EUTreeNode> getItemCatList(long parentId) {
		//根据parentId查询分类列表
		//1 创建查询条件
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//2 进行查询
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
		List<EUTreeNode> resultList = new ArrayList<>();
		for (TbItemCat tbItemCat : list) {
			EUTreeNode node = new EUTreeNode();
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent()?"closed" : "open");
			resultList.add(node);
		}
		return resultList;
	}
	
}
