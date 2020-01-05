/**
 * 
 */
package com.suraj.mm.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.suraj.mm.dto.MachineDTO;
import com.suraj.mm.model.UserMachineMapping;

/**
 * @author Sysponent
 *
 */
@Mapper(componentModel = "spring")
public interface MachineMapper {
	@Mappings({ @Mapping(expression = "java(Long.parseLong(machineDto.getMachineId()))", target = "machineId"),
			@Mapping(expression = "java(Long.parseLong(machineDto.getLabours().get(0).getLabourId()))", target = "userId") })
	UserMachineMapping mapFromMachineDto(MachineDTO machineDto);

	@InheritInverseConfiguration
	MachineDTO mapFromUserMapping(UserMachineMapping userMachineMapping);

}
