package net.vince.slow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class SlowEndpoint {

  @ResponseBody
  @GetMapping("/delay")
  public String delay(@RequestParam String delay) throws InterruptedException {
    Thread.sleep(Long.parseLong(delay.replaceAll("\\D", "")));
    System.out.print('.');
    return "DELAYED";
  }
}
