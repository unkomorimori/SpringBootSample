package akihyro.tryspringboot.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// thymeleafの場合は、RestControllerを使ってはならない
//@RestController
@Controller
@RequestMapping("/sample")
public class SampleController {

    /**
     * GETのURLが、http://localhost:8080/sampleの場合。
     * resources/templates/sample/index.html
     * を返す。
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    //@RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("name", "API");
        model.addAttribute("get", "GET /sample");
        model.addAttribute("post", "POST / sample");
        return "sample/sample";
    }
}
