package com.yundaxue.service;

/**
 * 
 * @author zbx
 *
 */
public interface IPublishRemarkService {
	/**
	 * 发布评论
	 * @param remake_id 评论id
	 * @param remake_image 评论的图片
	 * @param user_id 对应的评论用户id
	 * @param remark_creatime 评论创建时间
	 * @param remake_content 评论正文
	 * @param message_id 留言id
	 * @return 评论的结果
	 */
	 String publishRemark(String remake_image,int user_id,String remark_creatime,String remake_content,int message_id);

	 /**
	  * 回复评论
	  * @param reply_id 回复id
	  * @param remark_target_id  评论目标id
	  * @param remark_target_type 回复的目标类型,1代表评论,2代表留言
	  * @param reply_user_id	回复的人的id
	  * @param reply_creatime	回复创建时间
	  * @param reply_content 	回复内容
	  * @param reply_target_user_id 回复目标用户id
	  * @param reply_father_id 回复父级id
	  * @return 回复的结果
	  */
	 String PublishReplyService(int remark_target_id,int remark_target_type , int reply_user_id,String reply_creatime,String reply_content,int reply_target_user_id,int reply_father_id);
}
