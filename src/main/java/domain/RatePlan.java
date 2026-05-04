package main.java.domain;

public enum RatePlan {
    HIGHT(50000, 100000),
    LOW(1000, 10000),
    MEDIUM(10000, 50000);
    private final long from;
    private final long to;
    RatePlan(long from, long to) {
        this.from = from;
        this.to = to;
    }
    public long getFrom() {
        return from;
    }
    public long getTo() {
        return to;
    }
}
