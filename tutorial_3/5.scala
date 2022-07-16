object scala_5{
    def easy(l:Double):Double=8*l;
    def tempo(l:Double):Double=7*l;
    def main(arg:Array[String]):Unit={
        print("The total running time=")
        print(easy(2)+tempo(3)+easy(2))
    }
}