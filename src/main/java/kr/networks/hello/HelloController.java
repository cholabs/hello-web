package kr.networks.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/")
    public String defaultPage(ModelMap model) {
        return "hello";
    }

    //@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    @GetMapping("/hello/{name:.+}")
    public ModelAndView hello(@PathVariable("name") String name) {
        ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        model.addObject("message", name);

        return model;
    }

}
