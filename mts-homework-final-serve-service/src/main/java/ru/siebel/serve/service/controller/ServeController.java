package ru.siebel.serve.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.siebel.order.dto.Order;
import ru.siebel.serve.api.ServeApi;
import ru.siebel.serve.service.service.ServeService;

@RestController
@RequiredArgsConstructor
public class ServeController implements ServeApi {

    private final ServeService serveService;

    @Override
    public void serveOrder(Order dto) {
        serveService.serveOrder(dto);
    }
}
