package cartelera.services;

public class HallserviceImpl {
        private final HallRepository hallrRepository;

        @Override
        public List<Hall> findAll() {
            log.info("findAll");
            return hallRepository.findAll();
        }

        @Override
        public Optional<Hall> findById(Long id) {
            log.info("findById {}", id);
            return hallRepository.findById(id);
        }
    }


