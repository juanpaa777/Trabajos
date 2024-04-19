package mx.utng.s28.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EquipoRepositorioTest {

  @Autowired
  private EquipoRepositorio equipoRepositorio;

  @BeforeAll
  public void cleanDatabase() {
    equipoRepositorio.deleteAll();
  }

  @Test
  void canSave() {
    // Crear un equipo
    Equipo equipo = new Equipo(null);
    equipo.setNombre("Equipo Prueba");

    // Guardar el equipo
    equipo = equipoRepositorio.save(equipo);

    // Validar que obtenga un ID
    assertNotNull(equipo.getId());
  }

  @Test
  @DisplayName("Buscar por nombre")
  void canFindByName() {
    String name = "Equipo Prueba";

    Equipo equipo = new Equipo(null);
    equipo.setNombre(name);

    equipoRepositorio.save(equipo);

    Iterable<Equipo> equipos = equipoRepositorio.findByNombre(name);

    assertTrue(equipos.iterator().hasNext());

    Equipo equipoEncontrado = equipos.iterator().next();

    assertEquals(equipo, equipoEncontrado);
  }

}
