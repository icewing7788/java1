package work3;

import java.util.Scanner;
public class Student1 {
public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("---请输入要录 入的学生个数:---");
	int many=in.nextInt();
	Student2 s[]=new Student2[many];
	System.out.println("--请选择您要进行的操作--");
	System.out.println("1、添加学生信息");
 	System.out.println("2、查找学生信息");
	System.out.println("3、修改学生信息");
	System.out.println("4、删除学生信息");
	System.out.println("5、输入学生成绩");
	System.out.println("6、根据某门成绩进行排序");
	System.out.println("7、根据总分进行排序");
	System.out.println("8、输出所有学生");
	System.out.println("9、退出系统");
	Student3 St=new Student3();
	String x;
	boolean y;
	do{	
	System.out.println("请选择您要继续进行的操作:");
	x=in.next();
	y=true;			
	switch(x) {
	case "1":St.creat(s);break;
	case "2":System.out.println("请输入要查找的学生的序号:");
		St.find(in.nextInt(),s);break;
	case "3":System.out.println("请输入要修改的学生序号:");
		St.change(in.nextInt(), s);break;
	case "4":System.out.println("请输入要删除的学生序号:");
		St.delete(in.nextInt(), s);break;
	case "5":System.out.println("请输入录入成绩的学生序号:");
		St.getscore(in.nextInt(), s);break;
	case "6":System.out.println("请输入要排序的成绩:");
		St.makeas(in.next(), s);break;
	case "7":System.out.println("按总分排序如下:");
		St.makesum(s);break;
	case "8":System.out.println("所有学生如下：");
		St.All(s);break;
	case "9":y=false;			
		System.out.println("您已退出学生系统！");break;

	default: System.out.println("无此功能！");
	}
  }while(y);
 }
}
