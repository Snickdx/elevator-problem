class Main {
  public static void main(String[] args) {
    Elevator ele = new Elevator();

    ele.firstFloor();
    System.out.println("Current floor: "+ele.getFloor());
    ele.firstFloor();
    ele.openDoor();
    ele.groundFloor();
    System.out.println("Current floor: "+ele.getFloor());

  }
}