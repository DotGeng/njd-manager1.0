package com.njd.manager.service;

import java.util.List;

import com.njd.common.pojo.EUTreeNode;
import com.njd.common.pojo.TaotaoResult;


public interface ContentCategoryService {
	public List<EUTreeNode> getCategoryList(long parentId);
	public TaotaoResult insertContentCategory(long parentId,String name);
	//删除内容分类
	public TaotaoResult deleteContentCategory(long parentId,long id);
	//重命名节点
	public TaotaoResult renameNode(long id,String name);
}
