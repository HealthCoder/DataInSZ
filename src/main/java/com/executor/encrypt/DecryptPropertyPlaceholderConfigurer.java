package com.executor.encrypt;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class DecryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
			throws BeansException {

		Properties decryptProp = new Properties();

		Iterator<Entry<Object, Object>> iterator = props.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Object, Object> entry = iterator.next();
			decryptProp.setProperty((String) entry.getKey(), decrypt((String) entry.getValue()));
		}

		super.processProperties(beanFactoryToProcess, decryptProp);
	}

	protected String decrypt(String str) {
		return str.toLowerCase();
	}
}
