package work3;

import java.util.Scanner;
public class Student3 {
	Scanner in=new Scanner(System.in);
	public void print(Student2[] s,int i) {//输出学生的信息
		System.out.println("序号"+'\t'+"姓名"+'\t'+"年龄"+'\t'+"java"+'\t'+"C#"+'\t'+"html"+'\t'+"sql"+'\t'+"总分"+'\t'+"平均分");
		System.out.println(s[i]);
	}
	public void All(Student2[] s) {//输出所有学生
		System.out.println("序号"+'\t'+"姓名"+'\t'+"年龄"+'\t'+"java"+'\t'+"C#"+'\t'+"html"+'\t'+"sql"+'\t'+"总分"+'\t'+"平均分");
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
				System.out.println("未曾录入学生信息");
				continue;
			}
			else
			{System.out.println(s[i]);}
		}
	}
	public void creat(Student2[] s) {//添加学生信息
		for(int i=0,j=1;i<s.length;i++,j++) {//定义i为数组的下标值，先进行判断，判断后在决定是否赋值，j为学生的序号
			if(s[i]==null) {//判断类的数组元素是否为空，若为空则为其赋值
				System.out.println("请输入学生姓名:");
				Student2 s1=new Student2();
				s1.setName(in.next());
				System.out.println("请输入学生年龄：");
				s1.setAge(in.nextInt());
				s[i]=s1;
				s[i].setNum(j);
			}
			else {
				j-=1;		//若此数组元素不为空，则其序号直接从此处跳过，为下一空元素的序号变量赋值
				continue;//若数组元素不为空，则跳过此元素
			}
		}
		System.out.println("学生信息存储成功");
	}
	
	public int find(int num,Student2[] s) {//查找学生，此处定义其为int类型的函数，便于在之后的代码中调用。
		int i,j;
		for(i=0,j=0;i<s.length;i++,j++) {
			if(s[i]==null)		//判断数组中学生信息是否为空，若为空则直接跳过
				continue;
			else if(num==s[i].getNum()) {//判断输入查找的序号是否与不为空的学生序号相同
			print(s,i);			//调用输出函数
			i=s.length+1;		//若查找到学生的信息，则在此处使用为i重新赋值
			break;
		}
		}
		if(i<=s.length) {			//在此处使用if语句判断i，若有此学生信息，则i的值大于数组s的长度
			System.out.println("系统中无此学生信息！");
			j=s.length+1;}//若无要查找的学生信息，则为其赋值为数组的长度加一，便于在以后的调用中进行判断
		return j;			
	}
	public void change(int num,Student2[] s) {//修改学生信息
		int i;
		int yy;
		i=find(num,s);//将find函数中的j返回给i，为之下的代码提供判断的基础
		if(i<s.length) {//判断i是否小于数组的长度，若小于则数组中有此学生，可以进行修改，反之。
			System.out.println("--请选择要修改的信息--");
			System.out.println("1、姓名");
			System.out.println("2、年龄");
			System.out.println("3、Java成绩");
			System.out.println("4、c#成绩");
			System.out.println("5、HTML成绩");
			System.out.println("6、sql成绩");
			yy=in.nextInt();
			switch(yy) {
			case 1: 
			System.out.println("请输入要修改的姓名:");
			s[i].setName(in.next());
			break;
			case 2:
			System.out.println("请输入要修改的年龄:");
			s[i].setAge(in.nextInt());
			break;
			case 3:
			System.out.println("请输入要修改的Java成绩:");
			s[i].setJava(in.nextInt());
			break;
			case 4:
			System.out.println("请输入要修改的C#成绩:");
			s[i].setC_shapt(in.nextInt());
			break;
			case 5:
			System.out.println("请输入要修改的html成绩:");
			s[i].setHtml(in.nextInt());
			break;
			case 6:
			System.out.println("请输入要修改的sql:");
			s[i].setSql(in.nextInt());
			break;
			}
			int sum=s[i].getJava()+s[i].getC_shapt()+s[i].getHtml()+s[i].getSql();
			s[i].setSum(sum);//此处将成绩的总分赋值
			int avg=sum/4;
			s[i].setAvg(avg);//此处将成绩的平均分赋值
			
		}
	}
	public void delete(int num,Student2[] s) {//删除学生
		int i;
		i=find(num,s);//将find函数中的j返回给i，为之下的代码提供判断的基础
		if(i<s.length) {//判断i是否小于数组的长度，若小于则数组中有此学生，可以删除，若i大于数组长度，则无此学生信息，直接跳过
		System.out.println("确认删除此学生信息？‘Y/N’");
		if(in.next().equals("Y")) {
			s[i]=null;//在此处将所指定的数组元素赋值为空
			System.out.println("删除成功！");
		}				
		else
			System.out.println("删除取消");
		}
	}
	public void getscore(int num,Student2[] s) {//写入学生成绩
		int i;
		i=find(num,s);//将find函数中的j返回给i，为之下的代码提供判断的基础
		if(i<s.length) {//判断i是否小于数组的长度，若小于则数组中有此学生，可以进行成绩录入，若i大于数组长度，则无此学生信息，直接跳过
			System.out.println("请分别输入下列科目的成绩:");
			System.out.println("java   C#   html   sql");
			s[i].setJava(in.nextInt());
			s[i].setC_shapt(in.nextInt());
			s[i].setHtml(in.nextInt());
			s[i].setSql(in.nextInt());
			int sum=s[i].getJava()+s[i].getC_shapt()+s[i].getHtml()+s[i].getSql();
			s[i].setSum(sum);//此处将成绩的总分赋值
			int avg=sum/4;
			s[i].setAvg(avg);//此处将成绩的平均分赋值
			i=s.length+1;
			}
	}
	public void makeas(String lesson,Student2[] s) {//按指定科目进行排序
		if(lesson.equals("java")) {//进行java的成绩排序
			for(int i=0,j=i+1;i<s.length;i++) {
				if(s[i].getJava()<s[j].getJava()) {
					Student2 s1=new Student2();
					s1=s[i];
					s[i]=s[i+1];
					s[i+1]=s1;
				}
			}
		}
		if(lesson.equals("C#")) {//进行C#的成绩排序
			for(int i=0,j=i+1;i<s.length;i++) {
				if(s[i].getC_shapt()<s[j].getC_shapt()) {
					Student2 s1=new Student2();
					s1=s[i];
					s[i]=s[i+1];
					s[i+1]=s1;
				}
			}
		}
		if(lesson.equals("html")) {//进行HTML的成绩排序
			for(int i=0,j=i+1;i<s.length;i++) {
				if(s[i].getHtml()<s[j].getHtml()) {
					Student2 s1=new Student2();
					s1=s[i];
					s[i]=s[i+1];
					s[i+1]=s1;
				}
			}
		}
		if(lesson.equals("sql")) {//进行sql的成绩排序
			for(int i=0,j=i+1;i<s.length;i++) {
				if(s[i].getSql()<s[j].getSql()) {
					Student2 s1=new Student2();
					s1=s[i];
					s[i]=s[i+1];
					s[i+1]=s1;
				}
			}
		}
		System.out.println("序号"+'\t'+"姓名"+'\t'+"年龄"+'\t'+"java"+'\t'+"C#"+'\t'+"html"+'\t'+"sql"+'\t'+"总分"+'\t'+"平均分");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	public void makesum(Student2[] s) {//按总分排序
		int y=0;
		for(int i=0;i<s.length;i++)
			if(s[i]!=null)
				y+=1;
		Student2 x[]=new Student2[y];
		for(int i=0,j=0;i<s.length;i++,j++) {
			if(s[i]!=null)//将s中所有不为空的数组元素赋值给x数组，即x中所有的元素都不为空
				x[j]=s[i];
			else
			{
				j-=1;//当s中数组元素为空时，由于j在for循环中会有自加，所以在此处将j再进行自减运算，使x的元素中间无空的元素
				continue;
			}
		}
		System.out.println("序号"+'\t'+"姓名"+'\t'+"年龄"+'\t'+"java"+'\t'+"C#"+'\t'+"html"+'\t'+"sql"+'\t'+"总分"+'\t'+"平均分");
		if(x.length==1)//判断如果x的长度为1，则直接输出
			System.out.println(x[0]);
		else {
		for(int k=0,j=k+1;k<x.length;k++) {//当x的长度不为1时，则将x的元素逐个相比，并进行冒泡排序
			if(x[k].getSum()<x[j].getSum()) {
			Student2 s1=new Student2();
			s1=x[k];
			x[k]=x[j];
			x[j]=s1;
			}
		}
		for(int i=0;i<x.length;i++) {//将排序后的x数组逐个输出
			System.out.println(x[i]);
		}
	  }
	}
}
