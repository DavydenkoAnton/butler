package com.stark.butler.repositories;

import com.stark.butler.entity.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<Device, Long> {
}
