package university;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new FullTimeStudent();
		Student student2 = new PartTimeStudent();
		Student	student3 = new IndustryBasedDecorator(new FullTimeStudent());
		Student	student4 = new ResearchBasedDecorator(new PartTimeStudent());
		
		System.out.println(student1.fee());
		System.out.println(student2.fee());
		System.out.println(student3.fee());
		System.out.println(student4.fee());
	}

}
