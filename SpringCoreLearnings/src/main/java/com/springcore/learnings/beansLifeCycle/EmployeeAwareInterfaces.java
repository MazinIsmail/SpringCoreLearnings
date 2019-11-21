package com.springcore.learnings.beansLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

public class EmployeeAwareInterfaces
		implements ApplicationContextAware, ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
		BeanNameAware, LoadTimeWeaverAware, MessageSourceAware, NotificationPublisherAware, ResourceLoaderAware {

	@Override
	public void setResourceLoader(ResourceLoader arg0) {
// TODO Auto-generated method stub
	}

	@Override
	public void setNotificationPublisher(NotificationPublisher arg0) {
// TODO Auto-generated method stub

	}

	@Override
	public void setMessageSource(MessageSource arg0) {
// TODO Auto-generated method stub
	}

	@Override
	public void setLoadTimeWeaver(LoadTimeWeaver arg0) {
// TODO Auto-generated method stub
	}

	@Override
	public void setBeanName(String arg0) {
// TODO Auto-generated method stub
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
// TODO Auto-generated method stub
	}

	@Override
	public void setBeanClassLoader(ClassLoader arg0) {
// TODO Auto-generated method stub
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
// TODO Auto-generated method stub
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
// TODO Auto-generated method stub
	}
}