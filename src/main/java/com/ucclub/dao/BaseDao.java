package com.ucclub.dao;

import java.util.List;

public interface BaseDao<T,P,M> {

	/**根据参数来获取对象集合
	 * @param p
	 * @return
	 */
	public List<T> getListObject(M m);
	
	/** 更新对象
	 * @param p
	 * @return
	 */
	public boolean updateObject(T t);
	
	/**保存对象
	 * @param p
	 * @return
	 */
	public boolean saveObject(T t);
	
	/**根据参数来删除
	 * @param m
	 * @return
	 */
	public boolean deleteObject(P p);
	
	
	
	/**按主键获取对象
	 * @param id  PK 
	 * @return
	 */
	public T getObect(P p);
	
}
