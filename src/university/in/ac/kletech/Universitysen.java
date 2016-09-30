package university.in.ac.kletech;

public interface Universitysen {
	void verifydepartment(department[] d);

}
interface UGC{
	void numberofcollage(college[] c);
}
//implementing interface
class college implements UGC{
	String Studentname;
	int Code;
	int nooffaculty;
	int noofstudents;
	public college(String Studentname,int Code,int nooffaculty,int noofstudents){
		super();
		this.Studentname=Studentname;
		this.Code=Code;
		this.nooffaculty=nooffaculty;
		this.noofstudents=noofstudents;
	}
	public college(){
		//constructor body
	}
	public void numberofcollage(college[] no)
	{
		if(no.length>4)
			System.out.println("Number  of Collages Exceeded\n");
		else
			System.out.println("Number of collages in limitn");
	}
	public void collegechecks(college[] c1){
		System.out.println("colleges under university\n");
		for(int i=0;i<2;i++)
		{
			System.out.println("college name:"+c1[i].Studentname);
		}
	}
}
class KLEIT extends college{    //body of a class
	int Code;
	String Studentname;
	int nooffaculty;
	int noofstudents;
	int noofsub;
	KLEIT(int Code,String sname,int nooffaculty,int noofstu,int noofsub){
		super();
		this.noofsub=noofsub;
	}
	public void displaysubjects(){    //method body
		System.out.println("Number of subjects intake is:"+noofsub);
	}
}
class department implements Universitysen
{
	final String s="Both colleges have same";    //final variable
	int inoofstud;
	int inooffaculties;
	String sdepartmentname;
	public department(int inoofstud,int inooffaculties,String sdepartmentname){   //constructor body
		super();
		this.inoofstud=inoofstud;
		this.inooffaculties=inooffaculties;
		this.sdepartmentname=sdepartmentname;
	}
	public department(){ 
	}

	public void verifydepartment(department[] d){
		int j;
		System.out.println("Number of Department Checks\n");
		for(j=0;j<d.length;j++)
		{
			if(d[j].inoofstud>80)
				System.out.println("Department\t"+d[j].sdepartmentname+"\thas exceeded max students limits with:"+d[j].inoofstud);
			else
			System.out.println("Department\t"+d[j].sdepartmentname+"\t-Number of Department in the limit\n");
		}
	}
	public void verifyfaculties(department[] d){
		int j;
		System.out.println("Number of faculties in the limit\n");
		for(j=0;j<d.length;j++)
		{
			if(d[j].inooffaculties>40)
				System.out.println("Department\t"+d[j].sdepartmentname+"\thas exceeded max faculties limits with:"+d[j].inooffaculties);
			else
				System.out.println("Department\t"+d[j].sdepartmentname+"\t-Number of Department in the limit\n");
		}
	}

}
