package test.one;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {  
    	String response="<?xml version=\"1.0\" encoding=\"UTF-8\"?>                      "+
				"不能自核——;非营业客车为过户车，或者无赔优不浮动原因为（1、过户车，不浮动；2、上年做过过户批改，不浮动；3、无上年度保单，不浮动）新车除外，一级核保员不能核保 单车核保通则库_总部：非营业外地车控制，转人工;     浙江细则库：非营业客车，车龄(月)>9,NCD>1或项目代码不是 A3300ZZ001等代码或业务来源为非直销，转人工;     </UWMessage>"+
				"		</BI>               "+
				"		<UWFlag>1</UWFlag>  "+
				"	</Body>                 "+
				"</Packet>                  ";
    	response=response.replace("&","&amp;");
    	System.out.println(response);
    }  

}
