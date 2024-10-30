package pl.asseco.builder;

import lombok.Data;
import lombok.NonNull;

@Data
public class Customer {
  private String name;
  private String email;
  @NonNull
  private String nationality;
  private int gender;

  private Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  private Customer(String name, String email, String nationality, int gender) {
    this(name, email);
    this.nationality = nationality;
    this.gender = gender;
  }

  public static Builder.RequiredName builder() {
    Builder builder = new Builder();
    return (name) -> {
      builder.name = name;
      return (email) -> {
        builder.email = email;
        return builder;
      };
    };
  }
  public static class Builder {
    public interface RequiredName {
      RequiredEmail name(String name);
    }
    public interface RequiredEmail {
      Builder email(String email);
    }

    private String name;
    private String email;
    private String nationality;
    private int gender;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder nationality(String nationality) {
      this.nationality = nationality;
      return this;
    }

    public Builder gender(int gender) {
      this.gender = gender;
      return this;
    }

    public Customer build() {
      return new Customer(name, email, nationality, gender);
    }
  }

}
