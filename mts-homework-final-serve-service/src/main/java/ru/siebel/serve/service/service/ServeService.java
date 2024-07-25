package ru.siebel.serve.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.siebel.order.api.OrderApi;
import ru.siebel.order.dto.Order;
import ru.siebel.order.dto.enums.StatusEnum;

@Service
@RequiredArgsConstructor
public class ServeService {

    private final OrderApi orderApi;

    public void serveOrder(Order dto) {
        dto.setStatus(StatusEnum.SERVED.getValue());
        orderApi.updateOrder(dto);
    }
}
