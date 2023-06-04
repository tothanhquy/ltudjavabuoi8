package tothanhqui2080601394.buoi5.model;

import jakarta.persistence.*;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "ma_nv")
    private String ma_nv;

    @Column(name = "ten_nv")
    private String ten_nv;

    @Column(name = "gioi_tinh")
    private String gioi_tinh;
    @Column(name = "noi_sinh")
    private String noi_sinh;

    @ManyToOne
    @JoinColumn(name ="ma_phong", referencedColumnName = "ma_phong")
    private PhongBan phong_ban;

    @Column(name = "luong")
    private int luong;
    public NhanVien() {
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getTen_nv() {
        return ten_nv;
    }

    public void setTen_nv(String ten_nv) {
        this.ten_nv = ten_nv;
    }

    public String getNoi_sinh() {
        return noi_sinh;
    }

    public void setNoi_sinh(String noi_sinh) {
        this.noi_sinh = noi_sinh;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public PhongBan getPhong_ban() {
        return phong_ban;
    }

    public void setPhong_ban(PhongBan phong_ban) {
        this.phong_ban = phong_ban;
    }
    // other getters and setters are hidden for brevity
}
