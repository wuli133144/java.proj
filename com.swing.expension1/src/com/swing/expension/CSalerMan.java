/**
 *
 *文件名：CSalerMan.java 
 *copyright (c) 2015-2020 by jackwu
 *all rights reserved
 *内容摘要：由于在1.0版本中 calRent座位transportation的成员，个人觉得calrent()不应该
 *作为成员出现 所以添加了收费员类，计算租赁费用
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
 *
 */
public class CSalerMan {
	
	private CCbasecar transportion;
	private int day;
	
	public CSalerMan(CCbasecar __tran,int _day){
		transportion=__tran;
		day=_day;
	}
	public void getFeel(){
		
		
		System.out.print("收取费用:\n");
		
		System.out.print(transportion.calRent(day));
		
	}

}
