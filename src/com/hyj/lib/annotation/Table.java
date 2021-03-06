package com.hyj.lib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据库表名的注解定义
 * 
 * @Author hyj
 * @Date 2016-2-15 下午9:58:05
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
	/**
	 * <pre>
	 * 定义注解里面的初始化值的属性
	 * 如：@Table("user")与@Table(value="user")等同
	 * 	当只有一个属性的时候必须用value()(默认规则)
	 * </pre>
	 * 
	 * @return
	 */
	String value();
}
