/**
 *
 *文件名：CBus.java 
 *copyright (c) 2015-2020 by jackwu
 *all rights reserved
 *内容摘要：客车类
 *
 *版本号：1.1
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
 *
 */
public class CBus extends CCbasecar{
    //private int price;
	private int seatnum;
	
	
	//构造函数
	public CBus(int __seatnum){
		if(__seatnum > 16)
			price=1500;
		if(__seatnum <= 16)
			price=800;
	}
	//属性的操作
	public int getPrice(){
		return price;//只读属性
	}
	
	/*
	 * @methodname:getSeatnum
	 * @paras:void
	 * @return:int
	 * 获取座位数量
	 * 
	 * */
	public int getSeatnum(){
		return seatnum;
	}
	/*
	 * @methodname:setSeatnum
	 * @paras:int
	 * @return:void
	 * 设置座位数量
	 * 
	 * */
	public void setSeatnum(int __seatnum){
		
		seatnum=__seatnum;
				
	}
	/*
	 * @methodname:calRent
	 * @paras:int
	 * @return:int
	 * 计算金额
	 * 
	 * */
	public   int  calRent(int __days) {
		 
		if(price > 16){
			return (1500*__days);
		}
		else if(price <= 16){
			return (800 * __days);
		}
		return 0;
		
	 }
	

}
