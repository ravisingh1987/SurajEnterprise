/**
 * 
 */
package com.suraj.mm.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.suraj.mm.dto.LabourDTO;
import com.suraj.mm.dto.MachineDTO;

/**
 * @author Roshan Singh
 * @version 1.0
 */
@Component
public class CommonUtil {
	/**
	 * Method for preparing Machine Dto based on fetched result
	 * @author Roshan Singh
	 * @param objList
	 * @return
	 */
	public MachineDTO prepareMachineDto(List<Object[]> objList) {
		List<LabourDTO> labourDto = new ArrayList<LabourDTO>();
		MachineDTO mdto = new MachineDTO();
		for (Object[] objects : objList) {
			mdto.setMachineId(((BigDecimal)objects[2]).toString());
			mdto.setMachineType((String) objects[6]);
			mdto.setMachineStatus((String) objects[7]);
			mdto.setQuantity(((Integer) objects[8]).toString());
			LabourDTO ldto = new LabourDTO(((BigDecimal) objects[0]).toString(), ((BigDecimal) objects[3]).toString(), ((Integer) objects[4]).toString(),(String)objects[1]);
			labourDto.add(ldto);
		}
		mdto.setLabours(labourDto);
		return mdto;

	}

}
