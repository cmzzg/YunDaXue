package com.yundaxue.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.yundaxue.dao.impl.SearchRemarkReplyDaoImpl;
import com.yundaxue.service.ISearchRemarkReplyService;
import com.yundaxue.util.Paging;
import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author zbx
 *
 */
public class SearchRemarkReplyServiceImpl implements ISearchRemarkReplyService {

	public List<SelectAllRemarksWithinMessage> searchRemark(int index, int sizePage, int messageId) {
		Paging p = new Paging();
		int index1 = p.fenPageByRequirement(index, sizePage, messageId, "remark_info", "message_id");
		SearchRemarkReplyDaoImpl srrdi = new SearchRemarkReplyDaoImpl();
		List<SelectAllRemarksWithinMessage> lsarwm = srrdi.searchRemarkDao(index1, sizePage, messageId);
		return lsarwm;
	}

	public List<SelectAllReplysWithinRemark> searchReply(int index,int sizePage, int remarkId) {
		Paging p = new Paging();
		int index1 = p.fenPageByRequirement(index, sizePage, remarkId, "reply_info", "reply_father_id");
		SearchRemarkReplyDaoImpl srrldi = new SearchRemarkReplyDaoImpl();
		List<SelectAllReplysWithinRemark> lsrwr = srrldi.searchReply(index1, sizePage, remarkId);
		return lsrwr;
	}
}
