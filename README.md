# -计G201  张雪琛  2020322056
## 实验目的  
1.	从学生选课了解系统中的实体及其关系，学会定义类中的属性及其方法。  
2.	从简化系统考虑，每名教师仅教授一门课程，每门课陈的授课老师仅一位，每名学生仅选一门课程。  
## 实验过程  
1.	创建新java项目。
2.	编写student、test两个。
3.	编写student里的语句：构造学号、姓名、性别等并输入赋值语句和返回语句。
4.	编写text语句：主要为对老师、学生、学号和课程等进行赋值、输入函数信息。
5.	运行程序。
## 核心代码  
```
Public class Students extends Personner{                                                      //调用父类
	public Students(String number, String name, String sex) {
		super(number, name, sex);	
	}
	public Students() {
		super(number, name, sex);
	}
```
## 实验结果  
代码可运行，运行结果如下：  
```
学生选课系统
Serial number is：2020322056
Name is：zhangxuechen
Gerder is：girl
Elective is：java
Lecture teacher code is：2020322099
Lecture teacher is:
Place location is:java 老师
The course number：105
Course title：线性代数
Course plance：综合楼102
Sclootime is：2020-10-26 20：32：23
Lecture teacher name is：
```
## 实验感想   
通过这次实验课   
1.	掌握了面向对象的类设计方法（属性、方法）。  
2.	掌握了类的继承用法，通过构造方法实例化对象。  
