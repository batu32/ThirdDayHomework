package thirdDay;

public class Main {

	public static void main(String[] args) {
	Instructor �nstructor=new Instructor();
	�nstructor.id=1;
	�nstructor.appArrangmentPlans="kodlar daha temiz olacak";
			
	Student student=new Student();
	student.id=2;
	student.studensHomework="ikinci g�n �devleri bbitirilecek";
	
	
	User user=new User();
	user.id=3;
	user.userDuty="Takip edilen kursta ilerleme kaydedilecek";
	
	MethodCollector methodCollector=new MethodCollector();
	methodCollector.Collect(new UserManager());
			 
	System.out.println(student.studensHomework);
	

	}

}
