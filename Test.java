package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Students a = new Students();
		Teacher b = new Teacher();
		Course c= new Course();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String mName = a.getName();
		String mNumber = a.getNumber();
		String mSex = a.getSex();
		a.setNumber("2020322056");
		a.setName("zhangxuechen");
		a.setSex("girl");
		mName = a.getName();
		mNumber = a.getNumber();
		mSex = a.getSex();
		String teachernumber=b.getNumber();
		String teachername = b.getName();
		String teacherclass =b.getInstruction();
		b.setNumber("2020322099");
		b.setName("�ƿ���");
		b.setInstruction("java��ʦ");
		teachername = b.getName();
		teachernumber=b.getNumber();
		teacherclass=b.getInstruction();
		String coursenumber =c.getNumber();
		String coursename =c.getName();
		String courseplace =c.getPalce();
		String courseteacher=c.getTeacher();
		c.setNumber("105");
		c.setName("���Դ���");
		c.setPalce("�ۺ�¥102");
		c.setTeacher("����ʦ");
		coursenumber =c.getNumber();
		coursename =c.getName();
		courseplace =c.getPalce();
		courseteacher=c.getTeacher();
		System.out.println("ѧ��ѡ��ϵͳ");
		System.out.println("Serial number is : " + mNumber);
		System.out.println("Name is : " + mName);
		System.out.println("Gerder is :" + mSex);
		a.setClasss("java");
		String mClass = a.getClasss();
		System.out.println("elective is :" + mClass);
		System.out.println("lecture teacher code is :"+teachernumber);
		System.out.println("lecture teacher is ��"+teachername);
		System.out.println("place location is :"+teacherclass);
		System.out.println("The course number :"+coursenumber);
		System.out.println("Course title :"+coursename);
		System.out.println("Course plance :"+courseplace);
		System.out.println("sclooltime is :"+df.format(new Date()));
		System.out.println("lecture teacher name is :"+courseteacher);

	
       
	}
}
