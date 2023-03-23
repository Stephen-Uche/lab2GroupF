package se.iths.worldfirstwebshop.webshop.repository;
import org.springframework.data.repository.ListCrudRepository;
import se.iths.worldfirstwebshop.webshop.storage.InventoryEntity;

import java.util.List;

public interface InventoryRepository extends ListCrudRepository<InventoryEntity, Long> {


}
