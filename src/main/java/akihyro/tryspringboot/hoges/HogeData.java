package akihyro.tryspringboot.hoges;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement
public class HogeData {
    private Integer integer;
    private String string;
    private List<String> strings;
}
