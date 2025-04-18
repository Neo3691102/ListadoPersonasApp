public class Persona {
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private static int numeroPersonas = 0;

    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String tel, String email){
        this();
        this.nombre = nombre;
        this.telefono = tel;
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "44556677", "juan@mail.com");
        System.out.println(persona1);
    }
}
