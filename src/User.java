
public abstract class User {
  private int userId;
  private String firstName;
  private String lastName;
  private String email;
  private String password;

  public User() {
  }

  public User(int userId, String firstName, String lastName, String email, String password) {
      this.userId = userId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.password = password;
  }

  public int getUserId() {
      return userId;
  }

  public abstract void setUserId() {
  }

  public String getFirstName() {
      return firstName;
  }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  public String getLastName() {
      return lastName;
  }

  public void setLastName(String lastName) {
      this.lastName = lastName;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getPassword() {
      return password;
  }

  public void setPassword(String password) {
      this.password = password;
  }

  public boolean Register() {
      return true;
  }

  public boolean Login() {
      return true;
  }

  public boolean UpdateProfile() {
      return true;
  }

  public boolean ResetPassword() {
      return true;
  }
}

public class PropertyOwner extends User {
  @Override
  public void setUserId(int userId) {
    this.userId = userId;
  }
}

public class Tenant extends User {
  @Override
  public void setUserId(int userId) {
    this.userId = userId;
  }
}

