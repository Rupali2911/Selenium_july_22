package TestNGPrograms;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Day12AnnotationTransformer implements IAnnotationTransformer {
	
	@Override
	public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(TestNGPrograms.day12RetryAnalyzer.class);
	}
}
