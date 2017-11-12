package akihyro.tryspringboot.sample;

import akihyro.tryspringboot.hoges.HogeData;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sample")
public class SampleController {
    private static List<HogeData> store = new ArrayList<HogeData>();

    /**
     * GETのURLが、http://localhost:8080/sampleの場合。
     * resources/templates/sample/index.html
     * を返す。
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("name", "API");
        model.addAttribute("get", "GET /sample");
        model.addAttribute("post", "POST / sample");
        return "sample/index.html";
    }
}
