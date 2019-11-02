package com.yundaxue.service.impl;

import java.util.List;

import com.yundaxue.dao.impl.SearchMessageDaoImpl;
import com.yundaxue.dao.impl.SearchRemarkReplyDaoImpl;
import com.yundaxue.service.ISearchMessageService;
import com.yundaxue.util.Paging;
import com.yundaxue.util.omnipotent;
import com.yundaxue.util.selectpojo.SelectAllMessages;
import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author ZZG
 *
 */
public class SearchMessageServiceImpl implements ISearchMessageService {
	
	Paging p =new Paging(); 
	SearchMessageDaoImpl smdi = new SearchMessageDaoImpl();
	
	public List<SelectAllRemarksWithinMessage> searchRemark(int index, int sizePage, int messageId) {
		SearchRemarkReplyDaoImpl srrdi = new SearchRemarkReplyDaoImpl();
		String tableName = "remark_info";
		int index1 = p.fenPage(index, sizePage,tableName);
		List<SelectAllRemarksWithinMessage>  sarwm = srrdi.searchRemarkDao(index1, sizePage, messageId);
		return sarwm;
	}

	public List<SelectAllReplysWithinRemark> searchReply(int index, int sizePage, int remarkId) {
		SearchRemarkReplyDaoImpl srrdi = new SearchRemarkReplyDaoImpl();
		String tableName = "reply_info";
		int index1 = p.fenPage(index, sizePage,tableName);
		List<SelectAllReplysWithinRemark> sarwm = srrdi.searchReplyDao(index1, sizePage, remarkId);
		return sarwm;
	}

	public List<SelectAllMessages> searchMessage(int index, int sizePage) {
		String tableName = "message_info";
		int index1 = p.fenPage(index, sizePage,tableName);
		List<SelectAllMessages> sam = smdi.searchMessage(index1, sizePage);
		return sam;
	}

	public List<omnipotent> searchLostFound(int index, int sizePage) {
		String tableName = "lost_found_info";
		int index1 = p.fenPage(index, sizePage,tableName);
		return null;
	}
}
