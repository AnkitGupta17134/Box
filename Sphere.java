class Sphere
{
  public static void main(String[] args)
  {
    Scanner jk = new Scanner(System.in);
    System.out.println("Enter radius");
    int r = jk.nextInt();
    double ans = (4/3)*Math.pi*Math.pow(r,3);
    double area = 4*Math.pi*Math.pow(r,2);
    System.out.println("Volume" + ans);
    System.out.println("Surface Area" + area);
    
  }
}
