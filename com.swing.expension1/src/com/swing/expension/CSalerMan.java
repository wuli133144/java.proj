/**
 *
 *�ļ�����CSalerMan.java 
 *copyright (c) 2015-2020 by jackwu
 *all rights reserved
 *����ժҪ��������1.0�汾�� calRent��λtransportation�ĳ�Ա�����˾���calrent()��Ӧ��
 *��Ϊ��Ա���� ����������շ�Ա�࣬�������޷���
 *
 *�汾�ţ�1.0
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
public class CSalerMan {
	
	private CCbasecar transportion;
	private int day;
	
	public CSalerMan(CCbasecar __tran,int _day){
		transportion=__tran;
		day=_day;
	}
	public void getFeel(){
		
		
		System.out.print("��ȡ����:\n");
		
		System.out.print(transportion.calRent(day));
		
	}

}
