package com.yundaxue.service.impl;


import com.yundaxue.dao.impl.PublishRemarkDaoImpl;
import com.yundaxue.pojo.RemarkInfo;
import com.yundaxue.pojo.ReplyInfo;
import com.yundaxue.service.IPublishRemarkService;
/**
 * 
 * @author zbx
 *
 */
public class PublishRemarkServiceImpl implements IPublishRemarkService {
	
	public String publishRemark(String remark_image,
			int user_id, String remark_creatime, String remark_content,
			int message_id) {
		RemarkInfo remark = new RemarkInfo();
		remark.setRemark_image(remark_image);
		remark.setUser_id(user_id);
		remark.setRemark_creatime(remark_creatime);
		remark.setRemark_content(remark_content);
		remark.setMessage_id(message_id);
		PublishRemarkDaoImpl prdi = new PublishRemarkDaoImpl();
		int count = prdi.PublishRemarkDao(remark);
		if(count > 0){
			return "评论成功！";
		}else {
			return "评论失败！";
		}
	}
	
	public String PublishReplyService(int remark_target_id,
			int remark_target_type, int reply_user_id, String reply_creatime,
			String reply_content, int reply_target_user_id, int reply_father_id){
		ReplyInfo reply = new ReplyInfo();
		reply.setRemark_target_id(remark_target_id);
		reply.setRemark_target_type(remark_target_type);
		reply.setReply_user_id(reply_user_id);
		reply.setReply_creatime(reply_creatime);
		reply.setReply_content(reply_content);
		reply.setReply_target_user_id(reply_target_user_id);
		reply.setReply_father_id(reply_father_id);
		PublishRemarkDaoImpl pdsi = new PublishRemarkDaoImpl();
		int count = pdsi.PublishReply(reply);
		if(count > 0){
			return "回复成功!";
		}else{
			return "回复失败!!!";
		}
	}

}
