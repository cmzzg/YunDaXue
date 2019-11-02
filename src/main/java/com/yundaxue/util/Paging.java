package com.yundaxue.util;

import com.yundaxue.dao.impl.SearchMessageDaoImpl;
/**
 * 
 * @author ZZG
 *
 */
public class Paging {
	/**
	 * ͨ�÷�ҳ
	 * @param index  ��ǰҳ��
	 * @param sizePage  ÿҳ��ʾ������
	 * @param sql sql���
	 * @return ��ǰҳ�� ��С��1���������ҳ��
	 */
	public int fenPage(int index,int sizePage,String tableName) {
		SearchMessageDaoImpl smdi = new SearchMessageDaoImpl();
		Page p = new Page();
		int count = smdi.getCount(tableName);
		p.setTotalCount(count);
		p.setPageSize(sizePage);
		if(index > p.getPageCount()){
			p.setIndex(p.getPageCount());
		}else if(index < 1){
			p.setIndex(1);
		}else{
			p.setIndex(index);
		}
		return p.getIndex();
	}
	/**
	 * ����������з�ҳ��ѯ
	 * @param index ��ǰҳ��
	 * @param sizePage ÿҳ����Ŀ��
	 * @param id ������ĳ�����
	 * @param tableName Ҫ��ѯ�ı���
	 * @param requirement Ҫ��ѯ����������������
	 * @return �ض������µ�����Ŀ��
	 */
	public int fenPageByRequirement(int index,int sizePage,int id, String tableName, String requirement) {
		SearchMessageDaoImpl smdi = new SearchMessageDaoImpl();
		Page p = new Page();
		int count = smdi.getCountByRequirement(id, tableName, requirement);
		p.setTotalCount(count);
		p.setPageSize(sizePage);
		return p.getIndex();
	}
}
