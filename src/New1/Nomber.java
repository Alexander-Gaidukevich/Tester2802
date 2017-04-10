package New1;

public class Nomber {
    private static int id;
    private String name;
    private String phone;

    public Nomber(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    public int getId() {
        return id;
             }
    public void setId(int id) {
        this.id = id;
             }
    public String getName() {
        return name;
            }
    public void setName(String name) {
        this.name = name;
             }
    public String getPhone() {
        return phone;
             }
    public void setPhone(String phone) {
        this.phone = phone;
             }
    @Override
         public boolean equals(Object o) {
                 if (this == o) return true;
                 if (o == null || getClass() != o.getClass()) return false;
        Nomber nomber = (Nomber) o;
                 if (id != Nomber.id) return false;
                 if (name != null ? !name.equals(nomber.name) :
                         nomber.name != null) return false;
                 return phone != null ? phone.equals(nomber.phone) : nomber.phone == null;
             }
                 @Override
         public int hashCode() {
                 int result = id;
                 result = 31 * result + (name != null ? name.hashCode() : 0);
                 result = 31 * result + (phone != null ? phone.hashCode() : 0);
                 return result;
             }
                 @Override
         public String toString() {
                 return "Record{" +
                         "id=" + id +
                         ", name='" + name + '\'' +
                         ", phone='" + phone + '\'' +
                         '}';
             }
     }


