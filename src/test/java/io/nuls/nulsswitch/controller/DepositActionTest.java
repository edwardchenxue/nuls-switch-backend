package io.nuls.nulsswitch.controller;

import io.nuls.nulsswitch.NulsSwitchApplication;
import io.nuls.nulsswitch.entity.Order;
import io.nuls.nulsswitch.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NulsSwitchApplication.class)
public class DepositActionTest {

    @Autowired
    OrderService orderService;

    @Test
    public void dd() {
        Order order = new Order();
        order.setAddress("测试地址2");
        order.setOrderId("1234134");
        order.setStatus(1);
        orderService.insert(order);

    }

}
