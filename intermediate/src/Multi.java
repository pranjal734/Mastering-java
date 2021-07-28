
public class Multi implements Runnable {
	String user;

	public static void main(String[] args) throws InterruptedException {
		Multi m = new Multi();
		Thread t1 = new Thread(m);
		t1.setName("Ankur's Thread");
		m.user = "Ankur";
		Thread t2 = new Thread(m);
		t2.setName("Pranjal's Thread");
		m.user = "pranjal";
		t1.start();
		t2.start();
		System.err.println("Main ends");
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"   "+user+"  "+this.hashCode());
	}

}
