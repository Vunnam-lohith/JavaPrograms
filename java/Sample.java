class Sample {
  public static void main(String[] args) {
    // distance between 2 points
    int x1, x2, y1, y2;
    x1 = 9;
    y1 = 8;
    x2 = 4;
    y2 = 7;
    double dis;
    dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    System.out.println("Distance b/w 2 points is = " + dis);
  }
}