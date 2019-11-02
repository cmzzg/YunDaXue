package com.yundaxue.util;

import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.RemarkInfo;
import com.yundaxue.pojo.ShopInfo;
import com.yundaxue.pojo.UserInfo;
/**
 * 
 * @author ZZG
 *
 */
public class omnipotent {
	private ActivityInfo ai ;
	private LostAndFound laf;
	private Message mag;
	private	RemarkInfo rm;
	private ShopInfo si;
	private UserInfo ui;
	public UserInfo getUi() {
		return ui;
	}
	public void setUi(UserInfo ui) {
		this.ui = ui;
	}
	public ActivityInfo getAi() {
		return ai;
	}
	public void setAi(ActivityInfo ai) {
		this.ai = ai;
	}
	public LostAndFound getLaf() {
		return laf;
	}
	public void setLaf(LostAndFound laf) {
		this.laf = laf;
	}
	public Message getMag() {
		return mag;
	}
	public void setMag(Message mag) {
		this.mag = mag;
	}
	public RemarkInfo getRm() {
		return rm;
	}
	public void setRm(RemarkInfo rm) {
		this.rm = rm;
	}
	public ShopInfo getSi() {
		return si;
	}
	public void setSi(ShopInfo si) {
		this.si = si;
	}
}
