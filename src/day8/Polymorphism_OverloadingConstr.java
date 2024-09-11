package day8;

//User define class
class Box{
	double width, height, depth;
	//default constructor
	Box(){
		width = 0;
		height = 0;
		depth = 0;
	}
	Box(double w ,double h ,double d){     //2
		width = w;
		height = h;
		depth = d;
	}
	Box(double len){
		width = height = depth = len;
	}
	double volume() {
		return(width*height*depth);
	}
}

public class Polymorphism_OverloadingConstr {
	public static void main(String[] args) {
		//Box b = new Box();
		Box b = new Box(10.5, 15.5 , 5.0);
		System.out.println(b.volume());

	}

}
