package tn.esprit.tp_foyer.services;

import tn.esprit.tp_foyer.Entity.Bloc;
import tn.esprit.tp_foyer.Entity.Chambre;
import tn.esprit.tp_foyer.repository.BlockRepository;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(String blocId);
    public Bloc addBloc(Bloc b);
    public void removeBloc(String blocId);
    public Bloc modifybloc(Bloc bloc);
}
