/**
 *
 *�ļ�����CBus.java 
 *copyright (c) 2015-2020 by jackwu
 *all rights reserved
 *����ժҪ���ͳ���
 *
 *�汾�ţ�1.1
 *���ߣ�jackwu
 *���ʱ�䣺2015-10-13
 *
 *�汾�ţ�1.0
 *ԭ���ߣ�jackwu
 *�޸��ߣ�jackwu
 *���ʱ�䣺2015-10-13
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
	
	
	//���캯��
	public CBus(int __seatnum){
		if(__seatnum > 16)
			price=1500;
		if(__seatnum <= 16)
			price=800;
	}
	//���ԵĲ���
	public int getPrice(){
		return price;//ֻ������
	}
	
	/*
	 * @methodname:getSeatnum
	 * @paras:void
	 * @return:int
	 * ��ȡ��λ����
	 * 
	 * */
	public int getSeatnum(){
		return seatnum;
	}
	/*
	 * @methodname:setSeatnum
	 * @paras:int
	 * @return:void
	 * ������λ����
	 * 
	 * */
	public void setSeatnum(int __seatnum){
		
		seatnum=__seatnum;
				
	}
	/*
	 * @methodname:calRent
	 * @paras:int
	 * @return:int
	 * ������
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
