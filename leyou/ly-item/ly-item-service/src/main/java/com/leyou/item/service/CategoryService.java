package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/5/26 22:32
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByPid(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        List<Category> list = categoryMapper.select(category);
        //查询结果为空，返回404
        if (list == null || list.isEmpty()){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        //if (CollectionUtils.isEmpty(list))
        return list;
    }
}
