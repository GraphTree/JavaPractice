import java.util.ArrayList;
import java.util.List;

public interface IShare {
    List<String> write();
    void read(List<String> savedValues);
}
