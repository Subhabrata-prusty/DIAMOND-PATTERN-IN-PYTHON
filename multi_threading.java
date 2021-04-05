class subham extends Thread{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		System.out.println("hello in main ():");
		
		subham s1 = new subham();
		s1.start();
		System.out.println("hello");

		subham s2 = new subham();
		s2.start();

		subham s3 = new subham();
		s3.start();

		subham s4 = new subham();
		s4.start();

		subham s5 = new subham();
		s5.start();

		subham s6 = new subham();
		s6.start();
		System.out.println("okay🎈🎈🎈🎈");


	}
}