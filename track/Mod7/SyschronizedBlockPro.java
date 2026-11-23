class Hospital implements Runnable {
    String res1 = "Bod";
    String res2 = "Doctor";
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("TOM")) {
            tomTreatment();
        } else {
            jorryTreatment();
        }
    }
    void tomTreatment() {
        try {
            synchronized(res1)//Bad
            {
                System.out.println("Tom has occupied " + res1);
                Thread.sleep(3000);
                synchronized(res2)// Doctor
                {
                    System.out.println("Tom has occupied " + res2);
                    Thread.sleep(3000);
                }
            }

        }
    }
}