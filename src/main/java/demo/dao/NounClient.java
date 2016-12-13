package demo.dao;

import demo.domain.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static demo.dao.WordDao.NOUN;

/**
 * Created by timge on 12/13/2016.
 */
@FeignClient(NOUN)
public interface NounClient {

    @RequestMapping(value="/", method= RequestMethod.GET)
    Word getWord();

}
