package data.structure;

public class Animal {
  private String name;
  private String type;

  public Animal(String name) {
    this.name = name;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Animal{" +
      "name='" + name + '\'' +
      ", type='" + type + '\'' +
      '}';
  }
}
