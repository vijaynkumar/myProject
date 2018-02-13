/**
 * 
 */
package com.profectus.filters.dao;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.profectus.filters.commons.web.response.Echo;
import com.profectus.filters.repository.entity.EchoEntity;

/**
 * @author Dell
 *
 */
@Component
public class EchoEntityToEchoConverter implements Converter<EchoEntity, Echo> {

	@Override
	public Echo convert(EchoEntity echoEntity) {
		Echo echo = Echo.builder().echoId(echoEntity.getEchoId()).name(echoEntity.getName()).build();
		return echo;
	}
}
