/**
 *
 *文件名：CCar.java 
 *copyright (c) 2015-2020 by jackwu
 *all rights reserved
 *内容摘要：
 *
 *版本号：1.0
 *作者：jackwu
 *完成时间：2015-10-13
 *
 *版本号：1.0
 *原作者：jackwu
 *修改者：jackwu
 *完成时间：2015-10-13
 *
 **/

package com.swing.expension;

/**
 * @author jackwu
 *解释：天数不是car的属性所以不应该添加进来
 */
public class CCar extends CCbasecar {
    
	/**
	 * @method:ccar
	 * @param:null
	 * @return :null
	 * 功能：构造函数
	 */
	public CCar(tranport_type __type){
	  type=__type;
	  //days=__days;
     }
	
	private tranport_type type;//轿车的类型
	
	//属性操作
	public tranport_type getType(){
		return type;
	}
	public void setType(tranport_type __type){
		type=__type;
	}
	
	
	//public int days;
	//public int price;//价格
	
	//价格操作
	public int getPrice(){
		return price;//只读属性
	}
	
	public   int  calRent(int __days) {
		 
		if(type == tranport_type.CAR1){
			return (600*__days);
		}
		else if(type == tranport_type.CAR2){
			return (500 * __days);
		}
		return 0;
		
	 }
	
}
