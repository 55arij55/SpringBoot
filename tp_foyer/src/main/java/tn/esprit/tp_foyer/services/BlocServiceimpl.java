package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.Entity.Bloc;
import tn.esprit.tp_foyer.repository.BlockRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceimpl implements IBlocService{

    @Autowired
    BlockRepository blocRepository;
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(String blocId) {
        return null;
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return null;
    }

    @Override
    public void removeBloc(String blocId) {

    }

    public Bloc retrieveChambre(String blocId) {
        return blocRepository.findById(blocId).get();
    }
    public Bloc addChambre(Bloc b) {
        return blocRepository.save(b);
    }
    public void removeChambre(String blocId) {
        blocRepository.deleteById(blocId);
    }
    public Bloc modifybloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
