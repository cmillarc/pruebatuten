package com.prueba.tuten.tuten.dto;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Response.
 *
 * @author
 */
@Data
@NoArgsConstructor
public class Response {

	/** time **/
	@JsonFormat(pattern = "HH:mm:ss")
	private OffsetDateTime time;

	/** timeZone **/
	private String timeZone;

}
