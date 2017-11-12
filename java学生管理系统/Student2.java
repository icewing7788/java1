package work3;

public class Student2{
	private int num;
	private String name;
	private int age;
	private int java;
	private int C_shapt;
	private int html;
	private int sql;
	private int sum;
	private int avg;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getC_shapt() {
		return C_shapt;
	}
	public void setC_shapt(int c_shapt) {
		C_shapt = c_shapt;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public String toString() {				
		return this.num+"\t"+this.name+"\t"+this.age+"\t"+
			this.java+"\t"+this.C_shapt+"\t"+this.html+"\t"
				+this.sql+"\t"+this.sum+"\t"+this.avg;
	}
	}
