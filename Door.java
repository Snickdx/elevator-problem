class Door {

  enum door {
    OPEN,//door is open
    CLOSED,//door is closed
  }

  private door status;

  public Door(){
    this.status = door.OPEN;
  }

  public void open(){
    this.status = door.OPEN;
  }

  public void close(){
    this.status = door.CLOSED;
  }

  public boolean isOpen(){
    return this.status == door.OPEN;
  }
}