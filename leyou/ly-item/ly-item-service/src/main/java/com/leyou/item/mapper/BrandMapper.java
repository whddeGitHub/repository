package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/5/29 14:36
 */
public interface BrandMapper extends Mapper<Brand> {

    @Insert("insert into tb_category_brand(category_id,brand_id) values(#{cid},#{bid})")
    int saveCategoryBrand(@Param("cid") Long cid, @Param("bid") Long id);

    @Select("select b.* form tb_category cb left join tb_brand b on b.id = cb.brand_id where cb.category_id = #{cid}")
    List<Brand> queryByCategoryId(@Param("cid") Long cid);

}
