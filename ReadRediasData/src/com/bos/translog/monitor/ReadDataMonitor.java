package com.bos.translog.monitor;


public class ReadDataMonitor {
	
		public static void main(String[] args) {
			GetDateFromRedis gd=GetDateFromRedis.getInstance("10.240.2.81", "6379");
			for(int i=0;i<1000;i++){
				System.out.println(gd.GetMapAllData("T24", "20170330", 3));
			}
			/*for(int i=0;i<50;i++){
				GetDateFromRedis gd=new GetDateFromRedis();
				System.out.println(gd.GetMapData("T24", "20170330", "All", "10.240.2.81", "6379"));
				System.out.println(gd.GetMapAllData("T24", "20170330", 3, "10.240.2.81", "6379"));
				GetDateFromRedis gd1=new GetDateFromRedis();
				System.out.println(gd1.GetMapData("T24", "20170330", "All", "10.240.2.81", "6379"));
				System.out.println(gd1.GetMapAllData("T24", "20170330", 3, "10.240.2.81", "6379"));
				GetDateFromRedis gd2=new GetDateFromRedis();
				System.out.println(gd2.GetMapData("T24", "20170330", "All", "10.240.2.81", "6379"));
				System.out.println(gd2.GetMapAllData("T24", "20170330", 3, "10.240.2.81", "6379"));
				
				GetDateFromRedis gd3=new GetDateFromRedis();
				System.out.println(gd3.GetMapData("T24", "20170330", "All", "10.240.2.81", "6379"));
				System.out.println(gd3.GetMapAllData("T24", "20170330", 3, "10.240.2.81", "6379"));
				System.out.println(gd3.GetMapAllData("T24", "2017033014", 3, "10.240.2.81", "6379"));
			}*/
		}
}
