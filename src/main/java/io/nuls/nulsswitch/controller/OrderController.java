package io.nuls.nulsswitch.controller;

import io.nuls.nulsswitch.entity.Deposit;
import io.nuls.nulsswitch.entity.Order;
import io.nuls.nulsswitch.service.OrderService;
import io.nuls.nulsswitch.wrapper.Wrapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value="获取所有的买单", notes = "分页获取所有的买单")
    @GetMapping("getAllAsks")
    public Wrapper<List<Order>> getAllAsks(@RequestBody Deposit param){
        //return WrapMapper.ok(orderService.selectList(null));
        return null;

    }

    @ApiOperation(value="获取所有的卖单", notes = "分页获取所有的卖单")
    @GetMapping("getAllBids")//买家单
    public Wrapper<Long> getAllBids(@RequestBody Deposit param){
        return null;
    }

    @ApiOperation(value="用户挂单", notes = "用户挂单")
    @GetMapping("createOrder")
    public Wrapper<Long> createOrder(@RequestBody Deposit param){
        return null;
    }

    @ApiOperation(value="用户撤单", notes = "用户撤单")
    @GetMapping("cancelOrder")
    public Wrapper<Long> cancelOrder(@RequestBody Deposit param){
        return null;
        //return WrapMapper.ok(unitService.create(param));
    }

    @ApiOperation(value="用户吃单", notes = "用户吃单")
    @GetMapping("tradingOrder")
    public Wrapper<Long> tradingOrder(@RequestBody Deposit param){
        return null;
    }

    @ApiOperation(value="确认订单", notes = "确认订单")
    @GetMapping("confirmOrder")
    public Wrapper<Long> confirmOrder(@RequestBody Deposit param){
        return null;
    }

    @ApiOperation(value="查询用户委托历史", notes = "查询用户委托历史")
    @GetMapping("getMyOrder")
    public Wrapper<Long> getMyOrder(@RequestBody Deposit param){
        return null;
    }

    @ApiOperation(value="查询订单明细", notes = "查询订单明细")
    @GetMapping("getMyOrderDetail")
    public Wrapper<Long> getMyOrderDetail(@RequestBody Deposit param){
        return null;
    }




}
