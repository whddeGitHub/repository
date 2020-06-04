package com.leyou.item.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.PageResult;
import com.leyou.item.mapper.BrandMapper;
import com.leyou.item.pojo.Brand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/5/29 14:37
 */
@Service
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key) {

        //分页
        Page<Object> result = PageHelper.startPage(page, rows);

        //过滤
        Example example = new Example(Brand.class);
        if (StringUtils.isNotBlank(key)){
            //过滤条件
            example.createCriteria().andLike("name","%"+key+"%").andEqualTo("letter",key.toUpperCase());
        }

        //排序
        if (StringUtils.isNotBlank(sortBy)){
            String order = sortBy + (desc ? " desc":" asc");
            example.setOrderByClause(order);
        }

        //查询
        List<Brand> brandsList = brandMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(brandsList)){
            throw new LyException(ExceptionEnum.BRAND_NOT_FOUND);
        }

        return new PageResult<>(result.getTotal(),brandsList);
    }
}
