package com.afkklein.handson.invillia.clients;

import com.afkklein.handson.invillia.dto.MessageS2itDTO;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="s2it", url="localhost:8000")
@RibbonClient("s2it")
public interface S2itClient {

    @GetMapping("/messages")
    MessageS2itDTO getS2itMessage();
}
