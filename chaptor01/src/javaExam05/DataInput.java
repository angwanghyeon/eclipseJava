package javaExam05;

public class DataInput {
	FlyableVar fv = new FlyableVar();
	FlyableVar fv2 = new FlyableVar();
	
	FlyableVar.Flyable f = new FlyableVar.Flyable() {
		
		@Override
		public void speed() {
			System.out.println("속도");
		}
		
		@Override
		public void height() {
			System.out.println("높이");
		}
	};
	
	DataInput(){
		fv.setFly(f);
		fv2.setFly(new FlyableVar.Flyable() {
			@Override
			public void speed() {
				System.out.println("속도 : ");
			}
			@Override
			public void height() {
				System.out.println("높이 : ");
			}
		});
	}
}
