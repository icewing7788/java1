package work3;

import java.util.Scanner;
public class Student3 {
	Scanner in=new Scanner(System.in);
	public void print(Student2[] s,int i) {//���ѧ������Ϣ
		System.out.println("���"+'\t'+"����"+'\t'+"����"+'\t'+"java"+'\t'+"C#"+'\t'+"html"+'\t'+"sql"+'\t'+"�ܷ�"+'\t'+"ƽ����");
		System.out.println(s[i]);
	}
	public void All(Student2[] s) {//�������ѧ��
		System.out.println("���"+'\t'+"����"+'\t'+"����"+'\t'+"java"+'\t'+"C#"+'\t'+"html"+'\t'+"sql"+'\t'+"�ܷ�"+'\t'+"ƽ����");
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
				System.out.println("δ��¼��ѧ����Ϣ");
				continue;
			}
			else
			{System.out.println(s[i]);}
		}
	}
	public void creat(Student2[] s) {//���ѧ����Ϣ
		for(int i=0,j=1;i<s.length;i++,j++) {//����iΪ������±�ֵ���Ƚ����жϣ��жϺ��ھ����Ƿ�ֵ��jΪѧ�������
			if(s[i]==null) {//�ж��������Ԫ���Ƿ�Ϊ�գ���Ϊ����Ϊ�丳ֵ
				System.out.println("������ѧ������:");
				Student2 s1=new Student2();
				s1.setName(in.next());
				System.out.println("������ѧ�����䣺");
				s1.setAge(in.nextInt());
				s[i]=s1;
				s[i].setNum(j);
			}
			else {
				j-=1;		//��������Ԫ�ز�Ϊ�գ��������ֱ�ӴӴ˴�������Ϊ��һ��Ԫ�ص���ű�����ֵ
				continue;//������Ԫ�ز�Ϊ�գ���������Ԫ��
			}
		}
		System.out.println("ѧ����Ϣ�洢�ɹ�");
	}
	
	public int find(int num,Student2[] s) {//����ѧ�����˴�������Ϊint���͵ĺ�����������֮��Ĵ����е��á�
		int i,j;
		for(i=0,j=0;i<s.length;i++,j++) {
			if(s[i]==null)		//�ж�������ѧ����Ϣ�Ƿ�Ϊ�գ���Ϊ����ֱ������
				continue;
			else if(num==s[i].getNum()) {//�ж�������ҵ�����Ƿ��벻Ϊ�յ�ѧ�������ͬ
			print(s,i);			//�����������
			i=s.length+1;		//�����ҵ�ѧ������Ϣ�����ڴ˴�ʹ��Ϊi���¸�ֵ
			break;
		}
		}
		if(i<=s.length) {			//�ڴ˴�ʹ��if����ж�i�����д�ѧ����Ϣ����i��ֵ��������s�ĳ���
			System.out.println("ϵͳ���޴�ѧ����Ϣ��");
			j=s.length+1;}//����Ҫ���ҵ�ѧ����Ϣ����Ϊ�丳ֵΪ����ĳ��ȼ�һ���������Ժ�ĵ����н����ж�
		return j;			
	}
	public void change(int num,Student2[] s) {//�޸�ѧ����Ϣ
		int i;
		int yy;
		i=find(num,s);//��find�����е�j���ظ�i��Ϊ֮�µĴ����ṩ�жϵĻ���
		if(i<s.length) {//�ж�i�Ƿ�С������ĳ��ȣ���С�����������д�ѧ�������Խ����޸ģ���֮��
			System.out.println("--��ѡ��Ҫ�޸ĵ���Ϣ--");
			System.out.println("1������");
			System.out.println("2������");
			System.out.println("3��Java�ɼ�");
			System.out.println("4��c#�ɼ�");
			System.out.println("5��HTML�ɼ�");
			System.out.println("6��sql�ɼ�");
			yy=in.nextInt();
			switch(yy) {
			case 1: 
			System.out.println("������Ҫ�޸ĵ�����:");
			s[i].setName(in.next());
			break;
			case 2:
			System.out.println("������Ҫ�޸ĵ�����:");
			s[i].setAge(in.nextInt());
			break;
			case 3:
			System.out.println("������Ҫ�޸ĵ�Java�ɼ�:");
			s[i].setJava(in.nextInt());
			break;
			case 4:
			System.out.println("������Ҫ�޸ĵ�C#�ɼ�:");
			s[i].setC_shapt(in.nextInt());
			break;
			case 5:
			System.out.println("������Ҫ�޸ĵ�html�ɼ�:");
			s[i].setHtml(in.nextInt());
			break;
			case 6:
			System.out.println("������Ҫ�޸ĵ�sql:");
			s[i].setSql(in.nextInt());
			break;
			}
			int sum=s[i].getJava()+s[i].getC_shapt()+s[i].getHtml()+s[i].getSql();
			s[i].setSum(sum);//�˴����ɼ����ָܷ�ֵ
			int avg=sum/4;
			s[i].setAvg(avg);//�˴����ɼ���ƽ���ָ�ֵ
			
		}
	}
	public void delete(int num,Student2[] s) {//ɾ��ѧ��
		int i;
		i=find(num,s);//��find�����е�j���ظ�i��Ϊ֮�µĴ����ṩ�жϵĻ���
		if(i<s.length) {//�ж�i�Ƿ�С������ĳ��ȣ���С�����������д�ѧ��������ɾ������i�������鳤�ȣ����޴�ѧ����Ϣ��ֱ������
		System.out.println("ȷ��ɾ����ѧ����Ϣ����Y/N��");
		if(in.next().equals("Y")) {
			s[i]=null;//�ڴ˴�����ָ��������Ԫ�ظ�ֵΪ��
			System.out.println("ɾ���ɹ���");
		}				
		else
			System.out.println("ɾ��ȡ��");
		}
	}
	public void getscore(int num,Student2[] s) {//д��ѧ���ɼ�
		int i;
		i=find(num,s);//��find�����е�j���ظ�i��Ϊ֮�µĴ����ṩ�жϵĻ���
		if(i<s.length) {//�ж�i�Ƿ�С������ĳ��ȣ���С�����������д�ѧ�������Խ��гɼ�¼�룬��i�������鳤�ȣ����޴�ѧ����Ϣ��ֱ������
			System.out.println("��ֱ��������п�Ŀ�ĳɼ�:");
			System.out.println("java   C#   html   sql");
			s[i].setJava(in.nextInt());
			s[i].setC_shapt(in.nextInt());
			s[i].setHtml(in.nextInt());
			s[i].setSql(in.nextInt());
			int sum=s[i].getJava()+s[i].getC_shapt()+s[i].getHtml()+s[i].getSql();
			s[i].setSum(sum);//�˴����ɼ����ָܷ�ֵ
			int avg=sum/4;
			s[i].setAvg(avg);//�˴����ɼ���ƽ���ָ�ֵ
			i=s.length+1;
			}
	}
	public void makeas(String lesson,Student2[] s) {//��ָ����Ŀ��������
		if(lesson.equals("java")) {//����java�ĳɼ�����
			for(int i=0,j=i+1;i<s.length;i++) {
				if(s[i].getJava()<s[j].getJava()) {
					Student2 s1=new Student2();
					s1=s[i];
					s[i]=s[i+1];
					s[i+1]=s1;
				}
			}
		}
		if(lesson.equals("C#")) {//����C#�ĳɼ�����
			for(int i=0,j=i+1;i<s.length;i++) {
				if(s[i].getC_shapt()<s[j].getC_shapt()) {
					Student2 s1=new Student2();
					s1=s[i];
					s[i]=s[i+1];
					s[i+1]=s1;
				}
			}
		}
		if(lesson.equals("html")) {//����HTML�ĳɼ�����
			for(int i=0,j=i+1;i<s.length;i++) {
				if(s[i].getHtml()<s[j].getHtml()) {
					Student2 s1=new Student2();
					s1=s[i];
					s[i]=s[i+1];
					s[i+1]=s1;
				}
			}
		}
		if(lesson.equals("sql")) {//����sql�ĳɼ�����
			for(int i=0,j=i+1;i<s.length;i++) {
				if(s[i].getSql()<s[j].getSql()) {
					Student2 s1=new Student2();
					s1=s[i];
					s[i]=s[i+1];
					s[i+1]=s1;
				}
			}
		}
		System.out.println("���"+'\t'+"����"+'\t'+"����"+'\t'+"java"+'\t'+"C#"+'\t'+"html"+'\t'+"sql"+'\t'+"�ܷ�"+'\t'+"ƽ����");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	public void makesum(Student2[] s) {//���ܷ�����
		int y=0;
		for(int i=0;i<s.length;i++)
			if(s[i]!=null)
				y+=1;
		Student2 x[]=new Student2[y];
		for(int i=0,j=0;i<s.length;i++,j++) {
			if(s[i]!=null)//��s�����в�Ϊ�յ�����Ԫ�ظ�ֵ��x���飬��x�����е�Ԫ�ض���Ϊ��
				x[j]=s[i];
			else
			{
				j-=1;//��s������Ԫ��Ϊ��ʱ������j��forѭ���л����Լӣ������ڴ˴���j�ٽ����Լ����㣬ʹx��Ԫ���м��޿յ�Ԫ��
				continue;
			}
		}
		System.out.println("���"+'\t'+"����"+'\t'+"����"+'\t'+"java"+'\t'+"C#"+'\t'+"html"+'\t'+"sql"+'\t'+"�ܷ�"+'\t'+"ƽ����");
		if(x.length==1)//�ж����x�ĳ���Ϊ1����ֱ�����
			System.out.println(x[0]);
		else {
		for(int k=0,j=k+1;k<x.length;k++) {//��x�ĳ��Ȳ�Ϊ1ʱ����x��Ԫ�������ȣ�������ð������
			if(x[k].getSum()<x[j].getSum()) {
			Student2 s1=new Student2();
			s1=x[k];
			x[k]=x[j];
			x[j]=s1;
			}
		}
		for(int i=0;i<x.length;i++) {//��������x����������
			System.out.println(x[i]);
		}
	  }
	}
}
