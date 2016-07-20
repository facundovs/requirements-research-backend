package api.restcontrollers;

import model.Symbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repositories.SymbolRepository;

/**
 * Created by facundov on 19/07/16.
 */
@RestController
public class SymbolController {
    @Autowired
    private SymbolRepository repository;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Hello World";
    }


}



