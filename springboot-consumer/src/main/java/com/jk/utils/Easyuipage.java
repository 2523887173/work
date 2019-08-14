/** 
 * <pre>项目名称:y-yanwei-1 
 * 文件名称:Easyuipage.java 
 * 包名:com.jk.yanwei.utils 
 * 创建日期:2019年2月14日下午7:12:58 
 * Copyright (c) 2019, All Rights Reserved.</pre> 
 */  
package com.jk.utils;

import java.io.Serializable;

/**
 * <pre>项目名称：y-yanwei-1    
 * 类名称：Easyuipage    
 * 类描述：    
 * 创建人：闫伟   
 * 创建时间：2019年2月14日 下午7:12:58    
 * 修改人：闫伟      
 * 修改时间：2019年2月14日 下午7:12:58    
 * 修改备注：       
 * @version </pre>    
 */
public class Easyuipage implements Serializable {
	
	private Integer total;  //总条数
	
	private Object rows;  //当前页数

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "Easyuipage [total=" + total + ", rows=" + rows + "]";
	}
	
	
	

}
