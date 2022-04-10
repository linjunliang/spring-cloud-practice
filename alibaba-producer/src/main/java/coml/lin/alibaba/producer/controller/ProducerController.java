package coml.lin.alibaba.producer.controller;

import com.lin.vo.BaseVo;
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
@RequestMapping("/lin")
public class ProducerController {

    @GetMapping("/producer/{id}")
    public BaseVo producer(@PathVariable Integer id){
        BaseVo result = new BaseVo();
        result.setId(id);
        result.setCreateTime(new Date());
        return result;
    }

}
