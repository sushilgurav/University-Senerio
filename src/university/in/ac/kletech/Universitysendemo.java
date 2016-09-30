package university.in.ac.kletech;

public class Universitysendemo {

	public static void main(String[] args) {
		 
		college[] c=new college[2];	//creating object
		college p=new college();
		c[0]=new college("",333,678,342);
		c[1]=new college("RV",34,786,333);
		p.numberofcollage(c);
		p.collegechecks(c);
		
		KLEIT kt=new KLEIT(27,"IT",46,77,46);
		kt.displaysubjects();
		
		department[] d=new department[6];
		department r=new department();
		d[0]=new department(30,56,"CSE");
		d[1]=new department(57,30,"EC");
		d[2]=new department(23,11,"ROBOTICS");
		d[3]=new department(67,64,"MECHANICAL");
		d[4]=new department(55,34,"CIVIL");
		d[5]=new department(60,88,"EEE");
		System.out.println("IN KLEIT college");
		//System.out.println("In KLETECH college");
		r.verifydepartment(d);
		r.verifyfaculties(d);

	}

}
