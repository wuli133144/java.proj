/**
 *
 *�ļ�����CCarClient.java 
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

import java.util.Scanner;

import javax.swing.plaf.SliderUI;

/**
 * @author jackwu
 *
 */
public class CCarClient {

	public static void main(String args[]){
		Scanner inputstr=new Scanner(System.in);
		//��������
		
		CSalerMan saleman=null;
		boolean tag=true;
	    while(tag){
		System.out.print("���������Ĳ���ѡ��\n");
		
		System.out.print("0.�γ�\n");
		System.out.print("1.�ͳ�\n");
		System.out.print("ѡ���\n");
		
		
		int toggle=inputstr.nextInt();
		
		
		if(toggle == 0){
			boolean btag=true;
			while(btag){
			System.out.print("��ѡ���˽γ�\n");
			System.out.print("ѡ��γ�����\n");
			
			System.out.print("0.car0\n");
			System.out.print("1.car1\n");
			
			int choice=inputstr.nextInt();
			if(choice == 0 ){
				CCar car=new CCar(tranport_type.CAR1);
				System.out.print("������\n");
				
				//int days=inputstr.nextInt();
				
				int days=inputstr.nextInt();
				saleman=new CSalerMan(car,days);//����saleman
				
				System.out.print("������\n");
				
				
				saleman.getFeel();
				 
				btag=false;
				
			}
			else if(choice == 1 ){
				CCar car=new CCar(tranport_type.CAR2);
				System.out.print("������\n");
				int days=inputstr.nextInt();
				
				saleman=new CSalerMan(car,days);
				
				System.out.print("������\n");
				
		        saleman.getFeel();
				 
				btag=false;
			}
			else{
				
				btag=true;
			}
	   }
			tag=false;
			System.out.print("\n�Ƿ�������ԣ�(y/n)\n");
		    if(inputstr.next().endsWith("y") || inputstr.next().endsWith("Y") ){
		    	tag=true;
		    }
		}
		else if(toggle == 1){
			CBus bus=null;
			System.out.print("�������˿ͳ�\n");
			System.out.print("������λ���� �Ա����\n");
			//System.out.print("������\n");
			int seatnum=inputstr.nextInt();
			if(seatnum > 16){
			    bus=new CBus(seatnum);
			    
			    System.out.print("������\n");
				int days=inputstr.nextInt();
				saleman=new CSalerMan(bus,days);
				System.out.print("������\n");
				 saleman.getFeel();
			}
			else if(seatnum <= 16 && seatnum >= 0) {
				
                 bus=new CBus(seatnum);
				
				System.out.print("������\n");
				int days=inputstr.nextInt();
				saleman=new CSalerMan(bus,days);
				System.out.print("������\n");
				 saleman.getFeel();
			}
			
			tag=false;
			
			System.out.print("\n�Ƿ�������ԣ�(y/n)\n");
		    if(inputstr.next().endsWith("y") || inputstr.next().endsWith("Y") ){
		    	tag=true;
		    }
		}
		else {
			System.out.print("�������\n");
			tag=true;
		}
	    }
		
	}
}
