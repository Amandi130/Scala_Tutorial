object scala_3{
    def volume_sphere(r:Double):Double=math.Pi*r*r*r*4/3;

    def main(args:Array[String]):Unit={
        print(volume_sphere(5));
    }
}