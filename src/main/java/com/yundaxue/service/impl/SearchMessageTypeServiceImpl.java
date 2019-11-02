package com.yundaxue.service.impl;

import java.util.List;

import com.yundaxue.dao.impl.SearchMessageTypeDaoImpl;
import com.yundaxue.service.ISearchMessageTypeService;
import com.yundaxue.util.Paging;
import com.yundaxue.util.selectpojo.SelectAllMessages;
/**
 * 
 * @author ZZG
 *
 */
public class SearchMessageTypeServiceImpl implements ISearchMessageTypeService {
	public List<SelectAllMessages> searchMessageTypeService(int index, int sizePage, int typeid) {
		Paging paging = new Paging();
		int index1 = paging.fenPageByRequirement(index, sizePage, typeid, "message_info", "message_type_id");
		SearchMessageTypeDaoImpl smtdi = new SearchMessageTypeDaoImpl();
		List<SelectAllMessages> lsam =smtdi.searchMessageType(index1, sizePage, typeid);
		return lsam;
	}

}
