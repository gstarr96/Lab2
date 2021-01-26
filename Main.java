class Main {
  public static void main(String[] args) {
    int total = 55 * 11;
    double blue = total * .24;
    double brown = total * .13;
    double green = total * .16;
    double orange = total * 0.2;
    double red = total * .13;
    double yellow = total * .14;
    double sum = blue + brown + green + orange + red + yellow;


    System.out.println("M&M Color Count");
    System.out.println("Blue: "+blue);
    System.out.println("Blue: "+brown);
    System.out.println("Blue: "+green);
    System.out.println("Blue: "+orange);
    System.out.println("Blue: "+red);
    System.out.println("Blue: "+yellow);
    System.out.println("Total: "+sum);

    if(blue > brown && red > orange){
      System.out.println("Blue over Brown and Red over Orange");
    }
    if(brown <= green){
      System.out.println("Brown is less than or equal to Green");
    }
    if(sum == total){
      System.out.println("Numbers Add up");
    }
  }
}