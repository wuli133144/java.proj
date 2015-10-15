/**
 *
 *文件名：CCarClient.java 
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

import java.util.Scanner;

import javax.swing.plaf.SliderUI;

/**
 * @author jackwu
 *
 */
public class CCarClient {

	public static void main(String args[]){
		Scanner inputstr=new Scanner(System.in);
		//设置运行
		
		CSalerMan saleman=null;
		boolean tag=true;
	    while(tag){
		System.out.print("请输入您的测试选择：\n");
		
		System.out.print("0.轿车\n");
		System.out.print("1.客车\n");
		System.out.print("选择项：\n");
		
		
		int toggle=inputstr.nextInt();
		
		
		if(toggle == 0){
			boolean btag=true;
			while(btag){
			System.out.print("您选择了轿车\n");
			System.out.print("选择轿车类型\n");
			
			System.out.print("0.car0\n");
			System.out.print("1.car1\n");
			
			int choice=inputstr.nextInt();
			if(choice == 0 ){
				CCar car=new CCar(tranport_type.CAR1);
				System.out.print("天数：\n");
				
				//int days=inputstr.nextInt();
				
				int days=inputstr.nextInt();
				saleman=new CSalerMan(car,days);//创建saleman
				
				System.out.print("计算结果\n");
				
				
				saleman.getFeel();
				 
				btag=false;
				
			}
			else if(choice == 1 ){
				CCar car=new CCar(tranport_type.CAR2);
				System.out.print("天数：\n");
				int days=inputstr.nextInt();
				
				saleman=new CSalerMan(car,days);
				
				System.out.print("计算结果\n");
				
		        saleman.getFeel();
				 
				btag=false;
			}
			else{
				
				btag=true;
			}
	   }
			tag=false;
			System.out.print("\n是否继续测试？(y/n)\n");
		    if(inputstr.next().endsWith("y") || inputstr.next().endsWith("Y") ){
		    	tag=true;
		    }
		}
		else if(toggle == 1){
			CBus bus=null;
			System.out.print("您先择了客车\n");
			System.out.print("输入座位数量 以便测试\n");
			//System.out.print("计算结果\n");
			int seatnum=inputstr.nextInt();
			if(seatnum > 16){
			    bus=new CBus(seatnum);
			    
			    System.out.print("天数：\n");
				int days=inputstr.nextInt();
				saleman=new CSalerMan(bus,days);
				System.out.print("计算结果\n");
				 saleman.getFeel();
			}
			else if(seatnum <= 16 && seatnum >= 0) {
				
                 bus=new CBus(seatnum);
				
				System.out.print("天数：\n");
				int days=inputstr.nextInt();
				saleman=new CSalerMan(bus,days);
				System.out.print("计算结果\n");
				 saleman.getFeel();
			}
			
			tag=false;
			
			System.out.print("\n是否继续测试？(y/n)\n");
		    if(inputstr.next().endsWith("y") || inputstr.next().endsWith("Y") ){
		    	tag=true;
		    }
		}
		else {
			System.out.print("输入错误\n");
			tag=true;
		}
	    }
		
	}
}
