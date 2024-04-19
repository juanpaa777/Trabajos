package mx.utng.s28.persistence;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import mx.utng.s28.model.Equipo;
import mx.utng.s28.model.Partido;

@DataJpaTest
public class PartidoRepositorioTest {

  @Autowired
  private PartidoRepositorioTest partidoRepositorio;

  @Test
  public void cuandoEncuentroPorId_entoncesRetornaPartido() {
    // Arrange
    Equipo equipo1 = new Equipo(1L); 
    Equipo equipo2 = new Equipo(2L);
    
    Partido partido = new Partido();
    partidoRepositorio.save(partido);
    
    // Act
    Partido encontrado = partidoRepositorio.findById(partido.getId()).get();

    // Assert
    assertThat(encontrado).isEqualTo(partido);
  }

  private Object findById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
  }

  private void save(Partido partido) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }

}
