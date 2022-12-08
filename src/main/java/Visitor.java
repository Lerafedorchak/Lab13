import java.util.Map;

public interface Visitor<T> {
    Map<String, String> onSignature(Task<T> task);
    Map<String, String> onSGroupStart(Task<T> task);
    Map<String, String> onSGroupEnd(Task<T> task);
}
