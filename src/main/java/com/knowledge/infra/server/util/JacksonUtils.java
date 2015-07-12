package com.knowledge.infra.server.util;

/**
 * <p>
 * GsonUtils is a utility that help to convert json to object.
 * </p>
 * 
 * @author linggong.meng
 *
 */

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtils {
	private static ObjectMapper jackson = new ObjectMapper();
	
	static{
		jackson.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		jackson.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;
	}

	public static ObjectMapper getJackson() {
		return jackson;
	}

	public static void setJackson(ObjectMapper jackson) {
		JacksonUtils.jackson = jackson;
	}
	
	public static <T> T fromJson(String json, Class<T> clazz){
		try {
			return jackson.readValue(json,clazz);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String toJson(Object obj){
		try {
			return jackson.writeValueAsString(obj);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
//	public static class Test{
//		private String a;
//		private Long c;
//		private Object d;
//		private String mm;
//		
//		public Object getD() {
//			return d;
//		}
//		public void setD(Object d) {
//			this.d = d;
//		}
//		public String getA() {
//			return a;
//		}
//		public void setA(String a) {
//			this.a = a;
//		}
//		public Long getC() {
//			return c;
//		}
//		public void setC(Long c) {
//			this.c = c;
//		}
//		public String getMm() {
//			return mm;
//		}
//		public void setMm(String mm) {
//			this.mm = mm;
//		}
//		
//		
//	}
	
//	public static void main(String [] args) {
//		String test = "{\"a\":\"b\",\"c\":2,\"d\":[1,2,3]}";
//		Test obj = (Test) JacksonUtils.fromJson(test, Test.class);
//		System.out.println(obj.d);
//		System.out.println(JacksonUtils.toJson(obj));
//		
//	}
}
