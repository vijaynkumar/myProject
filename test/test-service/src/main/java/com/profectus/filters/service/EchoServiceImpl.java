package com.profectus.filters.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.profectus.filters.commons.exceptions.EchoException;
import com.profectus.filters.commons.web.request.EchoRequest;
import com.profectus.filters.commons.web.response.Echo;
import com.profectus.filters.repository.EchoRepository;
import com.profectus.filters.repository.entity.EchoEntity;

@Service
public class EchoServiceImpl implements EchoService {

	@Autowired
	private EchoRepository echoRepository;

	@Resource(name = "conService")
	private ConversionService conversionService;

	@Override
	public Echo findByName(EchoRequest echoRequest) throws EchoException {
		List<EchoEntity> echos = echoRepository.findByName(echoRequest.getEchoName());
		if (CollectionUtils.isEmpty(echos)) {
			return null;
		}
		return conversionService.convert(echos.get(0), Echo.class);
	}
	
	/*@SuppressWarnings("null")
	@Override
	public List<Echo> getAllEmployee() throws EchoException{
		List<EchoEntity> echos = echoRepository.getAll();
		if (CollectionUtils.isEmpty(echos)) {
			return null;
		}
		List<Echo> echoList = null;
		for(int i = 0; i <echos.size(); i++) {
			echoList.add(conversionService.convert(echos.get(i), Echo.class));
		}
		return echoList;
	}*/

}
