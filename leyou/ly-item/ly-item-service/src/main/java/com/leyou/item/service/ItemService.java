package com.leyou.item.service;

import com.leyou.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/5/11 20:45
 */
@Service
public class ItemService {
    public Item saveItem(Item item){
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
