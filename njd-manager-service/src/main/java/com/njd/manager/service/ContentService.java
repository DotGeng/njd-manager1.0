package com.njd.manager.service;

import java.util.List;

import com.njd.common.pojo.EUDataGridResult;
import com.njd.common.pojo.TaotaoResult;
import com.njd.pojo.TbContent;



public interface ContentService {
	//插入内容
	public TaotaoResult insertContent(TbContent tbContent) ;
	//得到内容列表
	public EUDataGridResult  getContentList(long catId, Integer page, Integer rows) throws Exception;
	//修改内容
	public  TaotaoResult modifyContent(TbContent content) throws Exception;
	//删除指定id代表的内容
	public TaotaoResult deleteContent(List<Long> ids) throws Exception;
	
}
