package AdditionalPrograms;

public class ThreadExercise implements Runnable{

    Account acc = new Account();

    public static void main(String[] args) {
        ThreadExercise ts = new ThreadExercise();
        Thread t1 = new Thread(ts, "person 1");
        Thread t2 = new Thread(ts, "person 2");
        Thread t3 = new Thread(ts, "person 3");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            makeWithdraw(100);
            if (acc.getBal() < 0) {
                System.out.println("account is overdrawn!");
            }
            deposit(200);
        }
    }


    public class ThreadExercise extends Thread implements Runnable {

    	private Person person;

    	public ThreadExercise(Person p) {
    	    this.person = p;
    	}

    	public static void main(String[] args) {

    	    ThreadExercise ts1 = new ThreadExercise(new Person("person 1"));
    	    ts1.start();
    	    ThreadExercise ts2 = new ThreadExercise(new Person("person 2"));
    	    ts2.start();
    	    ThreadExercise ts3 = new ThreadExercise(new Person("person 3"));
    	    ts3.start();

    	}

    	@Override
    	public void run() {
    	    for (int i = 0; i < 3; i++) {
    	        try {
    	            Account acc = Account.getAccount(person);
    	            acc.withdraw(100);
    	            try {
    	                Thread.sleep(200);
    	            } catch (InterruptedException ex) {
    	                Logger.getLogger(ThreadExercise.class.getName()).log(Level.SEVERE, null, ex);
    	            }
    	            if (acc.getBal() < 0) {
    	                System.out.println("account is overdrawn!");
    	            }
    	            acc.deposit(200);

    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    }
    	    System.out.println("Final Acc balance is Rs." + Account.getBal());
    	}}