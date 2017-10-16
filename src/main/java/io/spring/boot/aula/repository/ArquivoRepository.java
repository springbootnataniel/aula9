package io.spring.boot.aula.repository;

import io.spring.boot.aula.entity.Arquivo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
public interface ArquivoRepository extends MongoRepository<Arquivo, String> {
    
}
