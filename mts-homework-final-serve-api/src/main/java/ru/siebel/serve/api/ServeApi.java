package ru.siebel.serve.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.siebel.order.dto.Order;

@FeignClient(
        name = "ServeApi",
        url = "localhost:7171"
)
public interface ServeApi {

    @PostMapping("/serveOrder")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void serveOrder(@RequestBody Order dto);
}