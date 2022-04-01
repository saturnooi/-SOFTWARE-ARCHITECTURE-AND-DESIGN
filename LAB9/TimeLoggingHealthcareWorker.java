package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.printf("Decorate" + worker.getName() + "with TimeLogging.\n");
    }

    @Override
    public void service() {
        Date date = new Date();
        System.out.println(date.toString()+": ");
        super.service();
    }
}
