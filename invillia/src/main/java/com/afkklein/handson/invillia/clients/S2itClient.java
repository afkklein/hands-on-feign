package com.afkklein.handson.invillia.clients;

import com.afkklein.handson.invillia.dto.ResponseMessageS2itDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="s2it")
@RibbonClient("s2it")
public interface S2itClient {

    @GetMapping("/autores")
    ResponseMessageS2itDto getS2itAutores();

    @GetMapping("/livros")
    ResponseMessageS2itDto getS2itLivros();
}
