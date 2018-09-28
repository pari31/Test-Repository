package area_Of_Triangle;

public class Triangle {
 double base,height;

public double getBase() {
	return base;
}

public void setBase(double b) {
	
	base=(b>0)?b:1;
	//this.base = base;
}

public double getHeight() {
	return height;
}

public void setHeight(double h) {
	height=(h>0)?h:1;
	//this.height = height;
}

public double calcArea() {
	return (base* height)/2;
}

}
