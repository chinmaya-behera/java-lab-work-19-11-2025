class LicensingTask extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " started.");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " completed.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        LicensingTask medical = new LicensingTask();
        LicensingTask testDrive = new LicensingTask();
        LicensingTask officer = new LicensingTask();

        medical.setName("Medical");
        testDrive.setName("Test Drive");
        officer.setName("Officer");

        medical.start();
        medical.join();

        testDrive.start();
        testDrive.join();

        officer.start();
    }
}