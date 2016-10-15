package com.njd.manager.service;

import java.util.List;

import com.njd.common.pojo.EUTreeNode;


public interface ItemCatService {
	public List<EUTreeNode> getItemCatList(long parentId);
}
