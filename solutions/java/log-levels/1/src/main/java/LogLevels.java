public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(":");
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(":");
        String regex = "\\[|\\]";
        return parts[0].replaceAll(regex, " ").toLowerCase().trim();
    }

    public static String reformat(String logLine) {
        String[] parts = logLine.split(":");
        parts[0] = parts[0].replace("[", "(").replace("]", ")").toLowerCase().trim();
        parts[1] = parts[1].trim();
        String formattedMessage = parts[1] + " " + parts[0];
        return formattedMessage;
    }
}
