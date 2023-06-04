package tothanhqui2080601394.buoi5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tothanhqui2080601394.buoi5.model.PhongBan;
import tothanhqui2080601394.buoi5.repository.PhongBanRepository;

import java.util.List;

@Service
@Transactional
public class PhongBanService {

    @Autowired
    private PhongBanRepository repo;

    public List<PhongBan> listAll() {
        return repo.findAll();
    }

    public void save(PhongBan product) {
        repo.save(product);
    }

    public PhongBan get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
