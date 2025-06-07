package org.softrami.springbootmybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.softrami.springbootmybatis.model.Product;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("select * from Product")
    List<Product> findAll();

    @Select("select * from Product where id = #{id}")
    Product findById(@Param("id") int id);

    @Insert("insert into Product (id, name, status) values (#{id},#{name}, #{status})")
    int insert(Product product);

    @Delete("delete from Product where id = #{id}")
    int deleteById(@Param("id") int id);

    @Update("update Product set name = #{name}, status = #{status} where id = #{id}")
    int update(Product product);
}
