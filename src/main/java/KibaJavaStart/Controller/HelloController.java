package KibaJavaStart.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: anson
 * @Date: 2019/12/19 10:32
 * @version: 1.0
 */
@RestController
public class HelloController
{
    @RequestMapping(value = "/GetName", method = RequestMethod.GET)
    public String GetName()
    {
        return "我是Kiba518";
    }
    @RequestMapping(value = "/GetAge", method = RequestMethod.GET)
    public int GetAge()
    {
        return 518;
    }
}
