package methodoverloading;

class Box {
    double length,breath,height;
//            no argument
    Box(){
        length=breath=height=0;
            }
//            for cube
    Box(double side){
        length=breath=height=side;
    }
//    for cuboid
Box(double l ,double b , double h){
    length=l;
    breath=b;
    height=h;
}

// now to calculate the volume
    public double volume(){
        return length*breath*height;
    }

}
public class contructor_overloading {
    public static void main (String args []){
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube  = new Box(7);

        System.out.println("Volume of mybox1: " + mybox1.volume());
        System.out.println("Volume of mybox2: " + mybox2.volume());
        System.out.println("Volume of mycube: " + mycube.volume());

    }
}
