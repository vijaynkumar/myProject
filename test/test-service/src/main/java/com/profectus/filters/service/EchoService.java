/**
 * 
 */
package com.profectus.filters.service;

import java.util.List;

import com.profectus.filters.commons.exceptions.EchoException;
import com.profectus.filters.commons.web.request.EchoRequest;
import com.profectus.filters.commons.web.response.Echo;

/**
 * @author Dell
 *
 */
public interface EchoService {
	Echo findByName(EchoRequest echoRequest) throws EchoException;
	/*List<Echo> getAllEmployee() throws EchoException; */
}
