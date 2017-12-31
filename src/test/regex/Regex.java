package test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * java正则表达式
 * @author mwb
 *
 */
public class Regex {

	public static void main(String[] args) {
		String message="交强-该保单属于重复投保，其重复投保信息为：E51--交强投保查询与平台交互异常"+
				"车险平台返回信息"+
				"车牌号“渝ABT771”的保单发生重复投保，与其重复投保的本公司的保单信息如下：车架号 LBEHDAFB89Y187098;发动机号 9B609139。*";
		try {
			//str是否可以匹配到exception 未匹配到返回false
			String regex="^((?!Exception).)*$";
			//忽略大小写
			Pattern pat = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pat.matcher(message);
		    if (!matcher.matches()) {
				System.out.println("123");
			}else {
				System.out.println(message);
			}
		} catch (Exception e) {
			System.out.println("aaaaaaaaaa");
		}

	}
}
