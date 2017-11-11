package akihyro.tryspringboot.hoges;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hoges")
public class HogeController {
    private static List<HogeData> store = new ArrayList<HogeData>();

    /**
     * POST
     * @param data
     * @param uriComponentsBuilder
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<HogeData> post(@ModelAttribute HogeData data, UriComponentsBuilder uriComponentsBuilder) {
        store.add(data);
        HttpHeaders headers = new HttpHeaders();

        // Httpのレスポンスのヘッダーに、
        // Location: http://localhost:8080/hoges/2
        // が格納される。
        headers.setLocation(uriComponentsBuilder
                .path("/hoges/{id}")
                .buildAndExpand(store.size()).toUri());

        System.out.println(store.toString());

        return new ResponseEntity<HogeData>(data, headers, HttpStatus.CREATED);
    }

    /**
     * GETのURLが、http://localhost:8080/hoges
     * の場合。storeオブジェクトをすべて返す。
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<HogeData> get() {
        return store;
    }

    /**
     * GETのURLが、http://localhost:8080/hoges/{id}
     * の場合、store.get(id-1)を返す。
     * @param id
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public HogeData get(@PathVariable int id) {
        return store.get(id - 1);
    }

}
