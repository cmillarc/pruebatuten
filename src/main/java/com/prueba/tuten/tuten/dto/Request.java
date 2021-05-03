package com.prueba.tuten.tuten.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Response.
 *
 * @author
 */
@Data
@NoArgsConstructor
public class Request {

	/** time **/
	@NotEmpty
	@Pattern(regexp = "^(?:([01]?\\d|2[0-3]):([0-5]?\\d):)?([0-5]?\\d)$", message = "ingrese hora en formato 00:00:00")
	private String inputTime;

	/** inputHour **/
	@NotNull(message = "valor numérico obligatorio")
	private Integer inputHour;

}
