import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentTime = LocalDateTime.now();
        return appointmentDate.isBefore(currentTime);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime time = appointmentDate.toLocalTime();
        return !time.isBefore(LocalTime.NOON) && time.isBefore(LocalTime.of(18, 0));
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        return "You have an appointment on " + appointmentDate.format(formatter) + ".";
    }

    public LocalDate getAnniversaryDate() {
        LocalDate currentDate = LocalDate.now();
        return LocalDate.of(currentDate.getYear(), 9, 15);
    }
}
