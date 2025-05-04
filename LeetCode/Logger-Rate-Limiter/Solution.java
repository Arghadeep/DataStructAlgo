class Logger {
    private Map<String,Integer> loggerMap;
    public Logger() {
        this.loggerMap = new HashMap<>();
    }
    // public Logger(int timestamp, String message) {
    //     this.timestamp = timestamp;
    //     this.message = message;

    // }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(loggerMap.containsKey(message)) {
            if(loggerMap.get(message) > timestamp) return false;
            else {
                loggerMap.put(message, timestamp+10);
                return true;
            }
        } else {
            loggerMap.put(message, timestamp+10);
            return true;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */