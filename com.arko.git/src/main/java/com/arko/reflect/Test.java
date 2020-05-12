package com.arko.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class myclass = Class.forName(Calculator.class.getName());
		System.out.println(myclass.getName());
		
		//=====construtor names
		Constructor<?>[] constructor = myclass.getConstructors();
		System.out.println(Arrays.toString(constructor));
		
		//===Methods name
		System.out.println(Arrays.toString(myclass.getMethods()));
		
		//====Creating objects using default constructor
		Constructor<?> construc = myclass.getConstructor(null);
		System.out.println(construc.newInstance(null));
		
		//====Creating objects using parameterized constructor
		Constructor<?> construc2 = myclass.getConstructor(int.class,double.class);
		System.out.println(construc2.newInstance(10,50.56));
		
		
		//======calling a method by getter
		Object myobj = construc2.newInstance(10,50.56);
		Method getmethod = myclass.getMethod("getNum", null);
		System.out.println(getmethod.invoke(myobj,null));
		
		//===calling the setter
		Method setmethod = myclass.getMethod("setNum", int.class);
		setmethod.invoke(myobj,1000);
		System.out.println(getmethod.invoke(myobj,null));
		
		//======calling another method
		Method othmethod = myclass.getMethod("sum", int.class,int.class);
		System.out.println(othmethod.invoke(myobj,250,350));
		
		//=====setting a private variable
		Field declaredField = myclass.getDeclaredField("num");
		declaredField.setAccessible(true);
		declaredField.set(myobj, 9999);
		System.out.println(getmethod.invoke(myobj,null));
		
		//=====Accessing annotation
		java.lang.annotation.Annotation[] annotations = myclass.getAnnotations();
		System.out.println(Arrays.toString(annotations));
		MyAnnotation annota = (MyAnnotation) annotations[0];
		System.out.println(annota.val1());
		System.out.println(annota.val2());
		
	}

}
