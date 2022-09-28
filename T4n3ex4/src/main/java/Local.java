import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@AllArgsConstructor
@Data
@ToString
public class Local {
    private String name;
    private boolean isOpen;
}
