
class Elevator {

  enum floor {
    GROUND,//at ground floor
    FIRST,// at first floor
  }

  
  private floor currentFloor;
  private Door currentDoor;

  public Elevator(){
    this.currentFloor = floor.GROUND;
    this.currentDoor = new Door();
  }

  public int getFloor(){
    if(this.currentFloor == floor.GROUND)
      return 0;
    else
      return 1;
  }

  public void openDoor(){
    if (this.currentDoor.isOpen()){
      System.out.println("Keeping door open");
    }else{
      System.out.println("Opening door");
      this.currentDoor.open();
    }
  }

  public void closeDoor(){
    if(!this.currentDoor.isOpen()){
      System.out.println("Keeping door closed");
    }else{
      System.out.println("Closing door");
      this.currentDoor.open();
    }
  }

  public void firstFloor(){
    if(currentFloor == floor.GROUND){
      System.out.println("Closing door");
      this.currentDoor.close();
      System.out.println("Moving to first floor");
      this.currentFloor = floor.FIRST;
      System.out.println("Opening door");
      this.currentDoor.open();
    }else if(currentFloor == floor.FIRST){
      System.out.println("Already on first floor");
    }
  }

  public void groundFloor(){
    if(this.currentFloor == floor.GROUND){
      System.out.println("Already on ground floor");
    }else if( this.currentFloor == floor.FIRST){
      System.out.println("Closing door");
      this.currentDoor.close();
      System.out.println("Moving to ground floor");
      this.currentFloor = floor.GROUND;
      System.out.println("Opening door");
      this.currentDoor.open();
    }
  }

}