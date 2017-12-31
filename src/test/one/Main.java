package test.one;

public class Main {
	
	public static void main(String[] args) {
		People people=new People("张三","22");
		Model m=new Model("1", "张三", people);
		//Model [id=1, name=张三, people=People [name=张三, age=22]]
		System.out.println(m.toString());
		People p2=m.people;
		p2.name="李四";
		//Model [id=1, name=张三, people=People [name=李四, age=22]]
		System.out.println(m.toString());
		People p3=new People();
		p3.name=m.people.name;
		p3.age=m.people.age;
		p3.name="王五";
		//Model [id=1, name=张三, people=People [name=李四, age=22]]
		System.out.println(m.toString());

		System.out.println("----------------------------------");
		int intA=0;
		int intB=intA;
		intB+=1;
		Integer integerA=new Integer(0);
		Integer integerB=integerA;
		integerB+=1;
		System.out.println("intA:"+intA+"  intB:"+intB);
		System.out.println("integerA:"+integerA+"  integerB:"+integerB);

		System.out.println("----------------------------------");
		String strA="123";
		String strB=strA;
		strB="321";
		//123
		System.out.println(strA);
		System.out.println(strB);
		People people1=new People();
		String name="张三";
		people1.name=name;
		//字符串Name:张三
		//People [name=张三, age=null]
		System.out.println("字符串Name:"+name);
		System.out.println(people1.toString());
		name="李四";
		//字符串Name:李四
		//People [name=张三, age=null]
		System.out.println("字符串Name:"+name);
		System.out.println(people1.toString());
		people1.name="王五";
		//字符串Name:李四
		//People [name=王五, age=null]
		System.out.println("字符串Name:"+name);
		System.out.println(people1.toString());
		System.out.println("-------------------------------");
		People people2=new People();
		String name2=new String("张三");
		people2.name=name2;
		System.out.println("字符串Name:"+name2);
		System.out.println(people2.toString());
		name2=new String("李四");
		System.out.println("字符串Name:"+name2);
		System.out.println(people2.toString());
		people2.name="王五";
		System.out.println("字符串Name:"+name2);
		System.out.println(people2.toString());
	}
}
