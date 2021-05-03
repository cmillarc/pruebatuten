package com.prueba.tuten.tuten.service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.prueba.tuten.tuten.dto.Request;
import com.prueba.tuten.tuten.dto.Response;

@Service
public class TutenServiceImpl implements TutenService {

	public static final String UTC = "utc";

	@Override
	public Response getUtcDate(Request request) {
		Response response = new Response();
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String[] splitted = Arrays.stream(request.getInputTime().split(":")).map(String::trim).toArray(String[]::new);
		calendar.set(Calendar.HOUR_OF_DAY, Integer.valueOf(splitted[0]));
		calendar.set(Calendar.MINUTE, Integer.valueOf(splitted[1]));
		calendar.set(Calendar.SECOND, Integer.valueOf(splitted[2]));
		OffsetDateTime offsetDateTime = calendar.getTime().toInstant().atOffset(ZoneOffset.UTC);
		offsetDateTime = offsetDateTime.toInstant().atOffset(ZoneOffset.ofHours(request.getInputHour()));
		offsetDateTime = offsetDateTime.toInstant().atOffset(ZoneOffset.UTC);
		offsetDateTime = offsetDateTime.toInstant().atOffset(ZoneOffset.ofHours(request.getInputHour()));
		response.setTime(offsetDateTime);
		response.setTimeZone(UTC);
		return response;
	}

}
