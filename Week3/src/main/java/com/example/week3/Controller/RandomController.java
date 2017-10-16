package com.example.week3.Controller;

import com.example.week3.Service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    @Autowired
    private RandomService randomService;

    @RequestMapping("generateArray")
    public String GetArray() {
        String result = "";
        long startTime = System.nanoTime();
        result = "起始时间：" + startTime + " ";
        String array = randomService.GetArrayRandom();
        long endTime = System.nanoTime();
        result += "结束时间：" + endTime + " ";
        result += "执行时间：" + (startTime - endTime) + "ns ";
        return result + "数组结果：" + array;
    }
}
