package edu.parinya.softarchdesign.structural;
import java.time.format.DateTimeFormatter;  
import java.time.Year;  
import java.time.ZoneOffset; 
import java.time.OffsetDateTime;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.printf("Decorate" + worker.getName() + "with TimeLogging.\n");
    }

    @Override
    public void service() {
        ZoneOffset zoneOffSet= ZoneOffset.of("+07:00");
        OffsetDateTime date = OffsetDateTime.now(zoneOffSet);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MMM dd yyyy HH:mm:ss");  
        System.out.println(dtf.format(date)+" TCT "+ Year.now() + ": ");
        super.service();
    }
}
