/**
 * 
 */
package com.suraj.mm.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.suraj.mm.dto.LabourDTO;
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

	/**
	 * 
	 * @param machineDto
	 * @return
	 */
	static List<UserMachineMapping> mapListFromMachineDto(MachineDTO machineDto) {
		List<UserMachineMapping> listUserMachin = new ArrayList<UserMachineMapping>();
		for (LabourDTO labours : machineDto.getLabours()) {
			UserMachineMapping mapping = new UserMachineMapping();
			mapping.setMachineId(Long.parseLong(machineDto.getMachineId()));
			mapping.setUserId(Long.parseLong(labours.getLabourId()));
			listUserMachin.add(mapping);
		}
		return listUserMachin;
	}

}
