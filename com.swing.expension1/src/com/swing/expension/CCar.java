/**
 *
 *�ļ�����CCar.java 
 *copyright (c) 2015-2020 by jackwu
 *all rights reserved
 *����ժҪ��
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
 *���ͣ���������car���������Բ�Ӧ����ӽ���
 */
public class CCar extends CCbasecar {
    
	/**
	 * @method:ccar
	 * @param:null
	 * @return :null
	 * ���ܣ����캯��
	 */
	public CCar(tranport_type __type){
	  type=__type;
	  //days=__days;
     }
	
	private tranport_type type;//�γ�������
	
	//���Բ���
	public tranport_type getType(){
		return type;
	}
	public void setType(tranport_type __type){
		type=__type;
	}
	
	
	//public int days;
	//public int price;//�۸�
	
	//�۸����
	public int getPrice(){
		return price;//ֻ������
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
