package thirdDay;

public class Main {

	public static void main(String[] args) {
	Instructor ýnstructor=new Instructor();
	ýnstructor.id=1;
	ýnstructor.appArrangmentPlans="kodlar daha temiz olacak";
			
	Student student=new Student();
	student.id=2;
	student.studensHomework="ikinci gün ödevleri bbitirilecek";
	
	
	User user=new User();
	user.id=3;
	user.userDuty="Takip edilen kursta ilerleme kaydedilecek";
	
	MethodCollector methodCollector=new MethodCollector();
	methodCollector.Collect(new UserManager());
			 
	System.out.println(student.studensHomework);
	

	}

}
