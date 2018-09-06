package com.formacion.iteracionAPP.dto;

import com.formacion.iteracionAPP.dto.model.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDTO {

	private Status status;
	
	@Override
	public String toString() {
		return this.status.getDescription();
	}
}
