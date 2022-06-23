class myThread extends Thread{
    String str;
    myThread(String s){
        super(s);
        str = s;
        
    }
    
    public void run(){
        try{
            for(int i =0; i<5; i++){
                System.out.println("In Thread " + str);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Exception");
        }
    }
}
public class Main
{
	public static void main(String[] args) throws Exception{
	    myThread t1 = new myThread("Jishnu");
	    t1.start();
	    t1.join();
	    Thread t2 = Thread.currentThread();
		System.out.println("Hello World");
		
		t2.setName("Darkness");
		System.out.println(t1.getName());
		System.out.println(t2);
		System.out.println(t1);
	}
}
