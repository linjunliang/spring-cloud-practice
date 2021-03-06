package coml.lin.alibaba.producer.controller;

import com.lin.vo.BaseVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 服务提供者接口
 * @author lin
 * @date 2022/4/10
 */
@RestController
@RequestMapping("/lin/producer")
@RefreshScope
public class ProducerController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/produce/{id}")
    public BaseVo producer(@PathVariable Integer id){
        String mess = String.format("producer【%s】 say hi to u !!!", this.serverPort);
        BaseVo result = new BaseVo();
        result.setId(id);
        result.setCreateTime(new Date());
        result.setMess(mess);
        return result;
    }

}
