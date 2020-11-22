/**
 * Latihan60
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Akatsuki
 */
public class Akatsuki {

    protected String asalDesa;
    protected String Nama;
    protected String Cincin;
    protected String Jutsu;
    protected String Tim;
    protected String ciriKhas;
    protected String Role;

    public Akatsuki(String asalDesa, String Nama, String Cincin, String Jutsu, String Tim, String ciriKhas, String Role) {
        this.asalDesa = asalDesa;
        this.Nama = Nama;
        this.Cincin = Cincin;
        this.Jutsu = Jutsu;
        this.Tim = Tim;
        this.ciriKhas = ciriKhas;
        this.Role = Role;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getCincin() {
        return Cincin;
    }

    public void setCincin(String Cincin) {
        this.Cincin = Cincin;
    }

    public String getJutsu() {
        return Jutsu;
    }

    public void setJutsu(String Jutsu) {
        this.Jutsu = Jutsu;
    }

    public String getTim() {
        return Tim;
    }

    public void setTim(String Tim) {
        this.Tim = Tim;
    }

    public String getCiriKhas() {
        return ciriKhas;
    }

    public void setCiriKhas(String ciriKhas) {
        this.ciriKhas = ciriKhas;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
}