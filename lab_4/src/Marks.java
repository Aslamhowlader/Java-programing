
abstract class Mark{
  abstract double getPercentage();

}
class Student_A extends Mark{
    int math;
    int Bangla;
    int English;
     Student_A(int math,int Bangla,int English)
     {
         this.Bangla=Bangla;
         this.English=English;
         this.math=math;
     }
    double getPercentage(){
       return (Bangla+English+math)/3.0;
    }
}
class Student_B extends Mark{
     int math;
     int Bangla;
     int English;
     int CSE;
  Student_B( int math ,int Bangla, int English,int CSE)
  {
      this.Bangla=Bangla;
      this.English=English;
      this.math=math;
      this.CSE=CSE;

  }
    double getPercentage(){
        return (Bangla+English+math+CSE) / 3.0;
    }
}


public class Marks {
    public static void main(String[] args) {

        Mark s1 =new Student_A(70,75,80);
        Mark s2 =new Student_B(65,78,67,59);
        System.out.println("Percentage of Student A:"+s1.getPercentage());
        System.out.println("Percentage of Student B:"+s2.getPercentage());

    }
}
