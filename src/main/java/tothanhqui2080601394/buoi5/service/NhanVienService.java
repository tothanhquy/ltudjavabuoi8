package tothanhqui2080601394.buoi5.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tothanhqui2080601394.buoi5.model.NhanVien;
import tothanhqui2080601394.buoi5.repository.NhanVienRepository;

@Service
@Transactional
public class NhanVienService {

    @Autowired
    private NhanVienRepository repo;

    public List<NhanVien> listAll() {
        return repo.findAll();
    }

    public void save(NhanVien product) {
        repo.save(product);
    }

    public NhanVien get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
