package work3;

import java.util.Scanner;
public class Student1 {
public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("---������Ҫ¼ ���ѧ������:---");
	int many=in.nextInt();
	Student2 s[]=new Student2[many];
	System.out.println("--��ѡ����Ҫ���еĲ���--");
	System.out.println("1�����ѧ����Ϣ");
 	System.out.println("2������ѧ����Ϣ");
	System.out.println("3���޸�ѧ����Ϣ");
	System.out.println("4��ɾ��ѧ����Ϣ");
	System.out.println("5������ѧ���ɼ�");
	System.out.println("6������ĳ�ųɼ���������");
	System.out.println("7�������ֽܷ�������");
	System.out.println("8���������ѧ��");
	System.out.println("9���˳�ϵͳ");
	Student3 St=new Student3();
	String x;
	boolean y;
	do{	
	System.out.println("��ѡ����Ҫ�������еĲ���:");
	x=in.next();
	y=true;			
	switch(x) {
	case "1":St.creat(s);break;
	case "2":System.out.println("������Ҫ���ҵ�ѧ�������:");
		St.find(in.nextInt(),s);break;
	case "3":System.out.println("������Ҫ�޸ĵ�ѧ�����:");
		St.change(in.nextInt(), s);break;
	case "4":System.out.println("������Ҫɾ����ѧ�����:");
		St.delete(in.nextInt(), s);break;
	case "5":System.out.println("������¼��ɼ���ѧ�����:");
		St.getscore(in.nextInt(), s);break;
	case "6":System.out.println("������Ҫ����ĳɼ�:");
		St.makeas(in.next(), s);break;
	case "7":System.out.println("���ܷ���������:");
		St.makesum(s);break;
	case "8":System.out.println("����ѧ�����£�");
		St.All(s);break;
	case "9":y=false;			
		System.out.println("�����˳�ѧ��ϵͳ��");break;

	default: System.out.println("�޴˹��ܣ�");
	}
  }while(y);
 }
}
