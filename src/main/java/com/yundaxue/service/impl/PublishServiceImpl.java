package com.yundaxue.service.impl;

import com.yundaxue.dao.impl.PublishDaoImpl;
import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.ShopInfo;
import com.yundaxue.service.IPublishService;
/**
 * @author ZZ
 */
public class PublishServiceImpl implements IPublishService {
	private PublishDaoImpl pdi = new  PublishDaoImpl();
	public String publishMessageService(Message mag) {
		int count = pdi.publishMessageDao(mag);
		String r = publishResult(count);
		return r;
	}

	public String LostFoundService(LostAndFound laf) {
		int count = pdi.publishLostFoundDao(laf);
		String r = publishResult(count);
		return r;
	}

	public String publishTransactionService(ShopInfo si) {
		int count = pdi.publishTransactionDao(si);
		String r = publishResult(count);
		return r;
	}

	public String publishActivityService(ActivityInfo ai) {
		int count = pdi.publishActivityDao(ai);
		String r = publishResult(count);
		return r;
	}
	
	private String publishResult(int publish) {
		if(publish > 0)
			return "发布成功";
		else
			return "发布失败";
	}
}
