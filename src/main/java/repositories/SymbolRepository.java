package repositories;

/**
 * Created by facundov on 19/07/16.
 */
import java.util.List;

import model.Symbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymbolRepository extends JpaRepository<Symbol, Long> {
    List<Symbol> findByName(String name);
    Symbol save(Symbol symbol);
    @Override
    List<Symbol> findAll();
}