package com.profectus.filters.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profectus.filters.commons.exceptions.EchoException;
import com.profectus.filters.commons.web.request.EchoRequest;
import com.profectus.filters.commons.web.response.Echo;
import com.profectus.filters.service.EchoService;

@RestController("/echo")
public class EchoAPI {

	@Autowired
	private EchoService echoService;

	@RequestMapping(value = { "/test/{name}" })
	public ResponseEntity<Echo> findItemById(@PathVariable("name") String name) throws EchoException {
		Echo echo = echoService.findByName(EchoRequest.builder().echoName(name).build());
		return ResponseEntity.ok(echo);
	}
	/*@RequestMapping(value = { "/test/all" })
	public ResponseEntity<List<Echo>> getAll() throws EchoException {
		List<Echo> echo = echoService.getAllEmployee();
		return ResponseEntity.ok(echo);
	}*/
}
