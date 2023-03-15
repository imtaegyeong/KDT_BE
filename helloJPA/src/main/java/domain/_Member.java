package domain;

import javax.persistence.*;

@Entity
public class _Member {

  @Id
  @Column(name = "member_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String city;
  private String street;
  private String zipcode;

  public Long getId() {
    return id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public _Member(String name, String city, String street, String zipcode) {
    this.name = name;
    this.city = city;
    this.street = street;
    this.zipcode = zipcode;
  }

  public _Member() {

  }

  @Override
  public String toString() {
    return "_Member{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", city='" + city + '\'' +
        ", street='" + street + '\'' +
        ", zipcode='" + zipcode + '\'' +
        '}';
  }
}
