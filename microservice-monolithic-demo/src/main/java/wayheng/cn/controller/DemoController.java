package wayheng.cn.controller;

import cn.hutool.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/getDemo")
    @ResponseBody
    public JSONObject getDemo() {
        JSONObject obj = new JSONObject();
        obj.set("code", 200);
        obj.set("message", "OK");
        return obj;
    }

}
