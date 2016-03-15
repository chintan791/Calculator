
public class Calc {


	
	public Calc(){
		
	}

	
	//Methods for different math calculations
	
public double Addition (double num1, double num2)
{
return num1+num2;	
}
	

public double Subtraction (double num1, double num2)
{
	return (num1-num2);
}

public double Multiplication (double num1, double num2)
{
	return (num1*num2);
}

public double Division (double num1, double num2)
{
	return (num1/num2);
}

public double Modulus (double num1, double num2)
{
	return (num1%num2);
}


public double SingleCalc(double num1, double num2, int num3)
{
	if (num3==1)
		 return Addition(num1,num2);
	
	else if (num3==2)
		 return Subtraction(num1,num2);
	
	else if (num3==3)
		return Multiplication(num1,num2);
	
	else if (num3==4)
		return Division(num1,num2);
	
	else if (num3==5)
		return Modulus(num1,num2);
	
	else return 0.0;
}
}

