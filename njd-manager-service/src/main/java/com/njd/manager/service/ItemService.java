package com.njd.manager.service;

import java.util.Date;

import com.njd.common.pojo.EUDataGridResult;
import com.njd.common.pojo.TaotaoResult;
import com.njd.pojo.TbItem;



public interface ItemService {
	public TbItem getItemById(long itemId) ;
	public EUDataGridResult getItemList(int page ,int rows);
	public TaotaoResult addItem(TbItem item,String desc,String itemParams) throws Exception ;
	public TaotaoResult addItemDesc(Long itemId,String desc,Date date);
	public TaotaoResult insertItemParamItem(Long itemId,String ItemParam);
}
