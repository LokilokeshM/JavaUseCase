package com.srm.rsc.JavaBabyStepProgram;

public  class BaseClass {
	public int add(int a, int b) {
		return a + b;
		}
		public float divide(int a, int b) {
		return (float) a / b;
		}
		public float squareroot(float a) {
		return (float) Math.sqrt(a);
		}
		public float cuberoot(float a) {
		return (float) Math.cbrt(a);
		}
		public double tan(double d) {
		double radians = Math.toRadians(d);
		return Math.tan(radians);
		}
		public double cos(double d) {
		double radians = Math.toRadians(d);
		return Math.cos(radians);
		}
}
