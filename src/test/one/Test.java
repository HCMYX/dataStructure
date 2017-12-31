package test.one;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {  
    	String response="<?xml version=\"1.0\" encoding=\"UTF-8\"?>                      "+
//				"<Packet>                                                                "+
//				"	<Head>                                                               "+
//				"		<RequestType>V01</RequestType>                                   "+
//				"		<SerialNo>5af6ba2edb5f41e2915955e155d61c27</SerialNo>            "+
//				"		<ResponseCode>-1</ResponseCode>                                  "+
//				"		<ErrorCode>2005</ErrorCode>                                      "+
//				"		<ErrorMessage>核心系统返回异常</ErrorMessage>                    "+
//				"	</Head>                                                              "+
//				"	<Body>                                                               "+
//				"		<ConfirmNo>599330203302017000042599330203362017000048</ConfirmNo>"+
//				"		<TotalPrem>3524.23</TotalPrem>                                   "+
//				"		<TotalSumlimit>758402.07</TotalSumlimit>                         "+
//				"		<CI>                                                             "+
//				"			<CConfirmNo>599330203302017000042</CConfirmNo>               "+
//				"			<Prem>950.0</Prem>                                           "+
//				"			<Tax>300.0</Tax>                                             "+
//				"			<UWFlag>2</UWFlag>                                           "+
//				"			<UWMessage>599330203302017000042核保状态(2) 自核</UWMessage> "+
//				"		</CI>                                                            "+
//				"		<BI>                                                             "+
//				"			<BConfirmNo>599330203362017000048</BConfirmNo>               "+
//				"			<BPremium>2574.23</BPremium>                                 "+
//				"			<BSumlimit>636402.07</BSumlimit>                             "+
//				"			<UWFlag>1</UWFlag>                                           "+
//				"			<UWMessage>--操作异常--：E81--天瑞自动核保接口交互异常       "+
//				"核保状态(1) 自核失败                                                    "+
				"不能自核——;非营业客车为过户车，或者无赔优不浮动原因为（1、过户车，不浮动；2、上年做过过户批改，不浮动；3、无上年度保单，不浮动）新车除外，一级核保员不能核保 单车核保通则库_总部：非营业外地车控制，转人工;     浙江细则库：非营业客车，车龄(月)>9,NCD>1或项目代码不是 A3300ZZ001等代码或业务来源为非直销，转人工;     </UWMessage>"+
				"		</BI>               "+
				"		<UWFlag>1</UWFlag>  "+
				"	</Body>                 "+
				"</Packet>                  ";
    	response=response.replace("&","&amp;");
    	System.out.println(response);
    }  

}
