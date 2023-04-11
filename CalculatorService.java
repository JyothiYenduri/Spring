package MathFunctions;

import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorService {
	private MathService ms;
	@Autowired
	public void setMs(MathService ms) {
		this.ms = ms;
	}
	public int add(int a,int b) {
		return ms.add(a, b);
	}
	public int sub(int a,int b) {
		return ms.sub(a, b);
	}
	public int mul(int a,int b) {
		return ms.mul(a, b);
	}
	public int div(int a,int b) {
		return ms.div(a, b);
	}
	
}
