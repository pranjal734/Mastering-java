package com.basics;

public class FloatEx {
		 
	    public static void main(String[] args) {
	        FloatEx javaPuzzler = new FloatEx();
	        javaPuzzler.doSth();
	    }
	 
	    public void doSth() {
	        float f = 1.2f;
	        if (f >= 1.0) {
	            f = 0.9999999999999f;
	        }
	        InnerClass innerClass = new InnerClass(f);
	        System.out.println(innerClass.getValue());
	    }
	 
	    private class InnerClass {
	 
	        private float value;
	 
	        public InnerClass(float value) {
	            if (value >= 1.0f) {
	                throw new IllegalArgumentException(
	                        "Value can't be greater than 1.0f");
	            }
	 
	            this.value = value;
	        }
	 
	        public float getValue() {
	            return value;
	        }
	    }
	}
	/*My initial expectation was that I would get value 0.9999999999999f as answer.Try it and find the answer. Share your answer and reasoning in comments.

	Posted*/
