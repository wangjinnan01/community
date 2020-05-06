package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  <p>title:life.majiang.community.controller</p >
 *  <p>ClassName:HelloController</p >
 *  <p>Description:TODO(请用一句话描述这个类的作用)</p >
 *  author:wangjinnan
 *  date:2020/5/6
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }

}
