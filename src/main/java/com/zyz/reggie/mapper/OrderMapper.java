package com.zyz.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyz.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}