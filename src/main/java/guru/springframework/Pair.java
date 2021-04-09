package guru.springframework;

import java.util.Objects;

public class Pair {
    private final String from;
    private final String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override public int hashCode() {
        return Objects.hash(from, to);
    }
}
