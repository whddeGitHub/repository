package com.joydigit.mirror_processor.mapper;

import com.joydigit.mirror_processor.entity.CustomerInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * create by 75442 on 2019/11/29
 */
@Repository
public interface CustomerInfoMapper {
    @Select("select build.targetPrinciple_Id as CustomerId,build.project_Id as ProjectId " +
            "from BuildingEntity build,BindInfo bind where bind.buildingEntity_id = build.id  " +
            "and bind.device_Id = (select id from iot_platform_dev.DeviceInfo where deviceSerialNo = #{deviceId}) limit 1")
    CustomerInfo selectCustomerIdAndProjectIdBydDevice(@Param("deviceId") String deviceId);
}
