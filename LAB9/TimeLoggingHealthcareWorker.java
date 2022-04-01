package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.printf("Decorate" + worker.getName() + "with TimeLogging.\n");
    }

    @Override
    public void service() {
        System.out.println((new Date().toString())+": ");
        super.service();
    }
}
